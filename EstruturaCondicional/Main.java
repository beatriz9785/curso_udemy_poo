
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beatriz
 */

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println("Que horas são?");
        hora = sc.nextInt();
        
        if(hora < 12){
            System.out.println("acorda desgramento");
        }
        else  if(hora < 18){
            System.out.println("buenas tardes");
        }
        else{
            System.out.println("vai dormir, neném");
        }
        
        
    }
    
}
