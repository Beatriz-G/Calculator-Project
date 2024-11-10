/* 
Basic Calculator Project where I utilizie classes, methods, and objects to creata a simple arithmentic calculator. 
    The Calculator can: 
    Add two integers
    Subtract two integers
    Divide two integers
    Apply the modulo operator on two integers
*/
 
//Public class called Calculator 
public class Calculator{
    // Calculator() constructor 
    public Calculator(){
    }
    /* Public method called "add()" that returns an int. Accepts two integer parameters. Add() method adds the two integer parameters and returns the sum.
    */
    public int add(int a, int b){
      int add = a + b;
      return add;
    }
    /* Public method called "subtract()" that returns an int. Accepts two integer parameters. Subtract() method subtracts the two integer parameters and returns the difference.
    */
    public int subtract(int a, int b){
      int subtract = a - b;
      return subtract;
    }
    /* Public method called "multiply" that returns an int. Accepts two integer parameters. Multiply() method multiplies the two integer parameters and returns the answer.
    */
    public int multiply(int a, int b){
      int multiply = a * b;
      return multiply;
    }
  
    /* Public method called "divide" that returns an int. Accepts two integer parameters. Divide() method divides the two integer parameters and returns the answer.
    */
    public int divide(int a, int b){
      int divide = a / b;
      return divide;
    }  
  
    /* Public method called "modulo". Accepts two integer parameters. Modulo() method gets the remainder of two integers.
    */
    public int modulo(int a, int b){
      return a % b;
    }
  
    /* Main method that prints out the value of the public methods called.
    */
    public static void main(String[] args) {
      Calculator myCalculator = new Calculator(); 
      System.out.println(myCalculator.add(5, 7));
      System.out.println(myCalculator.subtract(45, 11));
    }
  }