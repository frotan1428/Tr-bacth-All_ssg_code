package ssg13scope;

/*
 There 3 types of variable
1) instance variable
2)local variable
3)static Variable

instance variable ve  local variable arasindaki fark ne dir ?

1)  instance variable class icinde tanimlir  local variable ise method icinde tanimlanir.
2) instance variable ilk degieri koymazsaniz olur hata vermez sonra koyabilir siniz ama Local varibale
ilk degri atmaniz lazim.
*/
public class LocalVariableScope {

    void show()
    {

//variable declared inside a method has method level scope
        int x=10;
        System.out.println("The value of x is: "+x);
    }
    public static void main(String args[])
    {
        LocalVariableScope dc = new LocalVariableScope();
        dc.show();
    }


}
