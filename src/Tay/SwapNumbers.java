package Tay;

public class SwapNumbers {
    public static void main(String[] args) { // main method to run java source code

        // X = X + Y
        //  Y = X - Y
        //  X = X -Y


        SwapNumbers(9,7);
    }




    public static void SwapNumbers(int x, int y){// public custom method with 2 args in the parameter
        x=x+y;// 16=9+7
        y=x-y;//9=16-7
        x=x-y;//7=16-9
        System.out.println("x= "+x+", y= "+y);

    }
}
