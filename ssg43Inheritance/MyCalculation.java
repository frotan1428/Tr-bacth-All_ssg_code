package Inheritance;

public class MyCalculation extends Calculation{

    public void multiplication(int x, int y) {
         x = x * y;
        System.out.println("The product of the given numbers:"+x);
        System.out.println(super.z);

    }
    public void Division(int x, int y) {

         z = x / y;
        System.out.println("The divied of the given numbers:"+z);
      super.addition(5,7);
      System.out.println(super.z);
    }

    public static void main(String args[]) {
        MyCalculation demo = new MyCalculation();
        demo.addition(a, b);
        demo.multiplication(a, b);
        demo.Division(a,b);

    }
}
