public class App {
    
    //overloader sum2 and sum3
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    //Overloaded computeSum() methods
    private static int computeSum(int num1, int num2) {
        return num1 + num2;
    }

    private static int computeSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    //Method that returns an int greater value
    private static int greaterValue(int num1, int num2){
        if (num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }

    }
    
    //Method that returns a double greater value
    private static double greaterValue(double num1, double num2){
        if (num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        System.out.println("The sum of 45 and 100 is " + sum2(45, 100));
        System.out.println("The sum of 50, 75, and 100 is " + sum3(50, 75, 100));
        System.out.println("The sum of 45 and 100 is " + computeSum(45, 100));
        System.out.println("The sum of 50, 75, and 100 is " + computeSum(50, 75, 100));

        //Call the greaterValue method with integer parameters
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));

        //Call the greaterValue method with double parameters
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));
    }
}