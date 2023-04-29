public class Main {
    public static void main(String[] args) {
        int count = 13;
        String flood = "";
        String halfR = "\uD83D\uDCDD Топ пользователей чата за 7 дней\n" +
                "[\uD83D\uDCAC символы | ✉ сообщения]:\n" +
                "1. Стинг Фауст: 8016 | 54\n" +
                "2. Амира Шварц: 6479 | 60\n" +
                "3. Tachihara Michuzou: 5103 | 25\n" +
                "4. Zhuanlun Wang: 3055 | 34\n" +
                "5. An Accident: 3012 | 14\n" +
                "6. Wen Xu: 1932 | 8\n" +
                "7. Alexander Ksiff: 45 | 5\n" +
                "\n" +
                "Всего: 27642 | 200";
        String event = "\uD83D\uDCDD Топ пользователей чата за 7 дней\n" +
                "[\uD83D\uDCAC символы | ✉ сообщения]:\n" +
                "1. Tachihara Michuzou: 4525 | 166\n" +
                "2. Alexander Ksiff: 3875 | 150\n" +
                "3. June Vibe: 3533 | 117\n" +
                "4. Zhuanlun Wang: 2172 | 65\n" +
                "5. Амира Шварц: 1956 | 86\n" +
                "6. Николай Кефер: 1510 | 39\n" +
                "7. 'rape 'u: 811 | 29\n" +
                "8. Alvaro Blacknox: 627 | 10\n" +
                "9. Wen Xu: 236 | 14\n" +
                "10. An Accident: 201 | 14\n" +
                "11. Лилинетт Блэйк: 86 | 4\n" +
                "\n" +
                "Всего: 19532 | 694";
        Ash roleplay = new Ash(count, flood, halfR, event);
        String list =
                "Tachihara Michuzou Вэй Усянь 0.6 4 " +

                        "June Vibe Лань Сычжуй 0.65 0 " +
                        "'rape 'u Лань Цзинъи 0.65 0 " +

                        "Николай Кефер Цзинь Лин 0.65 0 " +
                        "Лилинетт Блэйк Мо Сюаньюй 0.65 0 " +

                        "Юрий Камышатник Не Хуайсан 0.65 0 " +

                        "Wen Xu Вэнь Сюй 0.77 1 " +
                        "Амира Шварц Вэнь Нин 0.7 2 " +

                        "Стефан Романов Сяо Синчень 0.65 0 " +
                        "An Accident А-Цин Цин 0.75 4 " +

                        "Alvaro Blacknox Сюэ Ян 0.65 3 " +
                        "Alexander Ksiff Цзинь Гуанъяо 0.7 4 " +
                        "Zhuanlun Wang Чжуаньлун Ван 1 4 ";

        roleplay.setMembers(list, count);

        //текущие отпуска
        roleplay.setVacation("Сяо Синчень");

        //итоги
        roleplay.getResultEvent();
    }
}