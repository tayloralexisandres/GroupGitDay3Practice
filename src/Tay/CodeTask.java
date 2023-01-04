package Tay;

public class CodeTask {
    public static void main(String[] args) {

        PrintConsecutive(9);

    }

    public static void PrintConsecutive(int n) {
        if (n >= 0) {/// any given positive number
            for (int i = 1; i <= n; i++) {// when n is 1-n

                if (i % 2 == 0) {/////// create an if else statement to replace i with string


                    System.out.println("Codility");


                } else if (i % 3 == 0) {
                    System.out.println("Test");
                } else if (i % 5 == 0) {
                    System.out.println("Coders");
                } else {
                    System.out.println(i);//// if not true print i
                }

            }

        }


    }
}
