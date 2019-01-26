package zerlegungvonzahlen;

import java.util.Scanner;

/**
 *
 * @author Waldemar L
 */
public class ZerlegungVonZahlen {
    public static void main(String[] args) {
        System.out.println("Bitte geben sie eine ganze Zahl ein:");
        long number = askUserToEnterInt();
        splitLong(number);
    }
    public static long askUserToEnterInt(){
        Scanner sc = new Scanner(System.in);
        
        long num;
        try{
            num = sc.nextLong();
        }catch(Exception e){
            System.out.println("Fehler: Geben sie eine ganze Zahl ein.");
            num = askUserToEnterInt();
        }
        return num;
    }
    public static void splitLong(long number){
        boolean isNegative = false;
        if(number < 0){
            number = number * -1;
            isNegative = true;
        }
        long num = number;
        int length = (int)Math.floor(Math.log10(number)+1);
        long[] arr = new long[length]; 
        for(int i=0;i<length;i++){
            long rem = num%10;
            num -= rem;
            num = num/10;
            if(rem == 0){
                continue;
            }
            arr[i]=rem;
        }
        for(int i = arr.length-1;i>=0;i--){
            if(isNegative){
                System.out.println("-"+arr[i]+" x10^ "+i);
            }else{
                System.out.println("+"+arr[i]+" x10^ "+i);
            }
            
        }
        main(new String[0]);
        
    }
    
}
