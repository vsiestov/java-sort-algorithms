import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {
    int[] list = new int[]{3, 5, 7, 8, 1, 2, 0, 13};
    int[] list2 = new int[]{6, 5, 3, 1, 8, 7, 2 ,4};

    @Test
    @DisplayName("Sort an array using the insert sort algorithm")
    void sort() {
        InsertSort insert = new InsertSort();

        insert.sort(list);
        insert.sort(list2);

        assertArrayEquals(new int[]{0, 1, 2, 3, 5, 7, 8, 13}, list);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, list2);
    }
}
