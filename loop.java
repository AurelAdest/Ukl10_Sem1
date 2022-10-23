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
public class loop {
    public static void main (String[] args){
        int a=20;
        int b=5;
        int n=30;
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i >=21 && i<=30){
                System.out.println(+i+"="+a);
                sum=sum+a;
            }
            a+=b;
        }
        System.out.println("Jumlah Deret Aritmatikanya adalah "+sum);
    }
}
