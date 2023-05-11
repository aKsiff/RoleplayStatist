public class Main {
    public static void main(String[] args) {
        int count = 14;
        String bRole = "";
        String flood = "";
        String halfR = "";
        String event = "";
        Ash roleplay = new Ash(count, flood, halfR, event, bRole);
        String list =
                        "Tachihara Michuzou Вэй Усянь 0.75 0 " +
                        "Mor Kaiser Цзян Чэн 0.8 3 " +
                        "Bohemian Rhapsody Цзян Яньли 0.7 1 " +

                        "June Vibe Лань Сычжуй 0.7 0 " +
                        "'rape 'u Лань Цзинъи 0.6 0 " +

                        "Николай Кефер Цзинь Лин 0.75 0 " +
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

        //итоги
        roleplay.getResultEvent();
    }
}