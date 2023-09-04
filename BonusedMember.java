import java.util.Scanner;

public class BonusedMember {
    private static final String warning = "";
    static final int bareMinimum = 25;
    static final double basicCoef = 1;
    String role, name, firstname;
    String halfR, event, bigR;
    int messages, symbols;
    boolean vacation;
    double canonBonuses, plotBonuses, otherBonuses;


    public BonusedMember(String name, String role, double canonBonuses, double plotBonuses, double otherBonuses, String halfR, String bigR, String event) {
        this.role = role;
        this.name = name;
        this.firstname = name.substring(0, name.indexOf(" "));
        this.halfR = halfR;
        this.bigR = bigR;
        this.event = event;
        this.vacation = false;
        this.canonBonuses = canonBonuses;
        this.plotBonuses = plotBonuses;
        this.otherBonuses = otherBonuses;
        this.messages = setMessages(halfR) + setMessages(bigR) + setMessages(event);
    }

    public String getResult() {
        double eventCoef = 0.75 + (canonBonuses + 0.4) * 0.6 + (plotBonuses + 0.4) * 0.1 + (otherBonuses + 0.4) * 1.2 - 1.2; //здесь были бы квадратичные формулы (наверное, либо в конструкторе)
        double halfRCoef = 0.9 + (canonBonuses + 0.4) * 1.25 + (plotBonuses + 0.4) * 1.5 + (otherBonuses + 0.4) - 1.2; // те самые цифры которые стоит обсудить с яном
        double roleCoef = 1.3 + (canonBonuses + 0.4) + (plotBonuses + 0.4) * 0.8 + (otherBonuses + 0.4) - 1.2;
        this.messages = (int) (setMessages(halfR) * halfRCoef + setMessages(event) * eventCoef + setMessages(bigR) * roleCoef);
        StringBuilder result = new StringBuilder(role + " | " + name + " | " + messages + " | " + String.format("%.2f",eventCoef) + " | "
                + String.format("%.2f",halfRCoef) + " | " + String.format("%.2f", roleCoef) + "\nБонусы за качество постов и канон: ");
        if (canonBonuses > 0) {
            result.append("Присутствуют, хвалим.");
        } else {
            result.append("Отсутсвуют. ");
            if (canonBonuses < 0) {
                result.append("Просьба обратиться в личные обращения администрации.");
            }
        }
        result.append("\nБонусы за участие в сюжете и продвижение игры: ");
        if (plotBonuses > 0) {
            result.append("Присутствуют, хвалим.");
        } else {
            result.append("Отсутсвуют.");
            if (plotBonuses < 0) {
                result.append(" Просьба задуматься об участии в сюжете. За вопросами - к администрации.");
            }
        }
        result.append("\nПрочие бонусы и иные замечания: ");
        if (messages >= bareMinimum) {
            result.append("Актив удовлетворяющий. Продолжайте в том же духе!");
            if (this.vacation) {
                result.append(" Отпуск не засчитывается. У вас есть лишняя неделя.");
            }
        } else {
            if (this.vacation) {
                result.append("Отпуск. ");
            } else {
                result.append("Актив неудовлетворяющий, выдается пред. !!!!!!!!!!!!");
            }
        }
        result.append("\n\n");
        return result.toString();
    }

    public String getResult(String halfR, String bRole) {
        double eventCoef = 0.8 + canonBonuses + plotBonuses * 0.1 + otherBonuses * 1.25; //здесь были бы квадратичные формулы (наверное, либо в конструкторе)
        double halfRCoef = 1 + canonBonuses * 1.25 + plotBonuses * 1.5 + otherBonuses; // те самые цифры которые стоит обсудить с яном
        double roleCoef = 1.3 + canonBonuses + plotBonuses * 0.1 + otherBonuses * 1.25;
        this.messages = (int) (setMessages(halfR) * halfRCoef + setMessages(role) * roleCoef);
        StringBuilder result = new StringBuilder(role + " | " + name + " | " + messages + " | "
                + halfRCoef + " | " + roleCoef + "\nБонусы за качество постов и канон: ");
        if (canonBonuses > 0) {
            result.append("Присутствуют, хвалим.\n");
        } else {
            result.append("Отсутсвуют, просьба обратиться в личные обращения администрации.\n");
        }
        result.append("Бонусы за участие в сюжете и продвижение игры: ");
        if (plotBonuses > 0) {
            result.append("Присутствуют, хвалим.\n");
        } else {
            result.append("Отсутсвуют, просьба задуматься об участии в сюжете. За вопросами - к администрации.\n");
        }
        result.append("Прочие бонусы и иные замечания: \n");
        if (this.vacation || messages > bareMinimum) {
            result.append("Актив удовлетворяющий. Продолжайте в том же духе! \n\n");
            if (this.vacation) {
                result.append("Отпуск не засчитывается. У вас есть лишняя неделя.\n\n");
            }
        } else {
            result.append("Актив неудовлетворяющий, выдается пред. !!!!!!!!!!!!\n\n");
        }
        return result.toString();
    }

    /* че вообще делает метод
    что я от него хочу
    он парсит сообщения из трех бесед
    при этом если одно из сообщений пустое - возвращает ноль //////////// сделано
    у него есть сообщения, он создает коэффициент
    коэффициент задается в конструкторе
    или нет
    каждая беседа считается отдельно как именно посмотреть в голосовом, то есть коэффициент плавающий
        было бы круто сделать функцию коэффициента канона для ивента квадратичной,
        как и коэф сюжета - в полуролевой и ролевой (можно разный)
        но это детали
    перемножает три беседы на соответсвующий коэффициент, складывает и выводит
    при низком показателе каждого из коэфов выводить соответсвующее сообщение в комментарий. если актива мало (условное значение) -
            его добавлять тоже. если отпуск - "ждем возвращения из отпуска". похвала за высокие показатели
     */


    public String vacationSet() {
        return role + " | " + name + " | ОТПУСК!!!\n" + "Актив: " + messages + " | " + symbols + "\nКомментарий: \n\n";
    }

    public String memberToString() {
        return "\nимя: " + name + "\n_имя_: " + firstname + "\nроль: " + role + "\nактив: " + messages;
    }

    private int setMessages(String stats) {
        Scanner enters = new Scanner(stats);
        while (enters.hasNext()) {
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
        return 0;
    }
}
