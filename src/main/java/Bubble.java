import java.util.ArrayList;

public class Bubble {


    public int[] bubbleSort(int[] A) {
        int n = A.length;
        for(int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int holder = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = holder;
                }
            }
        }
        return A;
    }
}
