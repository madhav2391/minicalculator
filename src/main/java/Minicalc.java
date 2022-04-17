import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class Minicalc {
        private static final Logger logger = LogManager.getLogger(Minicalc.class);
        public static void main(String[] args)
        {
            try
            {
                Minicalc calculator=new Minicalc();
                Scanner scanner=new Scanner(System.in);

                while(true) {
                    System.out.println("This is my mini project. select an option");
                    System.out.println("1: square root");
                    System.out.println("2: factorial");
                    System.out.println("3: natural logarithm");
                    System.out.println("4: power function");
                    System.out.println("Any other number to exit");
                    int input = scanner.nextInt();
                    if (input == 1) {
                        System.out.println("Enter a number");
                        System.out.println("Square root of the given number is : " + calculator.root(scanner.nextDouble()));
                    }
                    else if (input == 2) {
                        System.out.println("Enter a number");
                        System.out.println("Factorial of the given number is  : " + calculator.factorial(scanner.nextInt()));
                    }
                    else if (input == 3) {
                        System.out.println("Enter a number");
                        System.out.println("Natural logarithm of the given number is : " + calculator.log(scanner.nextDouble()));
                    }
                    else if (input == 4) {
                        System.out.println("Enter a numbers");
                        System.out.println("Power function of the given number is : " + calculator.power(scanner.nextDouble(), scanner.nextDouble()));
                    }
                    else {
                        System.out.println("exit option choosed");
                        break;
                    }
                }
                System.out.println("cool stuff byeeee");
            }
            catch(InputMismatchException error)
            {
                System.out.println("Invalid input type");
                logger.error("Invalid input type");
            }
        }
        //These functions are not defined over the entire real range. So, for inputs out of the domains, nan is returned.
        public double root(double number1)
        {
            logger.info("[ROOT] - " + number1);
            double return_val = Math.sqrt(number1);
            logger.info("[RESULT - ROOT] - " + return_val);
            return return_val;
        }
        public double factorial(int number1)
        {
            logger.info("[FACTORIAL] - " + number1);
            if(number1<0)
                return Double.NaN;
            double fact=1;
            for(int i=1;i<=number1;i++)
                fact=fact*i;
            logger.info("[RESULT - FACTORIAL] - " + fact);
            return fact;
        }
        public double log(double number1)
        {
            logger.info("[LOG] - " + number1);
            double return_val = Math.log(number1);
            logger.info("[RESULT - LOG] - " + return_val);
            return return_val;
        }
        public double power(double number1, double number2)
        {
            logger.info("[POWER] - " + number1 + ", " + number2);
            double return_val = Math.pow(number1 , number2);
            logger.info("[RESULT - POWER] - " + return_val);
            return return_val;
        }
}

