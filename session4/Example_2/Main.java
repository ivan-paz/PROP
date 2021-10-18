//        Example: 
//        Java Exception Handling using
//        finally block

class Main {
  public static void main(String[] args) {
    try {
      // code that generates exception
      int divideByZero = 5 / 0;
    }

    catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
    
    finally {
      System.out.println("This is the finally block being executed after catching the Exception");
    }
  }
}


// WHAT HAPPEND?
// we are dividing a number by 0 inside the try block. 
// it generates an ArithmeticException.

// The exception is "caught" by the catch block. 
// and then the finally block is executed.
