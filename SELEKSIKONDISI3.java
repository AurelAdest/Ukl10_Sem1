/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latukl;

import java.util.Scanner;

/**
 *
 * @author aurel
 */
public class SELEKSIKONDISI3 {
    static int proses(int golongan, String masuk, String keluar){
        int biaya = 0;
        
        if(masuk.equalsIgnoreCase("Waru")){
            if(keluar.equalsIgnoreCase("sidoarjo")){
                switch(golongan){
                    case 1:
                        biaya = 6000;
                        break;
                    case 2:
                        biaya = 9000;
                        break;
                    case 3:
                        biaya = 9000;
                        break;
                    case 4:
                        biaya = 12000;
                        break;
                    case 5:
                        biaya = 12000;
                        break;
                }
            }else {
                switch(golongan){
                    case 1:
                        biaya = 9000;
                        break;
                    case 2:
                        biaya = 14000;
                        break;
                    case 3:
                        biaya = 14000;
                        break;
                    case 4:
                        biaya = 10500;
                        break;
                    case 5:
                        biaya = 18500;
                        break;
                }
            }
        }else if(masuk.equalsIgnoreCase("sidoarjo")){
            if(keluar.equalsIgnoreCase("waru")){
                switch(golongan){
                    case 1:
                        biaya = 6000;
                        break;
                    case 2:
                        biaya = 9000;
                        break;
                    case 3:
                        biaya = 9000;
                        break;
                    case 4:
                        biaya = 12000;
                        break;
                    case 5:
                        biaya = 12000;
                        break;
            }
        }else{
            if(keluar.equalsIgnoreCase("sidoarjo")){
            switch(golongan){
                case 1:
                    biaya = 5500;
                    break;
                case 2:
                    biaya = 8500;
                    break;
                case 3:
                    biaya = 8500;
                    break;
                case 4:
                    biaya = 11500;
                    break;
                case 5:
                    biaya = 11500;
                    break;    
            }
        }else {
            switch(golongan){
                case 1:
                    biaya = 9000;
                    break;
                case 2:
                    biaya = 14000;
                    break;
                case 3:
                    biaya = 14000;
                    break;
                case 4:
                    biaya = 10500;
                    break;
                case 5:
                    biaya = 18500;
                    break;    
                }
            }
        }
        return biaya;
    }    
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
            System.out.print("Masukkan Golongan Kendaraan Anda : ");
            int idInput = input.nextInt();
            System.out.print("Daerah Masuk : ");
            int pendapatan = input.nextInt();
            System.out.print("Daerah Keluar : ");
            int bulan = input.nextInt();
            System.out.println("====================");
        String masuk = null;
        String keluar = null;
        int golonganInput = 0;
            
            int biaya = proses(golonganInput, masuk, keluar);
            
            System.out.println("Masuk dari : "+masuk);
            System.out.println("Keluar di : "+keluar);
            System.out.println("biaya : "+biaya);
    }
}
