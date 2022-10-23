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
public class SELEKSIKONDISI1 {
    static int proses(int golongan, int kwh){
        int hasil=0;
        
        switch(golongan) {
            case 1:
                hasil = kwh *1000;
                if (hasil < 100000){
                    hasil = 100000;
                } break;
            case 2:
                hasil = kwh *1300;
                if (hasil < 100000){
                    hasil = 100000;
                }break;
            case 3:
                hasil = kwh *1500;
                if (hasil < 100000){
                    hasil = 100000;
                }break; 
            default:
                System.out.println("Anda salah input golongan");
                break;
        }
        int hasilakhir = hasil + 13000;
        return hasilakhir;
    }
    
    public static void main(String[] args){
        int idPel[]={1,2,3,4};
        String namaPel[]={"Galuh", "Indro", "Jedi", "Kanu"};
        int golPel[]={1,3,2,3};
        String alamatPel[]={"Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan id pelanggan: ");
        int id = input.nextInt();
        System.out.print("Masukkan jumlah kwh: ");
        int kwh = input.nextInt();
        System.out.println("====================");
        
        int tagihan = proses(golPel[id-1], kwh);
        
        System.out.println("Id Pelanggan: "+idPel[id-1]);
        System.out.println("Nama Pelanggan: "+namaPel[id-1]);
        System.out.println("Golongan: "+golPel[id-1]);
        System.out.println("Alamat: "+alamatPel[id-1]);
        System.out.println("Jumlah kwh: "+kwh);
        System.out.println("Tagihan: "+tagihan);
    }
}