class Animal3 {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal3 {
    void bark() {
        System.out.println("barking");
    }
}

class Cat extends Animal3 {
    void sound() {
        System.out.println("meow");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();     // inherited
        d.bark();

        Cat c = new Cat();
        c.eat();     // inherited
        c.sound();
    }
}
