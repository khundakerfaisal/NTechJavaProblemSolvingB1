package Class3;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] duplicateNumber = {1, 2, 3, 1, 2, 4, 5, 6};
        for (int i = 0; i < duplicateNumber.length; i++) {
            for (int j = i + 1; j < duplicateNumber.length; j++) {
                if (duplicateNumber[i] == duplicateNumber[j]) {
                    System.out.println(duplicateNumber[i]);
                }
            }
        }
    }
}
