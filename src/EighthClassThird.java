public class EighthClassThird {
    public static void main(String[] args) {

        // for ( initialization ; condition ; increment/decrement ) {
        //      ...body of the loop
        //  }

        // print num from 1 - 10
        // initial - 1
        // final - 10
        // increment - 1

/*        int counter = 0;

        for (counter = 1; counter <= 10; counter++ ){
            //System.out.println(counter);
        }

        for (int num=200; num >=100; num -= 10) {
            System.out.println(num);
        }
*/
        String str = "ABCDE";

        for (int counter = str.length(); counter >0; counter--){
            System.out.println(str.charAt(counter-1));
        }

        for (String string = "Hi"; str.equals("Hi"); str = "Hi"){
            System.out.println(str);
        }

        int factorial = 1;
        for( int num = 5; num>=1; num--){
            factorial *=num;
        }
        System.out.println(factorial);
    }
}
