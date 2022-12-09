
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class kdv_hesabı {
    public static void main(String[] args) {
        double tutar , kdvliFiyat , kdv =0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("urunun tutarini giriniz:");
        tutar = input.nextDouble();
        kdvliFiyat = tutar + (tutar*kdv);
        System.out.println("urunun KDV'li fiyatı : " + kdvliFiyat);
        
        
    }
    
}
