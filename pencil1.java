
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAVITHRA M
 */
public class pencil1 {
    public static void main(String[] args) {
        Scanner pencil = new Scanner(System.in);
        int cost_of_one_pencil = pencil.nextInt();
        int quantity_of_pencils = pencil.nextInt();
        int totalcost = cost_of_one_pencil * quantity_of_pencils;
        System.out.println(" Total cost of pencils are :"+totalcost);
    }
}