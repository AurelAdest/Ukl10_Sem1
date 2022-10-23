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
public class arraynomor2 {
    public static void main(String[] args){
        int i,j,k;
        Scanner input = new Scanner (System.in);
        System.out.print("Jumlah baris matriks A: ");
        int barisA= input.nextInt();
        System.out.print("Jumlah kolom matriks A: ");
        int kolomA= input.nextInt();
        System.out.print("Jumlah kolom matriks B: ");
        int kolomB= input.nextInt();
        
         int[][] A = new int[barisA][kolomA];
         int[][] B = new int[kolomA][kolomB];
         int[][] C = new int[barisA][kolomB];
         
         for(i = 0; i<barisA; i++){
            for(j=0; j<kolomA; j++){
                System.out.print("Matriks A["+(i+1)+","+(j+1)+"]=");
                A[i][j]= input.nextInt();
            }
         }
          for(i = 0; i<kolomA; i++){
            for(j=0; j<kolomB; j++){
                System.out.print("Matriks B["+(i+1)+","+(j+1)+"]=");
                B[i][j]= input.nextInt();
            }
         }
           for(i = 0; i<kolomB; i++){
            for(j=0; j<kolomB; j++){
                C[i][j]=0;
                for(k=0; k<kolomA; k++){
                    C[i][j] = C[i][j]+(A[i][k]*B[k][j]);
                }   
    }
    }
           for(i = 0; i<barisA; i++){
            for(j=0; j<kolomB; j++){
                System.out.print(C[i][j]+"");
            }
            System.out.println();
           }
}
}
