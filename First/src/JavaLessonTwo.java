import java.util.Scanner;

public class JavaLessonTwo {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Your favorite number ");
        if (userInput.hasNextInt()){
            int numberEntered = userInput.nextInt();
            System.out.println("You entered " + numberEntered);
            int numEnteredTimesSelf = numberEntered * numberEntered;
            System.out.println(numberEntered + " * " + numberEntered + " = "+ numEnteredTimesSelf);
            int numEnteredDivide2 = numberEntered / 2;
            System.out.println(numberEntered + " / " + 2 + " = "+ numEnteredDivide2);

            int numEnteredRemeinder = numberEntered % 2;
            System.out.println(numberEntered + " % " + 2 + " = "+ numEnteredRemeinder);

            numberEntered -= 2;
            numberEntered += 2;
            numberEntered--;
            numberEntered++;

            int numberABS = Math.abs(numberEntered);
            int whichIsBigger = Math.max(5,7); //7
            int whichIsSmallest = Math.min(5,7); //5

            double numSqrt = Math.sqrt(5.23);
            int numCeiling = (int) Math.ceil(5.23); //6
//            int numCeiling = (int) Math.floor(5.23); //5
            int numRound = (int) Math.round(5.63); //6
            int randomNumber = (int)(Math.random() *11);
            System.out.println("Random Number" + randomNumber);

        }else{
            System.out.println("Enter an integer next ");
        }
    }

}
