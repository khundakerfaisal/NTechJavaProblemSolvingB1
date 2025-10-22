package Class2;

public class LoopProgram {
    public static void main(String[] args) {

        for (int i=0;i<=5;i++){
            System.out.println("Print the value " +i);
        }

        int j=1;
        while (j<=5){
            System.out.println("While value is : " +j);
            j++;
        }

        int k=2;
        do{
            System.out.println("Do while value is : "+k);
            k++;
        }while (k<=5);
    }
}
