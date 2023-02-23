public class Runner {

    public static void main(String[] args) {
        System.out.println("========= Crollanin  belgileri=======");
        Corolla car1=new Corolla();
        System.out.println(car1.multiply(3,6));
        System.out.println(car1.multiply(3,6,7));
        car1.motor();
        car1.vitesSayisi();
        car1.yakitTuketimi();
        System.out.println("========= Toyotanin  belgileri=======");
        Toyota car2=new Toyota();
        car2.motor();
        car2.yakitTuketimi();
        car2.Speed();
        System.out.println( car2.multiply(3,6));
        System.out.println( car2.multiply(3,6,9));

        System.out.println("========= Arabanin belgileri=======");
        Araba car3=new Araba();
        car3.motor();
        car3.yakitTuketimi();
        car3.Speed();

        System.out.println(car3.multiply(4,6));
        System.out.println(car3.multiply(4,6,8));



    }
}
