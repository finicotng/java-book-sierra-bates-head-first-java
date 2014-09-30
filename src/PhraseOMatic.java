public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"пиписька", "уиии", "эй, ты"};

        String[] wordListTwo = {"иииии", "смотри", "ты", "привет", "а-ну"};

        String[] wordListThree = {"с какого района?", "сюда подошел", "кто по жизни?"};

        //сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //генерируем три случайные числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println(phrase);
    }
}
