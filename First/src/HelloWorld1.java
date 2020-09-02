import javax.sound.midi.SysexMessage;

public class HelloWorld1 {

//    static String randomString;
//    static final double PINUM= 3.141529;
//
//    public static void main(String[] args){
//        System.out.println(PINUM);
//
//        int integerOne = 22;
//        int integerTwo = integerOne + 1;
//        System.out.println(integerTwo);
//    }

    public static void main(String[] args){

        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 21_000_000;
        long bigLong = 9200000000000000000L;
        float bigfloat = 3.14F;
        double bigDouble = 3.1412123123123123123123123123;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 66;
        char anotherChar = 'A';
        char escapedChars = '\f';

        String randomString = "I`m a random string";
        String anotherString = "Stuff";

        String andAnotherString = randomString + ' ' + anotherString;

        String byteString =  Byte.toString(bigByte);
        String shortString =  Short.toString(bigByte);
        String intString =  Integer.toString(bigByte);
        String floatString =  Byte.toString(bigByte);
        String doubleString =  Byte.toString(bigByte);
        String booleanString =  Byte.toString(bigByte);

        double aDoubleValue = 30000000000000000000000000.1412121212;
        int doubleToInt = (int) aDoubleValue;

        int stringToInt = Integer.parseInt(intString);

        System.out.println(stringToInt);
    }


}
