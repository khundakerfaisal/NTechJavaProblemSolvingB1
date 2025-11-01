package OOPClass2;

public class MethodOverriding {
    public static void main(String[] args) {
        Cycle cycle=new Cycle();
        cycle.sound();
        cycle.wheel();


        Car car=new Car();
        car.sound();
        car.wheel();
    }

}
class Vehicle{
    public void sound(){
        System.out.println("vehicle has sound");
    }
    public void wheel(){
        System.out.println("Vehicle has wheel");
    }
    public void Engine(){
        System.out.println("vehicle has engine");
    }
}

class Cycle extends Vehicle{
    @Override
    public void wheel(){
        System.out.println("Cycle has 2 wheel");
    }

}

class Car extends Vehicle{
    @Override
    public void sound(){
        System.out.println("Car has sound");
    }
    public void wheel(){
        System.out.println("car has 4 wheel");
    }
}
