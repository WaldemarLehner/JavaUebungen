/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateninarraysmanipulieren;

import java.util.Scanner;

/**
 *
 * @author Waldemar L
 */
public class DatenInArraysManipulieren {
static int[] arr = {32,34523,3442,542,564,63,73,-456,-56,-45,-654,-945,-45,-545,-4554,-456,-84,454,0};
    public static void main(String[] args) {
        char selection = askUser4Operation();
        switch(selection){
            case 'q':
                getBiggestElementAndPrint();
                break;
            case 'w':
                getAvgAndPrint();
                break;
            case 'e':
                makeNegZeroAndSort();
                break;
        }
    }
    public static char askUser4Operation(){
        Scanner sc = new Scanner(System.in);
        char selection;
        System.out.println("Welche Operation soll durchgeführt werden?\n[q] = grösstes Element\n[w] = Durchschnitt\n[e] = alle Negativen ausgeben");
        
        try{
            selection = sc.next().charAt(0);
        }catch(Exception e){
            System.out.println("\n\n\n Fehler. Falsche eingabe. \n\n");
            selection = askUser4Operation();
        }
        if(!(selection == 'q' || selection == 'w' || selection == 'e')){
            System.out.println("\n\n\n Fehler. Falsche eingabe. Nur [q][w]][e] sind erlaubt\n\n");
            selection = askUser4Operation();
        }
        return selection;
        
    }
    public static void getBiggestElementAndPrint(){
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }
        System.out.println("Max val:"+max);
        System.out.println("\n\n\n\n\n");
        main(new String[0]);
    }
    public static void getAvgAndPrint(){
        int sum = 0;
        for(int i:arr){
            //sum += i;
            sum = sum + i;
        }
        float avg = sum/arr.length;
        System.out.println("Durchschnitt des Arrays: "+avg);
        main(new String[0]);
    }
    public static void makeNegZeroAndSort(){
        int[] sortedArr = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            sortedArr[i] = 0;
        }
        int count = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] >= 0){
                sortedArr[count] = arr[i];
                count++;
            }
        }
        System.out.println("Sortierter Array: ");
        /*for(int val:sortedArr){
            System.out.print(" [ "+val+" ] ");
        }*/
        for(int i = 0;i<sortedArr.length;i++){
            System.out.print(" [["+i+"] "+sortedArr[i]+" ] \n");
        }
    }
}
