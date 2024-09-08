/*
  Task: Method Overloading for a Simple Calculator

  1. Create a class named `Calculator` with overloaded `calculate` methods:
     - Method 1: `calculate(int a, int b)` – Returns the sum of two integers.
     - Method 2: `calculate(double a, double b)` – Returns the sum of two doubles.
     - Method 3: `calculate(int a, int b, int c)` – Returns the sum of three integers.
     - Method 4: `calculate(double a, double b, double c)` – Returns the sum of three doubles.

  2. In the `Main` class, create an instance of `Calculator` and call each version of the `calculate` method with appropriate arguments.
     - Print the results of each calculation.

  This task demonstrates method overloading, where multiple methods have the same name but different parameters.
*/

package Polymorphism.Challenges.ChallengeTwo;

public class Calculator {
    public int calculate(int a, int b){
        return a + b;
    }
    public double calculate(double a, double b){
        return a + b;
    }
    public int calculate(int a, int b, int c){
        return a + b + c;
    }
    public double calculate(double a, double b, double c){
        return a + b + c;
    }


}
