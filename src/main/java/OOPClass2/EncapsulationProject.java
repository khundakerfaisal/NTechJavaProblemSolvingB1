package OOPClass2;

public class EncapsulationProject {

    public String name="Omar Sani";

    public void getAge() {
        System.out.println(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private int nid;
    public void setNidValue(int nid){
        this.nid=nid;
    }
    public void getNid(){
        System.out.println(nid);
    }
    public int mobileNumber;



}
class Employee{
    public static void main(String[] args) {
        EncapsulationProject employee=new EncapsulationProject();

        System.out.println(employee.name);
//        employee.getAge();
        employee.setNidValue(12144);
        employee.getNid();
    }
}


