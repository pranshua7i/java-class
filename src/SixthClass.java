public class SixthClass {
    public static void main(String[] args) {
        //Only want numbers between 10 and 50
       int myNum = 10;

       /* if (myNum >= 10){
            //myNum >= 10
            //now check if it is <= 50
            if(myNum <= 50){
                System.out.println("Number is valid");
            }
        }else{
            System.out.println("Number is invalid");



        //and / or operators - allow to combine more than one condition
        // && means and, so both conditions have to be true to continue
        // || means or, which means only one has to be true to continue

        if (myNum >= 10 && myNum <= 50){
            System.out.println("Number is valid.");
        }else {
            System.out.println("Number is invalid.");
        }



        // OR operator
        //if a number > 50 - invalid
        //if a number < 10 - invalid
        //otherwise        - valid
        if (myNum < 10 || myNum > 50){
            System.out.println("Number is invalid");
        }else{
            System.out.println("Number is valid");
        }


        //valid - even # between 10 and 50
        if ((myNum >= 10 && myNum <= 50) && (myNum % 2 == 0)){
            System.out.println("Number is valid!");
        }else{
            System.out.println("Number is invalid!");
        }



        if ((myNum < 10 || myNum > 50) || (myNum % 2 != 0)){
            System.out.println("Number is invalid!");
        }else {
            System.out.println("Number is valid!");
        }
        */
        //even # must be less than 100
        //odd # must be greater than 20
        myNum = 80;
        System.out.println("The number is " + myNum);
        if (myNum % 2 == 0){// even #
            if (myNum < 100){
                System.out.println("Valid even number");
            }
        }else { //odd #
            if(myNum > 20){
                System.out.println("Valid odd number");
            }
//TODO - Homework - display a message if a number is invalid

        }

    }

}
