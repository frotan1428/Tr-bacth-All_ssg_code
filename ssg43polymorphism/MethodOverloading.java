public class MethodOverloading {

    // Java program to demonstrate working of method
// overloading in Java



        // Overloaded sum(). This sum takes two int parameters
        public int sum(int x, int y) {
            return (x + y);
        }

        // Overloaded sum(). This sum takes three int parameters
        public int sum(int x, int y, int z) {
            return (x + y + z);
        }

        // Overloaded sum(). This sum takes two double
        // parameters
        public double sum(double x, double y) {
            return (x + y);
        }

/*
    Different Ways of Method Overloading in Java
    Changing the Number of Parameters.
    Changing Data Types of the Arguments.
    Changing the Order of the Parameters of Methods


 */
    // Method 1
  //   Changing the Number of Parameters.
    public int multiply(int a, int b) {
      return   a * b;

    }
    //Method 2
    public int multiply(int a, int b, int c) {
       return a * b * c;

    }



   // Changing Data Types of the Arguments.
    //method 1
     public int Prod(int a, int b, int c){
         return a * b * c;
      }
      public double Prod(double a, double b, double c){
            return a * b * c;
          }

     //Changing the Order of the Parameters of Methods
      public   void StudentId(String name, int roll_no){
         System.out.println("Name :" + name + " " + "Roll-No :" + roll_no);
       }
      // Method 2
         public   void StudentId(int roll_no, String name){
             // Again printing name and id of person  public static void main(String args[])
              System.out.println("Roll-No :" + roll_no + " " + "Name :" + name);
          }

    public static void main(String[] args) {

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

