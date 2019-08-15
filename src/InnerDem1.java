/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
class Outer{
int x;
public void show(){
    
}

     class Inner{
     public void display()
    {
        
        System.out.println("iam rajkumar");
    }
}
}
public class InnerDem1 {
    // variable,method
    public static void main(String[] args) {
        Outer Obj = new Outer();
        Obj.show();
        Outer.Inner Obj1 = Obj.new Inner();
        Obj1.display();
    }
}
