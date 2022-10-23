/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latukl;

/**
 *
 * @author aurel
 */
public class matriks {
    public static void main (String[] args){
//      inisialisasi variabel
        int a=11;
        int b=5;
        int sum=0;
/*      PERULANGAN MEMBUAT BARIS
        nilai awal i adalah 0 dan ketika i kurang dari 5 maka 1++*/
        for(int i=0; i<5; i++){
/*      PERULANGAN MEMBUAT KOLOM
        nilai awal j adalah 0 dan katika j kurang dari 6maka j++*/
        for(int j=0; j<6; j++){
/*      ketika perulangan j berjalan maka tampilan u kemudian berikan spasi "\t"
        setelah itu u + b dan s + u*/
        System.out.print(a+"\t");
        sum += a;
        a += b;
        }
//      ketika perulangan j berakhir maka berikan pengganti baris atau "enter"
        System.out.println();
/*      kemudian cek apakah perulangan i masih berjalan, jika masih maka ulangi 
        dari atas*/
        }
//      jika perulangan i sudah berakhir maka tampilkan sum 
        System.out.println("Jumlah Deret Aritmatikanya adalah "+sum);
    }
}
