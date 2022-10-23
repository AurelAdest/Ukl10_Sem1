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
public class SELEKSIKONDISI2 {
        static String kategori(int pendapatan){
            String kategori;
            if(pendapatan < 2000000){
                kategori = "A";
            }else if (pendapatan >=2000000 && pendapatan <= 10000000){
                kategori = "B";
            }
            else{
                kategori = "C";
            }
            return kategori;
        }
        static int hitung(String kategori, int bulan, String jalurMasuk){
            int biaya = 0;
            
            if (jalurMasuk.equalsIgnoreCase("SBMPTN")){
                switch(kategori){
                    case "A":
                        biaya = bulan + 500000;
                        biaya += 500000;
                        break;
                    case "B":
                        biaya = bulan + 1000000;
                        biaya += 15000000;
                        break;
                    case "C":
                        biaya = bulan + 500000;
                        biaya += 30000000;
                        break;
                }
            }
            else if(jalurMasuk.equalsIgnoreCase("SNMPTN")){
                switch(kategori){
                    case "A":
                    biaya = bulan * 500000;
                    biaya += 70000000;
                    break;
                    case "B":
                    biaya = bulan * 1000000;
                    biaya += 17000000;
                    break;
                    case "C":
                    biaya = bulan * 2000000;
                    biaya += 50000000;
                    break;
                }
            }
            
            return biaya;
        }
        public static void main(String[] args){
            int id[]={1,2,3,4};
            String nama[]={"Mira","Nina","Oemar","Pena"};
            String jalurMasuk[]={"SBMPTN","SNMPTN","Mandiri","SBMPTN"};
            String alamat[]={"Sawojajar","Kedung Kandang","Ijen","Binoyo"};
            
            Scanner input = new Scanner (System.in);
            System.out.print("Masukkan Id Mahasiswa : ");
            int idInput = input.nextInt();
            System.out.print("pendapatan Orang Tua : ");
            int pendapatan = input.nextInt();
            System.out.print("Berapa Bulan : ");
            int bulan = input.nextInt();
            System.out.println("====================");
            
            String kategori = kategori(pendapatan);
            int biaya = hitung(kategori, bulan, jalurMasuk[idInput-1]);
            
            System.out.println("Id Mahasiswa : "+id[idInput-1]);
            System.out.println("Nama Mahasiswa : "+nama[idInput-1]);
            System.out.println("Jalur Masuk : "+jalurMasuk[idInput-1]);
            System.out.println("Alamat : "+alamat[idInput-1]);
            System.out.println("Kategori pendapatan : "+kategori);
            System.out.println("Biaya : "+biaya);
        }
    }
