/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ortalama2;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Ortalama2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        //kullanıcı 3 sayı girsin.
        System.out.println("üç sayı gir:");
        double sayi1=input.nextDouble();
        double sayi2=input.nextDouble();
        double sayi3=input.nextDouble();
        double ortalama=(sayi1+sayi2+sayi3)/3;
        System.out.println(sayi1+""+sayi2+""+sayi3+""+"ortalaması:"+ortalama);
    }
    
}
