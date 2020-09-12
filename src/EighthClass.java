public class EighthClass {
    public static void main(String[] args) {
        int x = 5;

        int factorial = x;

        while (x > 0){

            x = x - 1;

            if (x > 0){

                factorial = x * factorial;

            }
        }
        System.out.println(factorial);
    }
}
