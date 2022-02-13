import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@Test
	 void findminmax() {
        int[] expected1={56,34,7,3,54,3,34,34,53};
        int[] expected2={57,98,4,6,3,90,23,87};
        int[] expected3={99,105,78,34,8,5,999};
        int[] expected4={57,98,4,6,3,90,23,87,67,101,2};
        
        int[] actual1={3,56};
        int[] actual2={3,98};
        int[] actual3={5,999};
        int[] actual4={2,101};
        MinMaxFinder f= new MinMaxFinder();
        assertArrayEquals(actual1,f.findminmax(expected1));
        assertArrayEquals(actual2,f.findminmax(expected2));
        assertArrayEquals(actual3,f.findminmax(expected3));
        assertArrayEquals(actual4,f.findminmax(expected4));
       /*assertAll(() -> assertArrayEquals(actual1,obj.findminmax(expected1)),
                () -> assertArrayEquals(actual2,obj.findminmax(expected2)),
                () -> assertArrayEquals(actual3,obj.findminmax(expected3)),
                () -> assertArrayEquals(actual4,obj.findminmax(expected4))
      );*/
}
}	
