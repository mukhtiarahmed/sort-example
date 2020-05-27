package sort;


import com.tenpearls.sort.SpecialSort;
import org.junit.Test;
import org.junit.Assert;

public class SpecialSortTest {


    @Test
    public void testOddEvenSort()  {
        int []numbers =  {1, 2, 4, 3, 7, 16};
        int [] expectedResult = {1, 3, 7, 2, 4, 16};

        SpecialSort.sortOddEven(numbers);
        Assert.assertArrayEquals( expectedResult, numbers );
    }

    @Test
    public void testEvenSort()  {
        int []numbers =  { 2, 4, 12, 8, 10, 16};
        int [] expectedResult = {2, 4, 8, 10, 12, 16};

        SpecialSort.sortOddEven(numbers);
        Assert.assertArrayEquals( expectedResult, numbers );
    }


    @Test
    public void testOddSort()  {
        int [] numbers =  { 13, 7, 1, 5, 3, 9};
        int [] expectedResult = {1, 3, 5, 7, 9, 13};

        SpecialSort.sortOddEven(numbers);
        Assert.assertArrayEquals( expectedResult, numbers );
    }

    @Test
    public void testEmptyArraySort()  {
        int [] numbers =  {};
        int [] expectedResult = {};

        SpecialSort.sortOddEven(numbers);
        Assert.assertArrayEquals( expectedResult, numbers );
    }


    @Test
    public void testNullArraySort()  {
        int [] numbers = null;
        int [] expectedResult = null;

        SpecialSort.sortOddEven(numbers);
        Assert.assertArrayEquals( expectedResult, numbers );
    }

    @Test
    public void testSingleOddSort()  {
        int [] numbers =  {13};
        int [] expectedResult = {13};

        SpecialSort.sortOddEven(numbers);
        Assert.assertArrayEquals( expectedResult, numbers );
    }

    @Test
    public void testSingleEvenSort()  {
        int [] numbers =  {12};
        int [] expectedResult = {12};

        SpecialSort.sortOddEven(numbers);
        Assert.assertArrayEquals( expectedResult, numbers);
    }

    @Test
    public void testNegOddEvenSort()  {
        int []numbers =  { - 1, - 2, -4, -3, -7, -16};
        int [] expectedResult = {-7, -3, -1, -16, -4, -2};

        SpecialSort.sortOddEven(numbers);
        Assert.assertArrayEquals( expectedResult, numbers );
    }

    @Test
    public void testNegOddSort()  {
        int []numbers =  {-1,  -7, -9, -3};
        int [] expectedResult = {-9, -7, -3, -1};

        SpecialSort.sortOddEven(numbers);
        Assert.assertArrayEquals( expectedResult, numbers );
    }

    @Test
    public void testNegEvenSort()  {
        int []numbers =  {-2, -4, -16, -8};
        int [] expectedResult = { -16, -8, -4, -2};

        SpecialSort.sortOddEven(numbers);
        Assert.assertArrayEquals( expectedResult, numbers );
    }




}

