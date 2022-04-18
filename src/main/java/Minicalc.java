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
                System.out.println("Welcome !! This is my mini project");

                while(true) {
                    System.out.println("Select an option");
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
        public double root(double n)
        {
            logger.info("Root - " + n);
            double ret = Math.sqrt(n);
            logger.info("ResultRoot - " + ret);
            return ret;
        }
        public double factorial(int n)
        {
            logger.info("Factorial - " + n);
            if(n<0)
                return Double.NaN;
            double ret=1;
            for(int i=1;i<=n;i++)
                ret=ret*i;
            logger.info("ResultFactorial - " + ret);
            return ret;
        }
        public double log(double n)
        {
            logger.info("Log - " + n);
            double ret = Math.log(n);
            logger.info("ResultLog- " + ret);
            return ret;
        }
        public double power(double bas, double pow)
        {
            logger.info("Power - " + bas + ", " + pow);
            double ret = Math.pow(bas , pow);
            logger.info("ResultPower - " + ret);
            return ret;
        }
}

