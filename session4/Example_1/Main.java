//////////////////////////////////////////////
//
//
// Example 
// Exception handling using try...catch
//
//
///////////////////////////////////////////////
class Main {
  public static void main(String[] args) {

    try {

      // code that generates an exception in this case an Arithmetic one.
      int divideByZero = 5 / 0;
      System.out.println("Rest of code in try block");
    }
    
    catch (ArithmeticException e) {
      System.out.println("this is the ArithmeticException => " + e.getMessage());
    }
  }
}
