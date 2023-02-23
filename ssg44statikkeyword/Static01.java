package Stattic;

public class Static01 {

 static   String ogrenciIsim="fatih";
   String okulIsmi= "Yildiz koleji";
    String okulTelefonu="3122563635";

    public  void nonstaticMethod(){
        System.out.println("Statik method calisti");
    }

    public static void main(String[] args) {


        Static01 ogrenci=new Static01();
        System.out.println(ogrenci.ogrenciIsim);
        System.out.println(ogrenci.okulIsmi);
        System.out.println(ogrenci.okulTelefonu);
        ogrenci.nonstaticMethod();

    }
}
