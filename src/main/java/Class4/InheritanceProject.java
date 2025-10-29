package Class4;

public class InheritanceProject {

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.Eat();
        dog.sound();
        dog.canWalk();

         CAT cat=new CAT();
         cat.canWalk();
         cat.sound();
         cat.Eat();


    }

}

class Animal{
    public void Eat(){
        System.out.println("Anima can eat");
    }
    public void sound(){
        System.out.println("Animal can sound");
    }
    public void canWalk(){
        System.out.println("Animal can walk");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog is Barking");
    }
}
class CAT extends Animal{
    public void sound(){
        System.out.println("Cat sound is Mawww!!");
    }
}

