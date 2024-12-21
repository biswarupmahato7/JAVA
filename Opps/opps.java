package Opps;

import Opps.student;

class pen{
    String color;
    String type;

    public void write(){
        System.out.println("It can write");

    }
    
}
public class opps {

    public static void main(String[] args) {
        pen pen1=new pen();

        pen1.color="Blue";
        pen1.type="Gel";
        System.out.println(pen1.color+" "+ pen1.type );
        pen1.write();

    }
    
 
        
}
    

