public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Mouse mouse = new Mouse();
        Cow cow= new Cow();
        Frog frog=new Frog();
        Elephant elephant=new Elephant();
        Duck duck=new Duck();
        Fish fish=new Fish();
        Seal seal=new Seal();
        System.out.println("Dog goes " + dog.say());
        System.out.println("Cat goes " + cat.say());
        System.out.println("Bird goes " + bird.say());
        System.out.println("And mouse goes " + mouse.say());

        ... // вызовите переопределённые методы


    }
}