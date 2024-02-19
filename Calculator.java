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
    /**
     * The function calculates the area of a square given the length of its side.
     * 
     * @param a The parameter "a" represents the length of one side of the square.
     */
    public void square(float a)
    {
        float c=a*a;
        System.out.println("The area of the square is:" +c);
    }

   /**
    * The `cube` function calculates the cube of a given number and prints the result.
    * 
    * @param a The parameter `a` in the `cube` method represents the number for which you want to
    * calculate the cube.
    */
    public void cube(int a)
    {
        int c=a*a*a;
        System.out.println("The cube of the number is:" +c);
    }


    public static void main(String[] args)
    {
        Calculator c=new Calculator();
        c.add(3,2);
        c.sub(3,2);
        c.prod(3,2);
        c.div(3,2);
        c.square(3);
        c.cube(3);
    }
}
