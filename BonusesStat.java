import java.util.Scanner;

public class BonusesStat {
    String halfrole, event, brole;
    BonusedMember[] bMembers;

    public BonusesStat(int membersCount, String halfrole, String event, String bRole) {
        bMembers = new BonusedMember[membersCount];
        this.brole = bRole;
        this.halfrole = halfrole;
        this.event = event;
    }

    public BonusesStat(int membersCount, String halfrole, String bRole) {
        bMembers = new BonusedMember[membersCount];
        this.brole = bRole + "Всего:";
        this.halfrole = halfrole + "Всего:";
        this.event = "Всего:";
    }

    public void setMembers(String list, int membersCount) {
        String name, role;
        bMembers = new BonusedMember[membersCount];
        Scanner lister = new Scanner(list);
        for (int i = 0; i < membersCount; i++) {
            name = lister.next() + " " + lister.next();
            role = lister.next() + " " + lister.next();
            bMembers[i] = new BonusedMember(name, role, lister.nextDouble(), lister.nextDouble(), lister.nextDouble(), halfrole, brole, event);
        }
    }

    public void setVacation(String name) {
        bMembers[findId(name)].vacation = true;
    }

    public int findId(String player) {
        for (int i = 0; i < bMembers.length; i++) {
            if (bMembers[i].name.equals(player) || bMembers[i].role.equals(player)) {
                return i;
            }
        }
        return -1;
    }

    public void getResult() {
        String result = "Итоги этой недели представлены ниже. \n" +
                "Просим заметить, что комментарии и коэффициенты не имеют оценочного характера, " +
                "это лишь замечания и похвала сравнительно с общим числом игроков или с обычным поведением отдельного игрока. " +
                "По всем вопросам обращаться в личные сообщения администрации. " +
                "Список игроков и их статистика: \n" +
                "*формат:  итоги | коэф. за ивент беседу | коэф. за полуролевую беседу | коэф. за ролевую беседу: \n\n";
        for (int i = 0; i < bMembers.length; i++) {
            result += bMembers[i].getResult();
        }
        System.out.println(result);
    }

    public String bMembersToString() {
        String result = "";
        for (int i = 0; i < bMembers.length; i++) {
            result += bMembers[i].memberToString() + "\n\n";
        }
        return result;
    }

}


