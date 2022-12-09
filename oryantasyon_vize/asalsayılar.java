/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class asalsayılar {
    public static void main(String[] args) {
        int bolenSayac = 0 ;
        int i,j ;
        
        for(i=3;i<1000;i++){
            for(j=2;j<i;j++){
                if(i%j==0) bolenSayac++;
            }
            if(bolenSayac==0)
                System.out.print(i + " - ");
            bolenSayac = 0;
            
        }
    }
    
}
