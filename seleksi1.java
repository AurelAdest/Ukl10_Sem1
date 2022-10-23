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
public class seleksi1 {
   public static void main(String[] args) {
        String[][] pelanggan = {//tipe data yang dapat menyimpan karakter
            {"1","Galuh","1","Sawojajar"},
            {"2","Indro","3","Kedung Kandang"},
            {"3","Jedi","2","Ijen"},
            {"4","Kanu","3","Dinoyo"},
        };
        Scanner input = new Scanner(System.in);//menginputkan data
        System.out.println("Masukkan ID Pelanggan:");//memasukkan id pelanggan
        String idPelanggan = input.next();//menyimpan data user
        
        System.out.println("Masukkan jumlah pemakaian:");//memasukkan jumlah pemakaian
        int jumlahPakai = input.nextInt();//menyimpan data user
        
        // loop untuk mencari data golongan dari ID
        // yang dimasukkan
        String golongan = null;//menyimpan tipe data
        for (int i = 0; i < pelanggan.length; i++) {//mencari data dari array pelanggan
            if(pelanggan[i][0].equals(idPelanggan)){//input pelanggan array
                golongan = pelanggan[i][2];
            }
        }
        
        // menentukan tarif dari golongan yg dipilih
        int tarif = 0;//tipe data tarif untuk tampilan
        if(golongan.equals("1")){//equals sama dengan
            tarif = 1000; 
        } else if(golongan.equals("2")){
            tarif = 1300;
        } else if(golongan.equals("3")){
            tarif = 1500;
        }
        
        // hitung nominal tagihan
        int tagihan = tarif * jumlahPakai + 13000;
        if(tagihan < 50000){
            System.out.println("Tagihan anda " + 50000);
        }else{
            System.out.println("Tagihan anda " + tagihan);
        }
    }
} 

