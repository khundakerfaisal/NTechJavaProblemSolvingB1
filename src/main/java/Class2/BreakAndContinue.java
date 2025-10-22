package Class2;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i=0;i<=5;i++){
            if (i==3){
                break;
            }
            System.out.println("Break the value " +i);

        }

        for (int i=0;i<=5;i++){
            if (i==3){
                continue;
            }
            System.out.println("continue the value " +i);

        }
    }
}
