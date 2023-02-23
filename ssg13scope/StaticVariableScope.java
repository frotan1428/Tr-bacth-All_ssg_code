package ssg13scope;

public class StaticVariableScope {

    //declaring a private static variable
    private static double pivalue;

    public static final String piconstant = "PI";

    public static void main(String args[]) {

        pivalue = 3.14159265359;
        System.out.println("The value of " + piconstant + " is: " + pivalue);
    }
}
