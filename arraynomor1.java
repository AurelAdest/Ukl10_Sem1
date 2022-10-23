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
public class arraynomor1 {
    public static void main(String[] args){
        int a[][]={{-7,5,7,9},{4,8,2,1},{3,8,6,8},{2,7,1,3}};
        int b[][]={{1,1,8,5},{-4,9,7,3},{2,6,8,4},{1,3,2,9}};
        System.out.println("Hasil A-B");
//      Menghitung berapa kolom(kebawah)
        for(int i=0; i<4; i++){
//      Menghitung berapa baris(kesamping)
           for(int j=0; j<4; j++){
//             Jika penjumlahan hanya mmenggati operator aritmatika dibawah
               System.out.print(a[i][j]-b[i][j]+"\t");
           }
           System.out.println();
        }
    }
    }

