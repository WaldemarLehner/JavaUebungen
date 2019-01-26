/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.Scanner;
/**
 *
 * @author Waldemar L
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fC = -1;
        while(fC < 1){
            fC = start();
        }
        int[] f_arr = new int[fC];       
        f_arr[0] = 0;
        if(fC>1){
            f_arr[1] = 1;
        }
        for(int i = 2;i < fC;i++){
            f_arr[i] = f_arr[i-1] + f_arr[i-2];
        }
        for(int i = 0;i<fC;i++){
            System.out.println("["+i+"]: "+f_arr[i]);
        }
    
        
        
        
    }
    public static int start(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Wie viele Fibonacci-Zahlen sollen berechnet werden?");
        int fibCount = enterFibCount();
        reader.close();   
        return fibCount;
    }
    public static int enterFibCount(){
        Scanner reader = new Scanner(System.in);
        int fibCount;
        try{
            fibCount = reader.nextInt();
        }catch(Exception e){
            System.out.println("Fehler: Geben sie eine natürliche Zahl ein");
            fibCount = enterFibCount();
        }
        if(fibCount < 0){
            System.out.println("Fehler: Zahl darf nicht negativ sein");
            fibCount = enterFibCount();
        }
        return fibCount;
    }
    
}
