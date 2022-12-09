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
public class Gunler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("bir sayi giriniz:");
        Scanner giris=new Scanner(System.in);
        
        int day=giris.nextInt();
        switch(day){
            
            case 1 :
                System.out.println("bugun pazartesi");
                
                break;
            
            case 2:
                System.out.println("bugun salı");
                break;
            case 3:
                System.out.println("bugun carsamba");
                break;
            case 4:
                System.out.println("bugun persembe");
                break;
            case 5:
                System.out.println("bugun cuma");
                break;
                
            case 6:
                System.out.println("bugun cumartesı");
                break;
            case 7:
                System.out.println("bugun pazar");
                break;
        }
    }
    
}
