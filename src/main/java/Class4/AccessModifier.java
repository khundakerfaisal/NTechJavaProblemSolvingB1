package Class4;

public class AccessModifier {
    public String name = "Nazim"; //  public - can be accessed from anywhere
    private int age = 25;// private - can be accessed only inside this class
    protected String city = "Dhaka"; // protected - can be accessed in same package and subclasses
    String country = "Bangladesh";   // default (no keyword) - can be accessed only in same package
    // Method to show private data
    public void showAge(){
        System.out.println(age);
    }
//    public void showAge() {
//        System.out.println("Age: " + age);
//    }



}
class AccessExample {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        System.out.println(accessModifier.name); // public – accessible
        accessModifier.showAge();
        //  private – not accessible (error)
//        System.out.println(accessModifier.age);
        //protected – accessible (same package)
        System.out.println(accessModifier.city);
        // default – accessible (same package)
        System.out.println(accessModifier.country);
        //  can access private through public method
//        accessModifier.showAge();
    }
}

