import java.util.Scanner;

public class RectangeArea {



        float length;
        float width;


        // Gets Data From User using Scanner(System.in)//
        public void getData()
        {
            // Captures the User Input
            Scanner sc= new Scanner(System.in);

            System.out.println("Please Enter Length Value: ");
            // Storing the captured value in a variable

            length=sc.nextFloat();
            System.out.println("Please Enter width Value: ");
            width=sc.nextFloat();
        }

        public float compField()
        {
            return length*width;
        }

        public void fieldDisplay(){

            System.out.println("The Area of a rectangle is: " + compField() );
        }

        //Driver Code
        public static void main(String[] args) {

            // Creating object of Shape class//
            RectangeArea rec= new RectangeArea();

            // Calling Function//
            rec.getData();
            rec.fieldDisplay();



        }



    }


