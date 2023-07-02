public class Main {
    public static void main(String[] args) {
        int count = 16;
        String bRole =
                "\uD83D\uDCDD Топ пользователей чата за 8 дней\n" +
                        "[\uD83D\uDCAC символы | ✉ сообщения]:\n" +
                        "1. Вера Басова: 5334 | 5\n" +
                        "2. Alexander Ksiff: 2952 | 10\n" +
                        "3. 'solis 'astrum: 2446 | 6\n" +
                        "4. Ольга Лукина: 2172 | 4\n" +
                        "5. 'rape 'u: 1531 | 4\n" +
                        "6. Mor Kaiser: 1179 | 3\n" +
                        "7. Wei Wuxian: 246 | 1\n" +
                        "8. Zhuanlun Wang: 103 | 3\n" +
                        "\n" +
                        "Всего: 15963 | 36";
        String flood = "";
        String halfR =
                "\uD83D\uDCDD Топ пользователей чата за 8 дней\n" +
                        "[\uD83D\uDCAC символы | ✉ сообщения]:\n" +
                        "1. Вера Басова: 6072 | 8\n" +
                        "2. 'rape 'u: 5722 | 18\n" +
                        "3. 'solis 'astrum: 3328 | 10\n" +
                        "4. Alexander Ksiff: 3140 | 19\n" +
                        "5. Ирина Голобородько: 2523 | 5\n" +
                        "6. Mor Kaiser: 1534 | 3\n" +
                        "7. Lan Wangji: 1043 | 3\n" +
                        "8. Wei Wuxian: 964 | 3\n" +
                        "9. Zhuanlun Wang: 46 | 1\n" +
                        "\n" +
                        "Всего: 24372 | 70\n";
        String event = "\uD83D\uDCDD Топ пользователей чата за 8 дней\n" +
                "[\uD83D\uDCAC символы | ✉ сообщения]:\n" +
                "1. Вера Басова: 20014 | 14\n" +
                "2. Ирина Голобородько: 12240 | 11\n" +
                "3. An Accident: 10738 | 30\n" +
                "4. Alvaro Blacknox: 8129 | 29\n" +
                "5. Стефан Романов: 1659 | 4\n" +
                "6. Alexander Ksiff: 832 | 5\n" +
                "\n" +
                "Всего: 53612 | 93";

        Ash roleplay = new Ash(count, flood, halfR, event, bRole);
        String list =
                        "Wei Wuxian Вэй Усянь 0.6 0 " +
                        "Mor Kaiser Цзян Чэн 0.8 2.5 " +
                        "Ирина Голобородько Цзян Яльли 0.8 1.5 " +

                        "'rape 'u Лань Цзинъи 0.75 2 " +
                        " 'solis 'astrum Лань Сичень 0.75 0 " +
                        "Lan Wangji Лань Ванцзи 0.7 2 " +

                        "Николай Кефер Цзинь Лин 0.85 0 " +
                        "Вера Басова Цзинь Цзисюань 0.75 0 " +
                        "Лилинетт Блэйк Мо Сюаньюй 0.75 1 " +

                        "Ольга Лукина Не Минцзюэ 0.7 0 " +

                        "Амира Шварц Вэнь Нин 0.7 0 " +

                        "Стефан Романов Сяо Синчень 0.75 0 " +
                        "An Accident А-Цин Цин 0.8 0 " +

                        "Alvaro Blacknox Сюэ Ян 0.65 3 " +
                        "Alexander Ksiff Цзинь Гуанъяо 0.7 4 " +
                        "Zhuanlun Wang Чжуаньлун Ван 1 4 ";

        roleplay.setMembers(list, count);

        //текущие отпуска
        roleplay.setVacation("Вэнь Нин");
        roleplay.setVacation("Цзинь Лин");

        //итоги
        roleplay.getResultEvent();
    }
}