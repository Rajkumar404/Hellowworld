/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
class OuterClass {
  int x = 10;
  String r;

  class InnerClass {
    int y = 25;
  }
}
public class InnerDemo {
   
  public static void main(String[] args) 
  {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
      
      // another method
      
    /*  OuterClass myObj = new OuterClass();
      OuterClass.InnerClass myInner = myObj . new InnerClass();
      System.out.println(myInner.y + myObj.x);
      
  }
}*/

