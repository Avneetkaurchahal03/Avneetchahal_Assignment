mport static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class minMaxTest {

	minMax m1= new minMax(3,65);
	minMax m2 = new minMax(1,345);
    int[] input1={56,34,7,3,54,3,34,34,53,65};
    int[] input2 ={1,4,5,7,88,3,345,76,65};
    String expected1=m1.toString();
    String expected2=m2.toString();
    String actual1=m1.min_max(input1).toString();
    String actual2=m2.min_max(input2).toString();
    @Test
    void min_max() {
        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    

}
}
