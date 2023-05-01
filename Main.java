public class Main {
    public static void main(String[] args) {
        int count = 15;
        String flood = "";
        String halfR = "\uD83D\uDCDD Топ пользователей чата за 7 дней\n" +
                "[\uD83D\uDCAC символы | ✉ сообщения]:\n" +
                "1. Tachihara Michuzou: 14026 | 61\n" +
                "2. Zhuanlun Wang: 11030 | 75\n" +
                "3. An Accident: 10078 | 51\n" +
                "4. Mor Kaiser: 2474 | 11\n" +
                "5. June Vibe: 2455 | 15\n" +
                "6. Амира Шварц: 1724 | 12\n" +
                "7. 'rape 'u: 1660 | 19\n" +
                "8. Alexander Ksiff: 181 | 10\n" +
                "\n" +
                "Всего: 43628 | 254";
        String event = "\uD83D\uDCDD Топ пользователей чата за 5 дней\n" +
                "[\uD83D\uDCAC символы | ✉ сообщения]:\n" +
                "1. Alexander Ksiff: 7079 | 46\n" +
                "2. Alvaro Blacknox: 5900 | 30\n" +
                "3. Лилинетт Блэйк: 2869 | 16\n" +
                "4. June Vibe: 2789 | 10\n" +
                "5. 'rape 'u: 1343 | 5\n" +
                "6. Tachihara Michuzou: 518 | 2\n" +
                "\n" +
                "Всего: 20498 | 109";
        Ash roleplay = new Ash(count, flood, halfR, event);
        String list =
                        "Tachihara Michuzou Вэй Усянь 0.6 4 " +
                        "Mor Kaiser Цзян Чэн 0.8 0 " +
                        "Bohemian Rhapsody Цзян Яньли 0.7 0 " +

                        "Unordnungs Begleiter Лань Сичень 0.7 0 " +
                        "June Vibe Лань Сычжуй 0.7 0 " +
                        "'rape 'u Лань Цзинъи 0.6 0 " +

                        "Николай Кефер Цзинь Лин 0.75 4 " +
                        "Лилинетт Блэйк Мо Сюаньюй 0.75 4 " +

                        "Юрий Камышатник Не Хуайсан 0.65 0 " +

                        "Wen Xu Вэнь Сюй 0.7 1 " +
                        "Амира Шварц Вэнь Нин 0.7 1 " +

                        "Стефан Романов Сяо Синчень 0.65 0 " +
                        "An Accident А-Цин Цин 0.75 4 " +

                        "Alvaro Blacknox Сюэ Ян 0.65 3 " +
                        "Alexander Ksiff Цзинь Гуанъяо 0.7 4 " +
                        "Zhuanlun Wang Чжуаньлун Ван 1 4 ";

        roleplay.setMembers(list, count);

        //текущие отпуска


        //итоги
        roleplay.getResultEvent();
    }
}