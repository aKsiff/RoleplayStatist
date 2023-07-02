import java.util.Scanner;

public class Member {
    private static final String warning = " - не удовлетворяет.    !!! Пред за неактив !!!";
    String role, name, firstname;
    int messages, symbols;
    boolean vacation;

    double canon, coef, plot, eventCoef;

    public Member(String name, String role, double canon, double plot) {
        this.role = role;
        this.name = name;
        this.firstname = name.substring(0, name.indexOf(" "));
        this.coef = canon * 1.2 + plot / 4;
        this.plot = plot;
        this.canon = (canon * 10);
        this.vacation = false;
        this.eventCoef = canon;
    }

    public String activeNoCoef(String floodMess, String roleMess) {
        int flood_m, role_m, flood_s, role_s;
        double symbols_stat, messages_stat;
        StringBuilder result;


        Scanner flood = new Scanner(floodMess);
        while (true) {
            String player_f = flood.next();
            if (player_f.equals(firstname)) {
                flood.next();
                flood_s = flood.nextInt();
                flood.next();
                flood_m = flood.nextInt();
                break;

            }
            if (player_f.equals("Всего:")) {
                flood_m = 0;
                flood_s = 0;
                break;
            }
        }
        flood.close();
        Scanner halfrole = new Scanner(roleMess);
        while (true) {
            String player_h = halfrole.next();
            if (player_h.equals(firstname)) {
                halfrole.next();
                role_s = halfrole.nextInt();
                halfrole.next();
                role_m = halfrole.nextInt();
                break;
            }
            if (player_h.equals("Всего:")) {
                role_m = 0;
                role_s = 0;
                break;
            }
        }
        halfrole.close();

        messages = role_m;
        symbols = role_s;

        result = new StringBuilder(role + " | " + name + "\nПроцент флуда (символы | сообщения): ");
        symbols_stat = (double) flood_s / (double) (flood_s + role_s);
        if (String.valueOf(symbols_stat).length() >= 4) {
            symbols_stat = Double.valueOf(String.valueOf(symbols_stat).substring(0, 4));
        }
        messages_stat = (double) flood_m / (double) (flood_m + role_m);
        if (String.valueOf(messages_stat).length() >= 4) {
            messages_stat = Double.valueOf(String.valueOf(messages_stat).substring(0, 4));
        }
        result.append(" " + symbols_stat + " | " + messages_stat + "\nстатистика в п/р: " + role_m + " | " + role_s + "\nактивность: ");
        if (messages_stat > 0.6 && symbols_stat > 0.5 || role_m < 15) {
            result.append(warning);
        }
        result.append("\n" + "канон: ");
        if (messages_stat > 0.6 && symbols_stat > 0.5 || role_m < 15) {
            result.append("не учитывается");
        }
        result.append("\nучастие в сюжете: \n\n");

        return result.toString();
    }

    public String active(String roleMess, String bigRole) {
        String result;
        messages = setMessages(roleMess) + setMessages(bigRole);

        if (this.vacation) {
            return role + " | " + name + " | ОТПУСК!!!\n" + "Актив: " + messages + "\nКомментарий: \n\n";
        }

        if (messages == 0) {
            return role + " | " + name + " | " + messages + warning + "\n\n";
        }
        result = role + " | " + name + " | " + messages + "\nКоэффициент: " + (double) Math.round(coef * 100) / 100 + "\nКанон: " + canon
                + "/10 \nАктивность в сюжете: " + (int) plot + "/4 \nИтог: " + Math.round(messages * coef);

        if (messages * coef < 15) {
            result += warning;
        }
        result += "\nКомментарий: \n\n";

        return result;
    }

    public String activeEvent(String roleMess, String bifRole, String eventMess) {
        String result;

        messages = setMessages(roleMess) + setMessages(bifRole);
        int messages_e = setMessages(eventMess);

        if (vacation) {
            return role + " | " + name + " | ОТПУСК!!!\n" + "Актив: " + (messages + messages_e) + "\nКомментарий: \n\n";
        }

        if (messages == 0 && messages_e == 0) {
            return role + " | " + name + " | " + (messages + messages_e) + warning + "\n\n";
        }

        result = role + " | " + name + " | " + messages + "\nКоэффициент: " + (double) Math.round(coef * 100) / 100 + "\nКанон: " + canon
                + "/10 \nАктивность в сюжете: " + (int) plot + "/4 \nАктивность в ивенте: " + messages_e + "\nИтог: " + Math.round(messages * coef + messages_e * eventCoef);

        if (messages * coef + messages_e * eventCoef < 15) {
            result += warning;
        }
        result += "\nКомментарий: \n\n";

        return result;
    }

    public String vacationSet() {
        return role + " | " + name + " | ОТПУСК!!!\n" + "Актив: " + messages + " | " + symbols + "\nКомментарий: \n\n";
    }

    public String memberToString() {
        return "\nимя: " + name + "\n_имя_: " + firstname + "\nроль: " + role + "\nактив: " + messages + " | " + symbols;
    }

    private int setMessages(String stats) {
        Scanner enters = new Scanner(stats);
        while (true) {
            String player_h = enters.next();
            if (player_h.equals(firstname)) {
                enters.next();
                enters.nextInt();
                enters.next();
                return enters.nextInt();
            }
            if (player_h.equals("Всего:")) {
                return 0;
            }
        }
    }
}
