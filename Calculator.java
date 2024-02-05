public class Calculator {
    float a;
    float b;

    /**
     * The function "add" takes two float numbers as input and prints their sum.
     * 
     * @param a The first number to be added.
     * @param b The parameter "b" is a float type variable.
     */
    public void add(float a,float b)
    {
        float c=a+b;
        System.out.println("The sum of " + a+ " and "  + b+ " is:" +c );
    }

   /**
    * The function calculates the difference between two float numbers and prints the result.
    * 
    * @param a The first number in the subtraction operation.
    * @param b The parameter "b" is a float value that represents the second number in the subtraction
    * operation.
    */
    public void sub(float a,float b)
    {
        float c=a-b;
        System.out.println("The difference of " + a+ " and " + b+ " is:" +c );
    }

    public void prod(float a,float b)
    {
        float c=a*b;
        System.out.println("The product of " + a+ " and " + b+ " is:" +c );
    }
    public void div(float a,float b)
    {
        float c=a/b;
        System.out.println("The quotient of " + a+ " and " + b+ " is:" +c );
    }


    public static void main(String[] args)
    {
        Calculator c=new Calculator();
        c.add(3,2);
        c.sub(3,2);
        c.prod(3,2);
        c.div(3,2);

    }
}
