The var keyword is used only for local variables. We cannot use it with fields and method signature.
public String getUserData(var list) { } //Compile error 
2. Local variable without initialization is not allowed.
var num;  
3. Local variable cannot be initialized with null.
var ob = null; 
 4. Class level fields with var are not allowed.
public class Test {
  private var list = new ArrayList<String>(); 
} 