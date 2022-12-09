/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalanbulma;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class bolmeislemi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        System.out.println("boleceginiz sayiyi giriniz:");
        int sayi=input.nextInt();
        int bolen=input.nextInt();
        
        int bolum =sayi/bolen;
       
        System.out.println("bir sayi gir:");
               
        System.out.println("islem:"+sayi+"/"+bolen);
        System.out.println("bolum="+bolum);
        
    }
    
}
