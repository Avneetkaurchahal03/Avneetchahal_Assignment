import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calculatorTest {
	 calculator cal;
	@BeforeAll
	// void SetupAll() will not work in Eclipse
    static void SetupAll() {
        System.out.println("@BeforAll Method");

    }

    @BeforeEach
    void setup() {
         cal = new calculator();
        System.out.println("@BeforeEach Method");
    }
    @Test
    void test() {
    int expected = 5;
    int actual = cal.add(2, 3);
    int expected1 = 8;
    int actual1 = cal.add(4, 4);
    int expected2 = 5;
    int actual2 = cal.add(4, 1);
   
   /* @Test
    void test() {

        int expected = 5;
        int actual = cal.add(2, 3);
        assertEquals(expected, actual,"Should give right sum");
        System.out.println(actual);
    }

    @Test
    void test2() {
        int expected1 = 8;
        int actual1 = cal.add(4, 4);
        assertEquals(expected, actual,"should give right output");
        System.out.println(actual);
    }
    @Test
    void test3() {
        int expected2 = 5;
        int actual2 = cal.add(4, 1);
        assertEquals(expected, actual,"should give right answer");
        System.out.println(actual);
    }*/
    assertAll(() ->assertEquals(actual,expected),
    		()->assertEquals(actual1,expected1),
            () -> assertEquals(actual2,expected2)
           
  );
    }
  
    @AfterEach
    void setup2() {
        System.out.println("@AfteEach Method");
    }

    @AfterAll
    static void SetupAll2() {
        System.out.println("@AfterAll Method");

    }
} 

