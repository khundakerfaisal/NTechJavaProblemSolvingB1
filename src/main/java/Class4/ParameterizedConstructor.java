package Class4;

public class ParameterizedConstructor {
    public ParameterizedConstructor(int a, int b){
        int sum=a+b;
        System.out.println(sum);

    }

    public static void main(String[] args) {
        ParameterizedConstructor parameterizedConstructor=new ParameterizedConstructor(10,20);
    }



}
