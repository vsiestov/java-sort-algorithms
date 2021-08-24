public class BubbleSort {
    void sort(int[] list) {
        int count = list.length;

        for (int j = 0; j < count; j++) {
            for (int i = 0; i < count - j - 1; i++) {
                if (list[i + 1] < list[i]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }

    }
}
