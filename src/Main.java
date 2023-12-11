import java.util.Scanner;
class Character {
    public int miska;
    public int soc;
    public String name;
    public Character(String name) {
        soc = 1;
        miska = 0;
        this.name = name;
    }

}
class Container {
    int soc_delta;
    int miska_delta;
    public Container(int soc_delta, int miska_delta) {
        this.soc_delta = soc_delta;
        this.miska_delta = miska_delta;
    }

    public int getSoc_delta() {
        return soc_delta;
    }

    public int getMiska_delta() {
        return miska_delta;
    }
}
class Story1 {

    public void story1_begin() {
        Scanner in = new Scanner(System.in);
        System.out.println("Какой-то дикий человек унижает великую партию в интернете. Варианты дейсвия:");
        System.out.println("1) Присоединиться к нему");
        System.out.println("2) Да это наверняка подросток, побесится и успокоится");
        System.out.println("3) Уничтожить сначала его оскорблениями, а потом его город орбитальным ударом");
    }

    public Container story1_cheker() {
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if(choice == 1){
            int a = -1000000;
            int b = -1000;
            System.out.println("Партия не доволен тобой! Нефритовый стержень, УДАР! Ваш город быть пепел через час!");
            return new Container(a,b);
        } else if (choice == 2) {
            int a = 0;
            int b = 0;
            System.out.println("КАК ВЫ МОЖЕТЕ СИДЕТЬ ПРОСТО ТАК ПОКА ПАРТИЮ ПОЛИВАЮТ ГРЯЗЬЮ?");
            return new Container(a,b);
        } else if (choice == 3) {
            int a = 10000;
            int b = 15;
            System.out.println("Партия гордость тобой! Давать вам большой бонус и премия");
            return new Container(a,b);
        }
        return new Container(0,0);
    }
}

class Story2 {
    public void story2_begin() {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы видите как в метро кто-то ехал с картиной Маузедуна и из-за того что он уснул ее уронили. Варианты действий:");
        System.out.println("1) Растоптать эту картину");
        System.out.println("2) Вызвать Полицию");
        System.out.println("3) Поднять, вычистить картину, а владельца уничтожить орбитальным ударом");
    }

    public Container story2_cheker() {
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice == 1) {
            int a = -1000000;
            int b = -1000;
            System.out.println("Партия не доволен тобой! Нефритовый стержень, УДАР! Ваш город быть пепел через час!");
            return new Container(a, b);
        } else if (choice == 2) {
            int a = 15;
            int b = 0;
            System.out.println("Хорошо что вы хотя бы не остались в стороне");
            return new Container(a, b);
        } else if (choice == 3) {
            int a = 10000;
            int b = 15;
            System.out.println("Партия гордость тобой! Давать вам большой бонус и премия");
            return new Container(a, b);
        }
        return new Container(0, 0);

    }
}


    public class Main {
        public static Story1 story1;
        public static Character manager;

        public static void main(String[] args) {
            //При поддержке ChatGPT, методички, Перньей силы. Представляю:
            Scanner in = new Scanner(System.in);
            Story1 story1 = new Story1();
            Story2 story2 = new Story2();
            System.out.println("Вы житель ВЕЛИКОГО КИТАЯ. Все ОБЯЗАНО делаться во имя партии. Введи свое имя:");
            String name = in.next();
            manager = new Character(name);
            story1.story1_begin();
            Container result = story1.story1_cheker();
            manager.soc += result.getSoc_delta();
            manager.miska += result.getMiska_delta();
            System.out.println("Ваш социальный рейтинг: " + manager.soc);
            System.out.println("Дополнительные миски риса: " + manager.miska);
            story2.story2_begin();
            Container result1 = story2.story2_cheker();
            manager.soc += result1.getSoc_delta();
            manager.miska += result1.getMiska_delta();
            System.out.println("Ваш социальный рейтинг: " + manager.soc);
            System.out.println("Дополнительные миски риса: " + manager.miska);
        }
    }

