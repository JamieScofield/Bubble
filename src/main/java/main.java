import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int b[] = {32,45,78,54,79,21,61};
        System.out.println(Arrays.toString(b));
        Bubble bubble = new Bubble();
        bubble.bubbleSort(b);
        System.out.println(Arrays.toString(b));
    }
}
