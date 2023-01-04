package Tay;

public class PrintConsecutive {
    public static void main(String[] args) {

        PrintConsecutive(9);

    }

    public static void PrintConsecutive(int n) {
        if (n >= 0) {/// any given positive number
            for (int i = 1; i <= n; i++) {// when n is 1-n
                System.out.println(i);
                if (i % 2 == 0) {

                    System.out.println("Codility");
                }
                if (i % 3 == 0) {
                    System.out.println("Test");
                }
                if (i % 5 == 0) {
                    System.out.println("Coders");
                }


            }


        }
    }
}