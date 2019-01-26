package punktespeicherninstack;
import java.util.Scanner;
import java.text.MessageFormat;
/**
 *
 * @author Waldemar L
 */
public class PunkteSpeichernInStack {
    static StackList sl = new StackList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        uiAskNextOperation();
        
    }
    static void uiAskNextOperation(){
       write("Punkt hinzufügen: [p]\nAusgabe: [q]");
       Scanner input = new Scanner(System.in);
       switch(input.next().charAt(0)){
           case 'q':
               printStack();
               break;
           case 'p':
               uiAskNextPoint();
               break;
           default:
               write("Falsche ausgabe.  Nur \"q\" und \"p\" zulässig");
               uiAskNextOperation();
               break;    
       }
    }
    static void printStack(){
        if(sl.isEmpty()){
            write("\n\n\n Speicher is leer.");
        }else{
            while(!sl.isEmpty()){
                Point3D p3d = sl.pop();
                write(MessageFormat.format("------\nx:{0}\ny:{1}\nz:{2}",Float.toString(p3d.x),Float.toString(p3d.y),Float.toString(p3d.z)));
            }
            write("\n\n\n\n fertig."); 
        }
        uiAskNextOperation();
    }
    static void uiAskNextPoint(){
        float _x,_y,_z;
        
        
        _x = tryToGetUserInputCoordinate('x');
        _y = tryToGetUserInputCoordinate('y');
        _z = tryToGetUserInputCoordinate('z');
        sl.push(new Point3D(_x,_y,_z));
        uiAskNextOperation();
    }
    static float tryToGetUserInputCoordinate(char coordID){
        Scanner input = new Scanner(System.in);
        write("Geben Sie die "+coordID+"-Koordinate ein:");
        float uInput;
        try{
            uInput = input.nextFloat();
        }catch(Exception e){
            write("Fehler bei der Eingabe. Bitte geben sie eine Zahl ein.");
            uInput = tryToGetUserInputCoordinate(coordID);
        }
        
        return uInput;
    };
    static void write(String s){
        System.out.println(s);
    };  
}