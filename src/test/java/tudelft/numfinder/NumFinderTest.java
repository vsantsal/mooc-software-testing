package tudelft.numfinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumFinderTest {
    @Test
    public void findSmallestAndLargestFromRandomSequence() {
        int[] ints = new int[] {4, 25, 7, 9};
        NumFinder nf = new NumFinder();
        nf.find(ints);
        assertEquals(4, nf.getSmallest());
        assertEquals(25, nf.getLargest());
    }

    @Test
    public void findSmallestAndLargestFromAscendingSequence() {
        int[] ints = new int[] {4, 7, 9, 25};
        NumFinder nf = new NumFinder();
        nf.find(ints);
        assertEquals(4, nf.getSmallest());
        assertEquals(25, nf.getLargest());
    }

    @Test
    public void findSmallestAndLargestFromDescendingSequence() {
        int[] ints = new int[] {25, 9, 7, 4};
        NumFinder nf = new NumFinder();
        nf.find(ints);
        assertEquals(4, nf.getSmallest());
        assertEquals(25, nf.getLargest());
    }

    @Test
    public void findSmallestAndLargestFromOneItemArray() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{1});
        assertEquals(1, nf.getSmallest());
        assertEquals(1, nf.getLargest());
    }
}