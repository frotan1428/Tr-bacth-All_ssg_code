public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MethodOverloading Obj = new MethodOverloading();
        System.out.println(Obj.sum(10, 20));
        System.out.println(Obj.sum(10, 20, 30));
        System.out.println(Obj.sum(10.5, 20.5));

        System.out.println("Product of the two integer value :" + Obj.multiply(3,6));
        System.out.println("Product of the two three value :" + Obj.multiply(3,6,3));

        System.out.println("Product of the three int  value :" +Obj.Prod(3,5,6));
        System.out.println("Product of the two three  double value :" + Obj.Prod(3.5,6.7,3.2));

        Obj.StudentId("Elif kaya", 1);
        Obj.StudentId(2, "Fuat kaya");
    }
}