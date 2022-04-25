package com.dziekan30;

public class SharedDigit {

//    public static boolean hasSharedDigit(int num1, int num2){
//        if ((num1 > 99) || (num1 < 10) || (num2 >99) || num2 < 10) {
//            return false;
//        }else{
//            return ((num1/ 10 == num2 / 10) || (num1/ 10 == num2 % 10) || (num2 /10 == num1 %10) || (num1 % 10 == num2 % 10) );
//        }
//    }

    public static boolean hasSharedDigit(int num1, int num2){

        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }


        int startNum2 = num2;
        while (num1 > 0 ){
            int digitNum1 = num1 % 10;
            num2 = startNum2;
            while (num2 > 0){
                int digitNum2 = num2 % 10;
                if (digitNum1 == digitNum2){
                    return true;
                }
                num2 /= 10;
            }
            num1 /= 10;
        }

        return false;

    }

}
