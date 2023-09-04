
import java.util.Scanner;

public class CoefficientStat {
    String flood, halfrole, event, brole;
    Member[] members;
    BonusedMember[] bMembers;

    public CoefficientStat(int membersCount, String halfrole, String event, String bRole) {
        members = new Member[membersCount];
        this.brole = bRole;
        this.halfrole = halfrole;
        this.event = event;
    }

    public CoefficientStat(int membersCount, String halfrole, String bRole) {
        members = new Member[membersCount];
        this.brole = bRole + "Всего:";
        this.halfrole = halfrole + "Всего:";
        this.event = "Всего:";
    }

    public void setMembers(String list, int membersCount) {
        String name, role;
        members = new Member[membersCount];
        Scanner lister = new Scanner(list);
        for (int i = 0; i < membersCount; i++) {
            name = lister.next() + " " + lister.next();
            role = lister.next() + " " + lister.next();
            members[i] = new Member(name, role, lister.nextDouble(), lister.nextDouble());
        }
    }

    public void setVacation(String name) {
        if (members[0] == null) {
            bMembers[findId(name)].vacation = true;
        } else {
            members[findId(name)].vacation = true;
        }

    }

    public int findId(String player) {
        if (bMembers[0] == null) {
            for (int i = 0; i < members.length; i++) {
                if (members[i].name.equals(player) || members[i].role.equals(player)) {
                    return i;
                }
            }
        }
        else {
            for (int i = 0; i < bMembers.length; i++) {
                if (bMembers[i].name.equals(player) || bMembers[i].role.equals(player)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void getResult() {
        String result = "Итоги этой недели представлены ниже. \n" +
                "Просим заметить, что выставленные оценки канона и качества постов имеют максимально субьективный характер, " +
                "вполне возможно, что являются следствием недопонимания или недосказанностей. " +
                "По всем вопросам обращаться в личные сообщения администрации. " +
                "В понятие канон входит не только понимание персонажа, но и качество отыгрыша в общем, " +
                "следовательно, минимум в 80% к нему не относится; тем не менее это значение не должно быть ниже 5. \n\n" +
                "Список игроков и их статистика: \n\n";
        for (int i = 0; i < members.length; i++) {
            if (members[i].vacation) {
                result += members[i].vacationSet();
            } else {
                result += members[i].active(halfrole, brole);
            }
        }
        System.out.println(result);
    }

    public void getResultEvent() {
        String result = "Итоги этой недели с учетом участия в ивенте представлены ниже. \n" +
                "Просим заметить, что выставленные оценки канона и качества постов имеют максимально субьективный характер, " +
                "вполне возможно, что являются следствием недопонимания или недосказанностей. " +
                "По всем вопросам обращаться в личные сообщения администрации. " +
                "В понятие канон входит не только понимание персонажа, но и качество отыгрыша в общем, " +
                "следовательно, минимум в 80% к нему не относится; тем не менее это значение не должно быть ниже 5. \n\n" +
                "Список игроков и их статистика: \n\n";
        for (int i = 0; i < members.length; i++) {
            result += members[i].activeEvent(halfrole, brole, event);
        }
        System.out.println(result);
    }

    public void getResultNoCoef() {
        String result = "Список игроков и их активность (процент сообщений / процент символов) от общего числа символов: \n";
        for (int i = 0; i < members.length; i++) {
            result += members[i].activeNoCoef(flood, halfrole);
        }
        System.out.println(result);
    }

    public String membersToString() {
        String result = "";
        for (int i = 0; i < members.length; i++) {
            result += members[i].memberToString() + "\n\n";
        }
        return result;
    }

    public String bMembersToString() {
        String result = "";
        for (int i = 0; i < bMembers.length; i++) {
            result += bMembers[i].memberToString() + "\n\n";
        }
        return result;
    }

}
