import java.util.Arrays;

public class shellSort {
    public int[] shellSort(int[] source) {
        int [] arr = Arrays.copyOf(source,source.length);

        int gap = 1;
        while(gap < arr.length) {
            gap = gap * 3 + 1;
        }
        while (gap > 0) {
            for(int i = gap; i < arr.length; i++) {
                int tmp = arr[i];
                int j = i - gap;
                while(j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j+gap] = tmp;
            }
            gap = (int) Math.floor(gap/3);
        }
        return arr;
    }
}
