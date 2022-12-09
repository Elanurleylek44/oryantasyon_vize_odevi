/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oryantasyon_vize;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("bir sayı giriniz:");
        double sayi = input.nextDouble();
        if (sayi<500) {
            sayi = sayi/2;
            
        }else{
            sayi= sayi*6;
            
        }
        System.out.println(sayi);
    }
}
            
                    
                    
                    
                    
                    
                    
            
        
        
                   
    

