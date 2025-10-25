package Class3;

import java.util.Arrays;

public class ArraySortAscOrder {
    public static void main(String[] args) {
        int [] showNumber ={10,40,25,65,20,50,30,80};
//        Arrays.sort(showNumber);
        for (int i=0;i<showNumber.length-1;i++){
            for (int j=i+1;j<showNumber.length;j++){
                if (showNumber[i]>showNumber[j]){
                    int temp=showNumber[i];
                    showNumber[i]=showNumber[j];
                    showNumber[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(showNumber));

    }

}
