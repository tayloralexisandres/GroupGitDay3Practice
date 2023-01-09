package Tay;

public class Prime { /*
Numbers -- Prime Number
Write a method that can check if a number is
prime or not

     */
    /// some examples of prime are->2,3,5,7,11

    public static void main(String[] args) {/// main method for running java source code



        isPrime(7);/// call this method and pass an integer arg in the parameter
    }

    public static void isPrime(int n) {/// custom method

        int m = 0;// m integer- use m for math logic
        int f = 0;/// this will act as a true /false variable--- math logic in java
        m = n / 2;// m is the input n /2 ---which  is the square root -- use m for math logic
        if (n == 0 || n == 1) {/// condition for if n is zero or 1 it is not prime
            System.out.println(n + " is not a prime number");// if true this prints
        } else {/// or/otherwise

            /// loop for i is -if  n is other than 0 or 1- this loop runs from 2-> the square root of n
            for (int i = 2; i <= m; i++) {/////  for prime- n should be greater than 1
                if (n % i == 0) {///--------------------condition for prime->n should not have more than 2 factors
                    System.out.println(n + "is not a prime number");// if true this will print
                    f = 1;/// this condition is now true --- which will allow f==0 to run in next condition
                    break;// stop, we already proved n is not prime
                }
            }
            if (f == 0) {// f is set to zero to check math logic-- meaning true false is turned off and n will print
                System.out.println(n + " is a prime number");// n prints due to all true conditions above and a break;
            }

        }

    }
}
