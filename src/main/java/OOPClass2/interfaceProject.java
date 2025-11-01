package OOPClass2;

public interface interfaceProject {
    void drawShape();
    void Eat();

}

//class Circle implements interfaceProject{
//    public void drawShape(){
//        System.out.println("Circle is round");
//    }
//}
//
//class Tringle implements interfaceProject{
//    public void drawShape(){
//        System.out.println("Tringle is three angles");
//    }
//}

interface Animal{
    public void Eat();
}
interface Human{
    public void Walk();
}

class Activity implements Animal,Human {
    public void Eat(){
        System.out.println("Animal can eat");
    }

    @Override
    public void Walk() {
        System.out.println("Man can walking");
    }
}


class Main{
    public static void main(String[] args) {

        Activity activity=new Activity();
        activity.Eat();
        activity.Walk();
//        Circle circle=new Circle();
//        circle.drawShape();
//        Tringle tringle=new Tringle();
//        tringle.drawShape();
    }
}

