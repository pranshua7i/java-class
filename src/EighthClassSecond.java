public class EighthClassSecond {
    public static void main(String[] args) {
        String strToReverse = "ABCDEFGH";
        int len = strToReverse.length();
        int counter = len - 1;
        String reversedStr = "";

        System.out.println("String to reverse: " + strToReverse);
        while (counter >= 0) {
            reversedStr = reversedStr + strToReverse.charAt(counter);
            counter --;
        }

        System.out.println("Reversed String: " + reversedStr);


    }
}
