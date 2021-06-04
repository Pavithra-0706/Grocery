/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;

import java.util.Scanner;

/**
 *
 * @author PAVITHRA M
 */
public class Grocery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean yn;
        while(true){
        System.out.println("GROCERIES");
        System.out.println("\n");
        System.out.println("ID 1 =  Pens        Rs.1 per piece");
        System.out.println("ID 2 =  Pencils     Rs.5 per piece");
        System.out.println("ID 3 =  Erasers     Rs.3 per piece");
        System.out.println("ID 4 =  Scale       Rs.10 per piece");
        System.out.println("\n");
        System.out.println("Which product do you want?");
        int ID = input.nextInt();  
        if(ID == 1)
            System.out.println("ID 1 =  Pens        Rs.1 per piece");
        if(ID == 2)
            System.out.println("ID 2 =  Pencils     Rs.5 per piece");
        if(ID == 3)
            System.out.println("ID 3 =  Erasers     Rs.3 per piece");
        if(ID == 4)
            System.out.println("ID 4 =  Scale       Rs.10 per piece");
        int cost_of_1pen = 1;
        int cost_of_1pencil = 5;
        int cost_of_1eraser = 3;
        int cost_of_1scale = 10;
        System.out.println("\n");
        System.out.println("How many do you want?");
        int quantity = input.nextInt();
        int total_price = input.nextInt();
        if(ID==1)
            total_price=quantity*cost_of_1pen;
        if(ID==2)
            total_price=quantity*cost_of_1pencil;
        if(ID==3)
            total_price=quantity*cost_of_1eraser;
        if(ID==4)
            total_price=quantity*cost_of_1scale;
        System.out.println("Total price is : "+total_price);
        String decision = null;
        switch(decision){
        case "yes":
            yn = false;
            break;
        case "no": 
            yn = true;
            break;
        default : 
            System.out.println("\n");
            System.out.println("Do you want to order more?");
            return default;
        }
        }
    }
}
    

