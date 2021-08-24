public class CocktailShakerSort {
    void sort(int[] list) {
        int count = list.length;
        int rightIndex = 0;
        int leftIndex = 0;
        boolean swapped;

        do {
            swapped = false;

            for (int i = leftIndex; i < count - leftIndex - 1; i++) {
                if (list[i + 1] < list[i]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }

            rightIndex++;

            for (int i = count - rightIndex - 1; i > leftIndex; i--) {
                if (list[i] < list[i - 1]) {
                    int temp = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = temp;
                    swapped = true;
                }
            }

            leftIndex++;
        } while (swapped);
    }
}
