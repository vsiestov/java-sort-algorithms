public class InsertSort {
    void sort(int[] list) {
        int count = list.length;

        for (int i = 1; i < count; i++) {

            int j = i;

            while (j > 0 && list[j] < list[j - 1]) {

                int temp = list[j];
                list[j] = list[j - 1];
                list[j - 1] = temp;

                j--;
            }
        }
    }
}
