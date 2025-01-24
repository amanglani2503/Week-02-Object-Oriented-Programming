package AssistedProblems;

class Animal{
    public String name;
    public int age;

    public void makeSound(){
        System.out.println("Animal makes noice");
    }
}

class Dog extends Animal{
    // Method to set attributes of dog
    public void setter(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " is barking !");
    }
}

class Cat extends Animal{
    // Method to set attributes of Cat
    public void setter(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " meows !");
    }
}

class Bird extends Animal{
    // Method to set attributes of bird
    public void setter(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " is chirping !");
    }

}

public class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating objects
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        // setting attributes using setter method
        dog.setter("Bruno", 4);
        cat.setter("Jessica", 2);
        bird.setter("Perry", 3);

        // calling methods to make sounds
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
