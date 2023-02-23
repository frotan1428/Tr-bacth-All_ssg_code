package Stattic;

public class Note {

   /*
            "static keyword" nedir?
            static keyword class'a baglanmis class elemanlaridir
            static class elemanlari butun Object'lerin ortak elamanidir.
            static ler uzerinde yapilan her degisiklik butun objeleri etkiler tum objelerde gorunur.
            static Class elemanlarina Class uzerinden ulasilir.

     */

    //How to create "static" variable
    //To make a variable "static", put "static" keyword between "access modifier" and "data type"

     /*
        1) If you do not assign any value for "static" and "non-static" variables, Java assigns "default values" to them
        but Java does not assign default value for "local variables"

        2) Default values are "0" for numeric data types, it is "null" for String, it is "false" for boolean

     */

    //static variable'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
        //System.out.println(car1.counter);

    //static variable'lara class ismi kullanarak ulasilmalidir

    //System.out.println(Car.counter);



    /*
        1)Java Class Loader makes the classes ready to use
        2)When the classes make ready, class members are loaded according to some order.
          main method is the first to be loaded normally
        3)Sometimes we need something to be loaded before main method, for this scenario we use "static block".
          The codes inside the "static block" is executed before everything in the class, even before main method.
        4)Rule: "static" structures can work just with static class members.
                Do not put non-static class members into static method, it will give error
        5)"static block" can be used just with "static" variables, because of the rule in 4th step
        6)"static block" is used to initialize(assigning first value) "static variables"

        Note: When we create a variable inside the main method, we do not use "static" keyword, because
              Java knows everything inside the main is "static"
    */

}
