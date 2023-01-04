package Tay;

public class Week2CodeChallenge {///// divisible challenge

    public static void main(String[] args) {/// main method to run java source code

        System.out.println("Divisible by 15= ");//// display message
        for (int i = 1; i <= 100; i++) {/// use the for loop to get each number 1-100 and then


            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {/// create an if condition to compare i
                System.out.println(i);// if condition is true print i here
            }
        }
        System.out.println("Divisible by 5= ");// display message


        for (int k = 1; k <= 100; k++) {//// create another for loop to get each number 1-100

            if (k % 5 == 0 && k % 15 != 0) {/// create an if condition to compare k
                System.out.println(k);// if condition is true print k

            }

        }
        System.out.println("Divisible by 3= ");// display message

        for (int j = 1; j <= 100; j++) {// create another for loop to get each number 1-100


            if (j % 3 == 0 && j % 15 != 0) {// create an if condition to compare j
                System.out.println(j);// if condition is true print j here

            }

        }
    }
}