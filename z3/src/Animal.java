public class Animal {
    public String say() {
        return "I'm an Animal!";
    }
}


 class Dog extends  Animal{
     @Override
     public String say() {
         return super.say('Dog goes woof');
     }
 }
class Cat extends  Animal{

}
class Bird extends  Animal{

}
class Mouse extends  Animal{

}
class Cow extends  Animal{

}
class Frog extends  Animal{

}
class Elephant extends  Animal{

}
class Duck extends  Animal{

}
class Fish extends  Animal{

}
class Seal extends  Animal{

}
