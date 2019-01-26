
package punktespeicherninstack;
import java.util.ArrayList;
/**
 *
 * @author Waldemar L
 */
public class StackList {
    private ArrayList<Point3D> payload;
    StackList(){
        payload = new ArrayList<Point3D>();
    };
    public boolean isEmpty(){
      return payload.isEmpty();  
    };
    public void push(Point3D p3d){
      payload.add(p3d);  
    };
    public Point3D peek(){
        int index = payload.size()-1;
        return payload.get(index);
    }
    public Point3D pop(){
        Point3D p3d = peek();
        payload.remove(payload.size()-1);
        return p3d;
    }
}
