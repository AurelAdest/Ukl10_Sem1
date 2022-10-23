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
public class loopsegitigalancipdepanA {
    public static void main(String[] args){
        int a=20;
        int b=5;
        int sum=0;
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0; i<10; i++){
            for(int j=0; j<1+i; j++){
                System.out.print(a+"\t");
                sum +=a;
                a+=b;
            }
            System.out.println();
        }
        for(int i=0; i<10; i++){
            for(int j=0; j<9-i; j++){
                System.out.print(a+"\t");
                sum += a;
                a+=b;
            }
            System.out.println();
        }
        System.out.println("Jumlah Deret aritmatikanya adalah "+sum);
    }
}
