/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuvvethesabı2;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Kuvvethesabı2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Kütleyi giriniz:");
        int m =input.nextInt();
        System.out.println("ivmeyi giriniz:");
        int a= input.nextInt();
        int F = m*a;
        System.out.println("kuvvet:"+F);
    }
    
}
