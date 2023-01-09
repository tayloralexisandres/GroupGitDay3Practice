package Tay;


    public class NumbersPrintConsecutive {// custom java class, public access
        public static void main(String[] args) {// main method to run java source code

            PrintConsecutive(24);//// call this method, pass an interger value

        }

        public static void PrintConsecutive(int n) {/// custom method created with an integer arg in the parameter


            if (n >= 0) {/// any given positive number
                for (int i = 1; i <= n; i++) {// when n is 1-n---- iterate starting at 1 all the way to the value of n

                    String result = "";// temp String variable to assign data further on


                    /////// create an if else statement to replace i with string value


                    if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {/// first condition
                        result += "CodilityTestCoders";/// if condition true add this String value to result variable

                    } else if (i % 2 == 0 && i % 3 == 0) {// condition
                        result += "CodilityTest";// if true

                    } else if (i % 3 == 0 && i % 5 == 0) {//condition
                        result += "TestCoders";// if true


                    } else if (i % 5 == 0 && i % 2 == 0) {// condition
                        result += "CodilityCoders";// if true


                    } else if (i % 2 == 0) {// condition
                        result += "Codility";// if true


                    } else if (i % 3 == 0) {// condition
                        result += "Test";// if true

                    } else if (i % 5 == 0) {// condition
                        result += "Coders";// if true


                    } else {/// otherwise
                        result += i;/// print integer i
                    }

                    System.out.println(result);/// print result of true condition for each interger 1- n.
                }


            }
        }
    }




