package Stattic;

public class Static02 {


    static String okulIsmi= "Yildiz koleji";
    static String okulTelefonu="3122563635";

    public static void staticMethod(){
        System.out.println("Statik method calisti");
    }

    public void staticOlmayanMethod(){
        System.out.println("Static olmayan method calisti");
    }

    public static void main(String[] args) {
        // baska class'daki static class uyelerine
        // ulasabilmek icin sadece clasIsmi.staticUyeIsmi
        // yazmamiz yeterlidir
    //  System.out.println(Static01.ogrenciIsim);
        System.out.println(okulTelefonu); // 3122563635
        okulTelefonu="3125474747";
        System.out.println(okulTelefonu); // 3125474747

        // Baska class'daki static olamayan class uyelerine
        // ancak o class'dan obje olusturarak ulasabiliriz
        // ve obje ile yapilan atamalar sadece o obje icin gecerli olur

        Static02 obj1=new Static02();
        Static02 obj2=new Static02();

        //static variable'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
        System.out.println(obj2.okulIsmi); // Yildiz koleji
        okulIsmi="Sabir koleji";

        //static variable'lara class ismi kullanarak ulasilmalidir
        System.out.println(Static02.okulIsmi);//Sabir koleji
        System.out.println(obj1.okulIsmi); // Sabir koleji
        staticMethod();
        obj2.staticOlmayanMethod();


    }
}
