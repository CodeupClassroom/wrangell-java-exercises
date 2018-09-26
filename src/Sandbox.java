import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;


public class Sandbox {

    public static void main(String[] args) {
//    String[] array = new String[10];
        HashMap<String,String> classRoster = new HashMap<>();
        classRoster.put("first", new String("Chris"));
        classRoster.put("second", "Hello");
        classRoster.put("fifteenth", "World");
        classRoster.replace("second", "Goodbye");
        String hello = new String("Hello");
        System.out.println(classRoster);
        classRoster.clear();
        System.out.println(classRoster);
    }



}
