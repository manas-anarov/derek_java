public class JavaLessonThree {
    public static void main(String[] args) {

//        int randomNumber = (int) (Math.random() * 50);
//
//        if (randomNumber < 25){
//            System.out.println("Random nuber is less 25");
//        }
//        else if (randomNumber > 40){
//            System.out.println("Random nuber is greater 40" );
//        }
//        else if (randomNumber == 18){
//            System.out.println("Random nuber is equal to 18" );
//        }
//        else if (randomNumber != 40){
//            System.out.println("Random nuber is no equal to 40" );
//        }
//        else {
//            System.out.println("Nothing worked");
//        }
//
//
//        if(!(false)){
//            System.out.println("False into True");
//        }
//
//        if((true) && (true)){
//            System.out.println("Both true");
//        }
//
//        if((true) | (true)){
//            System.out.println("One is true");
//        }
//
//        if((false) ^ (true)){
//            System.out.println("One is true");
//        }
//
//        System.out.println("Random nuber is " + randomNumber);





//        int valueOne = 1;
//        int valueTwo = 2;
//        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
//        System.out.println(biggestValue);


        char theGrade = 'b';

        switch (theGrade)
        {
            case 'A':
                System.out.println("Greate job");
                break;
            case 'B':
                System.out.println("Greate job");
                break;
            case 'C':
                System.out.println("Greate job");
                break;
            case 'D':
                System.out.println("Greate job");
                break;
            default:
                System.out.println("You failed");
                break;
        }


    }
}
