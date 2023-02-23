package Inheritance;

public class Parent {


    protected Parent(){

        System.out.println("Parent parametresiz cons. calisti");
    }

    public Parent(int sayi3, int sayi4){
        System.out.println("Parent 2 parametreli cons");
    }

    public Parent(int sayi5){
        System.out.println("Parent 1 parametreli cons");
    }

    protected int sayi;

    public static void add(){
        System.out.println("addd");
    }


}
