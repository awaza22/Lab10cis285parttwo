import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }
    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
        SelectionSort x = new SelectionSort();
        arr = x.basicSelectionSort(arr);

        assertArrayEquals("Positive Test Fails", Sortedarr, arr);
    }

    public void testNegative(){

        /** Test data contains negative values only **/
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        /** Test data contains negative values only **/
        SelectionSort x = new SelectionSort();
        arr = x.basicSelectionSort(arr);

        assertArrayEquals("Negative Test Fails", Sortedarr, arr);
    }

    public void testMixed(){

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = -2;
        arr[2] = 3;
        arr[3] = 0;
        arr[4] = -4;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -4;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 3;
        Sortedarr[4] = 5;

        /** Test data contains with both positive, negative and zeros **/
        SelectionSort x = new SelectionSort();
        arr = x.basicSelectionSort(arr);

        assertArrayEquals("Mixed Test Fails",Sortedarr,arr);
    }

    public void testDuplicates(){

        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 9;
        arr[4] = 8;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 7;
        Sortedarr[1] = 8;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 9;

        /** Test data contains duplicates **/
        SelectionSort x = new SelectionSort();
        arr = x.basicSelectionSort(arr);

        assertArrayEquals("Duplicates Test Fails",Sortedarr,arr);
    }
}