/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package arda.ödev.pkg7784;

import java.util.Scanner;

/**
 *
 * @author ARDA
 */
public class Dikdortgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner girdi=new Scanner (System.in);
          int KisaKenar,UzunKenar;
                  System.out.println("Kisa Kenarin Uzunlugunu Giriniz");
                  KisaKenar=girdi.nextInt();
                  System.out.println("Uzun Kenarin Uzunlugunu Giriniz");
                  UzunKenar=girdi.nextInt();
                  double cevre=KisaKenar*2+UzunKenar*2;
                  double alan=KisaKenar*UzunKenar;
                          System.out.println("Cevre : "+cevre);
                          System.out.println("Alan : "+alan);
                          
       int VizeN,FinalN;
       System.out.println("Vize Notunuzu Giriniz");
       VizeN=girdi.nextInt();
       System.out.println("Final Notunu Giriniz");
       FinalN=girdi.nextInt();
       double not=VizeN*0.4+FinalN*0.6;
       System.out.println("Ortalama Sonucunuz : "+not);
               
       
               
                                  
                  
        // TODO code application logic here
    }
}
