/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

class machine{
    static int a;
    public static void show(){
        
    }
    static class process{
    public void display(){
        System.out.println("running boaring process in first cycle");
    }
}
}


public class InnerStaticDemo {
    public static void main(String[] args){
        machine obj = new machine();
        obj.show();
        
        
        machine.process obj1 = new machine.process();
        obj1.display();
    }
    
}
