package Class3;

public class FindMaxMultipleValues {
    public static void main(String[] args) {
        int [] number1={10,20,40,50,60,70};
        int [] number2={40,60,65,80};
        int max1=0;
        int max2=0;
        for (int i=0;i<number1.length;i++){
            if (number1[i] > max1) {
                max1 = number1[i];
            }
        }
        for (int i=0;i<number2.length;i++){
            if (number2[i] > max2) {
                max2 =number2[i];
            }
        }
        System.out.println(Math.max(max1,max2));

    }
}
