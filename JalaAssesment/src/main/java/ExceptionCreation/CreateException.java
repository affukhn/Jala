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


    public static void main(String[] args) {
        CreateException c= new CreateException();
                 try {
//                     c.ArithematicException();
//        c.tryCatchExceptionHandling();
//                     c.throwException();
                     c.multipleTryCatch();
                 }catch (Exception e)
                 {
                     e.printStackTrace();
                 }
    }
}
