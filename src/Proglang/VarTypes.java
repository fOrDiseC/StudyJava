package Proglang;



public class VarTypes {

    public static void main(String[] args) {
        
       int a,b,c;
       a=5; b=6; c=8;
       double pi =3.14535;
       char simbol ='D';
       byte byte1 = 8;
       VarTypes firstvar = new VarTypes();
       firstvar.printVars(5);
       firstvar.printVars(a);
   
    }
    public void printVars(int data) {
        
        System.out.println(data);
    }
    
    
    
    
}
