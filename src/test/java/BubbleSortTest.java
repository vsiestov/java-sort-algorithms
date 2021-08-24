import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    int[] list;
    int[] list2;

    @BeforeEach
    void setup() {
        list = new int[]{7, 3, 5, 8, 1, 2, 0, 13};
        list2 = new int[]{6, 5, 3, 1, 8, 7, 2 ,4};
    }

    @Test
    @DisplayName("Sort an array")
    void sort() {
        BubbleSort merge = new BubbleSort();

        merge.sort(list);
        merge.sort(list2);

        int[] list3 = new int[]{3, 1, 2};
        int[] list4 = new int[]{5, 3, 0, 7, 2};

        merge.sort(list3);
        merge.sort(list4);

        assertArrayEquals(new int[]{1, 2, 3}, list3);
        assertArrayEquals(new int[]{0, 2, 3, 5, 7}, list4);
        assertArrayEquals(new int[]{0, 1, 2, 3, 5, 7, 8, 13}, list);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, list2);
    }
}
