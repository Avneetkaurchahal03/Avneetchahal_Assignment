mport java.util.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BankTest {
	Scanner sc= new Scanner(System.in);
	long Id=sc.nextLong();
	
	double bal1=sc.nextDouble();
	
	   BankAccount cust;
	    @BeforeEach
	    void object_creation(){
	       cust= new BankAccount(Id,bal1);
	    }
	    @Test
	    void withdraw() {
	        assertAll(
	                ()-> assertThrows(InsufficientBalanceException.class,() -> cust.withdraw(9000000),"It is supposed to throw Insufficient funds exception"),
	                ()-> assertThrows(InsufficientBalanceException.class,() -> cust.withdraw(983674748),"It is supposed to throw Insufficient funds exception")
	        );
	    }
	

}
