
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class negatifpozitif {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        double sayi=input.nextDouble();
        if(sayi<0.0)
            System.out.println("sayi negatif");
        else if(sayi>0)
            System.out.println("sayi pozitif");
        else  
            System.out.println("sayi sıfırdır");
        
    }
    
}
