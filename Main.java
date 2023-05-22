public class Main {
    public static void main(String[] args) {
        int count = 13;
        String bRole = "\uD83D\uDCDD Топ пользователей чата за 6 дней\n" +
                "[\uD83D\uDCAC символы | ✉ сообщения]:\n" +
                "1. Alexander Ksiff: 2566 | 16\n" +
                "2. Mor Kaiser: 2338 | 12\n" +
                "3. Zhuanlun Wang: 2134 | 11\n" +
                "\n" +
                "Всего: 7038 | 39";
        String flood = "";
        String halfR = "\uD83D\uDCDD Топ пользователей чата за 7 дней\n" +
                "[\uD83D\uDCAC символы | ✉ сообщения]:\n" +
                "1. Николай Кефер: 14459 | 53\n" +
                "2. Alexander Ksiff: 9903 | 68\n" +
                "3. 'rape 'u: 2275 | 16\n" +
                "4. Zhuanlun Wang: 1536 | 10\n" +
                "5. Амира Шварц: 250 | 1\n" +
                "\n" +
                "Всего: 28423 | 148";
        String event = "";
        Ash roleplay = new Ash(count, flood, halfR, event, bRole);
        String list =
                        "Tachihara Michuzou Вэй Усянь 0.75 0 " +
                        "Mor Kaiser Цзян Чэн 0.8 4 " +
                        "Bohemian Rhapsody Цзян Яньли 0.7 1 " +

                        "'rape 'u Лань Цзинъи 0.65 1 " +

                        "Николай Кефер Цзинь Лин 0.8 3 " +
                        "Лилинетт Блэйк Мо Сюаньюй 0.75 0 " +

                        "Wen Xu Вэнь Сюй 0.7 1 " +
                        "Амира Шварц Вэнь Нин 0.7 1 " +

                        "Стефан Романов Сяо Синчень 0.8 0 " +
                        "An Accident А-Цин Цин 0.8 4 " +

                        "Alvaro Blacknox Сюэ Ян 0.65 3 " +
                        "Alexander Ksiff Цзинь Гуанъяо 0.7 4 " +
                        "Zhuanlun Wang Чжуаньлун Ван 1 4 ";

        roleplay.setMembers(list, count);

        //текущие отпуска
        roleplay.setVacation("Вэй Усянь");

        //итоги
        roleplay.getResult();
    }
}