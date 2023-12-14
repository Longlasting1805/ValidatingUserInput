import java.util.Scanner;

public class ValidateUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int one = 1;
        int two = 2;
        int valueOne;
        int valueTwo;
        int count = 1;




        while (count <= 20){
            System.out.print("Enter user input: ");
            int userInput = input.nextInt();

           if (userInput == one){
               System.out.println("1 is correct ");
               break;
           }else if (userInput == 2){
               System.out.print("2 is correct");
                break;
            }count++;

           }



        }




}
