package Tay;

public class ReverseNegative {

    public static void main(String[] args) {/// main method to run java source code

        System.out.println(reverseNegative(0));//// print to return this method-- pass any integer in x arg

    }

    public static int reverseNegative(int x) {/// public custom method that returns an integer value

        if (x < 0) {/// if the input of  x is less than zero
            x = x * -1;/// take x and multiple it by negative 1- math condition take a negative * negative = positive number

        }else if (x==0){
            System.out.println("Zero can not be positive or negative");
        }
        return x;/// the updated value of x will be returned when you call this method to print -
        // it will either be reversed or if it is a positive number will be assigned to x
    }
}
