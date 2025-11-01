package OOPClass2;

public class abstractProject {
    public static void main(String[] args) {
        Tehari tehari=new Tehari();
        tehari.taste();

        Biryani biryani=new Biryani();
        biryani.taste();
    }
}

abstract class Food{
    abstract public void taste();
}
class Tehari extends Food{
    public void taste(){
        System.out.println("Tehari is cooking");
    }
}
class Biryani extends Food{
    public void taste(){
        System.out.println("Biryani taste is spicy");
    }
}
