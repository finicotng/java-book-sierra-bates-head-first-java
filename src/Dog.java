public class Dog {

    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.setName("Барт");

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].setName("Фред");
        myDogs[1].setName("Джорж");

        System.out.println("имя последней собаки - " + myDogs[2].getName());

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " сказал Гав!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
