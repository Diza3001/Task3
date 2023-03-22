import java.util.Scanner;



public class NumberSystems {


    public static void main(String[] args)
    {


        Scanner input = new Scanner(System.in);
        int userChoice;


        double firstNumber,secondNumber;



        do
        {

            System.out.println("\n");



            System.out.println("Enter First Number: ");
            firstNumber = input.nextDouble();

            System.out.println("Enter Second Number: ");
            secondNumber = input.nextDouble();


            System.out.println("Enter the binary number ");
            String BinaryValue=input.next();

            System.out.println("Enter the decimal number ");
            int num=input.nextInt();

            System.out.println("\n");

            System.out.println("Select option to perform the operation: " );



            userChoice = displayMenu(input);


            switch (userChoice)
            {
                case 1:
                    System.out.println("The Decimal value of the entered binary number is: " + Binvalue(BinaryValue));
                    break;

                case 2:
                    System.out.println("The Hexadecimal value of the entered number is: " + HexValue( num));
                    break;

                case 3:
                    System.out.println("The Summation Value is : " + add(firstNumber, secondNumber));
                    break;

                case 4:
                    System.out.println("The Subtraction Value : " + subtract(firstNumber, secondNumber));
                    break;

                case 5:
                    System.out.println("The Multiplication is : " + multiply(firstNumber, secondNumber));
                    break;

                case 6:
                    System.out.println("The Division is : " + divide(firstNumber, secondNumber));
                    break;

                case 7:
                    System.out.println("Thank you and goodbye : ");
                    break;

                default:
                    System.out.println("wrong entry: Enter a value between 1 -7");
                    break;

            }



        }
        while
        (userChoice != 7) ;
    }

    public static int displayMenu(Scanner input)
    {
        System.out.println(" 1. Convert from binary to the decimal System ");
        System.out.println(" 2. Convert from decimal to hexadecimal System ");
        System.out.println(" 3. Summing up numbers from different Systems");
        System.out.println(" 4. Subtracting up numbers from different Systems ");
        System.out.println(" 5. Multiplying up numbers from different Systems");
        System.out.println(" 6. Dividing up numbers from different Systems");
        System.out.println(" 7. Exit the Program");





                return input.nextInt();
    }
    public static double add(double firstNumber, double secondNumber)
    {
        return (firstNumber + secondNumber);
    }
    public static double subtract( double firstNumber, double secondNumber)
    {
        if (firstNumber > secondNumber)
        return (firstNumber-secondNumber);
        else
        {
           return  (secondNumber - firstNumber);
        }

    }
    public static double multiply(double firstNumber, double secondNumber)
    {
        return (firstNumber * secondNumber);
    }
    public static double divide(double firstNumber, double secondNumber)
    {
        return (firstNumber/secondNumber);
    }
    public static String Binvalue(String BinaryValue)
    {
        int decimal=Integer.parseInt(BinaryValue,2);
        return Integer.toString(decimal);
    }
    public static String HexValue(int num)
    {
        String str;
         str = Integer.toHexString(num);
        return str;
    }

}
