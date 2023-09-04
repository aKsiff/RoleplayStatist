public class Main {
    public static void main(String[] args) {
        int count = 14;
        String bRole =
                "\uD83D\uDCDD Топ пользователей чата за 7 дней\n" +
                        "[\uD83D\uDCAC символы | ✉ сообщения]:\n" +
                        "1. 자살 살자: 11640 | 11\n" +
                        "2. Ирина Голобородько: 8042 | 7\n" +
                        "3. 약사 사약: 4978 | 3\n" +
                        "4. Mor Kaiser: 4324 | 6\n" +
                        "5. Alexander Ksiff: 3026 | 9\n" +
                        "6. Zhuanlun Wang: 1627 | 11\n" +
                        "7. Yor Hunter: 812 | 1\n" +
                        "\n" +
                        "Всего: 34449 | 48";
        String halfR =
                "\uD83D\uDCDD Топ пользователей чата за 7 дней\n" +
                        "[\uD83D\uDCAC символы | ✉ сообщения]:\n" +
                        "1. 자살 살자: 29081 | 229\n" +
                        "2. 약사 사약: 15542 | 98\n" +
                        "3. Mor Kaiser: 15530 | 119\n" +
                        "4. Ирина Голобородько: 8979 | 95\n" +
                        "5. Лилинетт Блэйк: 7791 | 63\n" +
                        "6. 'rape 'u: 6085 | 56\n" +
                        "7. Юи Юн: 4665 | 47\n" +
                        "8. Yor Hunter: 4274 | 15\n" +
                        "9. Alexander Ksiff: 2248 | 58\n" +
                        "10. An Accident: 2151 | 17\n" +
                        "11. Настя Вавилова: 1520 | 21\n" +
                        "12. Zhuanlun Wang: 1104 | 20\n" +
                        "13. Амира Шварц: 48 | 2\n" +
                        "\n" +
                        "Всего: 99018 | 840";
        String event = "Всего: 34449 | 48";

        BonusesStat roleplay = new BonusesStat(count, halfR, bRole);
        String list = // имя роль -- канон сюжет другое

                "Mor Kaiser Цзян Чэн " +
                        "0.2 0.1 -0.1 " +
                        "Ирина Голобородько Цзян Яльли " +
                        "-0.1 0.3 -0.2 " +

                        "'rape 'u Лань Цзинъи " +
                        "0.1 -0.1 -0.5 " +
                        "Настя Вавилова Лань Сычжуй " +
                        "0.2 0.1 0.1 " +
                        "자살 살자 Лань Сичень " +
                        "0.1 0.5 -0.4 " +

                        "약사 사약 Цзинь Лин " +
                        "0.3 0.5 0.3 " +
                        "Юи Юн Цинь Су " +
                        "0 0 0 " +
                        "Лилинетт Блэйк Мо Сюаньюй " +
                        "0.3 0.5 0 " +

                        "Yor Hunter Не Минцзюэ " +
                        "-0.1 0.2 0.2 " +

                        "Стефан Романов Сяо Синчень " +
                        "0 0 0 " +
                        "An Accident А-Цин Цин " +
                        "0.3 0 0 " +

                        "Alvaro Blacknox Сюэ Ян " +
                        "0 0 0 " +
                        "Alexander Ksiff Цзинь Гуанъяо " +
                        "0 0 0 " +
                        "Zhuanlun Wang Чжуаньлун Ван " +
                        "0 0 0 ";

        roleplay.setMembers(list, count);

        //текущие отпуска
        roleplay.setVacation("Лань Сычжуй");

        //итоги
        roleplay.getResult();


        //System.out.println(roleplay.bMembersToString());
    }
}