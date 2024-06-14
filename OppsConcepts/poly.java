package OppsConcepts;

public class poly {
    void makeSound(){
        System.out.println("make sound");
    }
}


class Dog extends poly {
    @Override
    void makeSound(){
        System.out.println("Dog sound");
    }
}
class Cat extends poly {
    @Override
    void makeSound(){
        System.out.println("Cat sound");
    }
}

class Main{
    public static void main(String[] args) {
        poly obj1 = new poly();
        poly obj2 = new Dog();
        poly obj3 = new Cat();
        obj1.makeSound();
        obj2.makeSound();
        obj3.makeSound();
    }
}