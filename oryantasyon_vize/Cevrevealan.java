 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cevrevealan;

/**
 *
 * @author elale
 */
import java.util.Scanner;
public class Cevrevealan {

    public static void main(String[] args) {
        int r;
        double alan,cevre,pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.println("daire yarı çapını giriniz:");
        r = input.nextInt();
        cevre =2*pi*r;
        alan =pi*(r*r);
        System.out.println("dairenin alanı:"+alan);
        System.out.println("dairenin cevresi :"+cevre);
        
        
        
        
        
        
        
    }
}
