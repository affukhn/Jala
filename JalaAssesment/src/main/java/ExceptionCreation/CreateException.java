package ExceptionCreation;

public class CreateException {

    public void ArithematicException()
    {
        int x=10/0;
    }
    public void tryCatchExceptionHandling()
    {

        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Handle the exceptions");
        }

    }
    public  void throwException() throws Exception {
        throw new Exception("This is a thrown exception.");
    }

    public void multipleTryCatch()
    {
        try {
            int[] array = new int[5];
            // This will throw ArrayIndexOutOfBoundsException
            array[10] = 1;

            int numerator = 10;
            int denominator = 0;
            // This will throw ArithmeticException
            int result = numerator / denominator;

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

    }
    public void tryCatchFinally()
    {
        try {
            System.out.println("Inside try block.");
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block, executed regardless of an exception.");
        }


    }
    public void ArrayOutBound()
    {
        int[] array = new int[5];
        try {
            // This will throw ArrayIndexOutOfBoundsException
            array[10] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public void nullPointerException()
    {
        try {
            String str = null;
            // This will throw NullPointerException
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        CreateException c= new CreateException();
                 try {
//                     c.ArithematicException();
//        c.tryCatchExceptionHandling();
//                     c.throwException();
                     c.multipleTryCatch();
                     c.tryCatchFinally();
                     c.ArrayOutBound();
                     c.nullPointerException();
                    throw  new MyCustomException("My custom Exception");

                 }catch (Exception e)
                 {
                     e.printStackTrace();
                 }
    }
}
