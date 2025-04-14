class Animal{
    void sound(){
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void meow(){
        System.err.println("Cat meows");
    }
}

class Bird extends Animal{
    @Override
    void sound(){
        System.out.println("I'm not an Animal, Im a Bird");
    }
    void chirp(){
        System.out.println("Bird chirps");
    }
}
public class AnimalHierarchy{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.bark();

        Animal cat = new Cat();//polymorphism
        cat.sound();
        //cat.meow(); error, we have to use casting itseems

        Cat catt = new Cat();
        catt.meow();
        
        Bird bird = new Bird();
        animal.sound();
        bird.sound();
        bird.chirp();
    }
}
