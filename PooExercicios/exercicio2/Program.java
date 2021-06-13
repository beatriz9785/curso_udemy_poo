
package application;

import java.util.Scanner;
import entities.Product;

public class Program {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");//por algum motivo o System.out.print não está aparecendo no console, então mudei para println
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println(product);
        
        sc.close();
    }
}
    

