package ssg13scope;

public class VariableInsideBlock {

    public static void main(String args[]) {
        int x=4;
        {
          //y has limited scope to this block only
            int y=100;
            System.out.println("Sum of x+y = " + (x+y));
            y=10;
          //gives error, already defined
           // int y=200;
        }
      //creates a new variable  
        int y;
    }
}
