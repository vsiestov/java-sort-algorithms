public class MergeSort {
    /**
     * Merge two arrays into the ordered one
     * @param list1 - left array
     * @param list2 - right array
     * @return int[]
     */
    private int[] merge(int[] list1, int[] list2) {
        int length = list1.length + list2.length;
        int[] result = new int[length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (index < length) {
            // if both array indexes are still under their sizes, we do the check
            // this is necessary in case if one of the arrays is shorter or reached to the end
            if (i < list1.length && j < list2.length) {
                if (list1[i] < list2[j]) {
                    result[index] = list1[i];
                    i++;
                } else {
                    result[index] = list2[j];
                    j++;
                }
            } else {
                // otherwise, we just fill the result with what's left
                if (i < list1.length) {
                    result[index] = list1[i];
                    i++;
                }

                if (j < list2.length) {
                    result[index] = list2[j];
                    j++;
                }
            }

            index++;
        }

        return result;
    }

    /**
     * Devide the original array until it has 1 item length
     *
     * @param list - an array to divide
     * @return int[]
     */
    private int[] divide(int[] list) {
        int length = list.length;
        int div = length / 2;

        int[] left = new int[div];
        System.arraycopy(list, 0, left, 0, left.length);

        int[] right = new int[length - div];
        System.arraycopy(list, div, right, 0, right.length);

        if (left.length > 1) {
            left = divide(left);
        }

        if (right.length > 1) {
            right = divide(right);
        }

        return merge(left, right);
    }

    /**
     * Merge sort implementation
     *
     * @param list - the list that needs to be sorted
     */
    void sort(int[] list) {
        int[] result = divide(list);
        int length = list.length;

        System.arraycopy(result, 0, list, 0, length);
    }
}
