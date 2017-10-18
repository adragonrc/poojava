/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejm1;

import java.io.*;


public class Main {

    public static int menu(float s)throws IOException {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         int opcion=0;
        while(opcion<=0||opcion>2){
            System.out.println("Que desea Hacer? ");
            System.out.println("1.Retirar dinero");
            System.out.println("2.Ingresar dinero.");
            opcion=Integer.parseInt(br.readLine());
            if(opcion<=0||opcion>2){
                System.out.println("Opcion no valida, intente de nuevo.");
            }
            else {
                  if(opcion==1){
                    if(s==0){
                        System.out.println("Lo sentimos su saldo es 0, no puede retirar");
                        opcion=10;
                    }
                    else return 1;
                  }
            }
            if(opcion==2) {
                return 2;
            } 
        }
        return 0;
    }
  
    public static void main(String[] args) throws IOException{
        String titular ;
        float saldo=0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese su nombre");
        titular = br.readLine();
        Cuenta cuenta1= new Cuenta(titular,saldo );
        System.out.println("bienvenido " + titular);
        int flag1;
        flag1 = 0;
        int flag2;
        flag2 = 0;
        int f;
        f = menu(cuenta1.getsaldo());
        int flag3=0;
    while(flag3==0){
        if(f==1){
            while(flag1==0&&f==1){
            String r;
           
            System.out.print("Ingrese el monto que desea retirar: ");
            saldo=Float.parseFloat(br.readLine());
            if(cuenta1.getsaldo()-saldo<0)
            {
                System.out.println("Lo sentimos no cuenta con dinero suficiente");
            }
            else{
             
                saldo=cuenta1.getsaldo()-saldo;
                cuenta1.setsaldo(saldo);
                System.out.println("A modificado el saldo de su cuenta a:"+cuenta1.getsaldo());
                System.out.println("Gracias por su operacion");
                System.out.println("Desea volver al menu? [S/n]");
                r=br.readLine();
                if("s".equals(r)||"S".equals(r)){
                     f=menu(cuenta1.getsaldo());
                } 
            else {
                    flag1=1;
                    flag3=2;
                }
            }
            }
        }
        if(f==2){
        while(flag2==0&&f==2){
            String r;
           
            System.out.print("ingrese el monto que desa agregar a su cuenta: ");
            saldo=Float.parseFloat(br.readLine());
            saldo=cuenta1.getsaldo()+saldo;
            cuenta1.setsaldo(saldo);
            System.out.println("A modificado el saldo de su cuenta a:"+cuenta1.getsaldo());
            System.out.println("Gracias por su operacion");
            System.out.println("Desea volver al menu? [S/n]");
            
            r=br.readLine();
            if("s".equals(r)||"S".equals(r)){
                f=menu(cuenta1.getsaldo());
               
            } 
            else {flag2=1;
                flag3=3;
            }
            
        }
        }
    }
    }
}




