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
public class loopsegitigasikuB {
    public static void main (String[] args){
        int a=11;
        int b=5;
        int sum=0;
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0; i<5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print(a+"\t");
                sum += a;
                a +=b;
            }
            System.out.println();
        }
        System.out.println("Jumlah  Deret Aritmatikanya adalah "+sum);
    }
}
