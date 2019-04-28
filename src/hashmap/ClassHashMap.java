
package hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sumon
 */
public class ClassHashMap {
    public static String a = "A";
    public static String b = "B";
    public static String c = "C";
    public static String d = null;
    public static String e = "E";
    public static String f = "F";
    public static String g = "G";
    public static String h = "H";
    public static String i = "I";
    public static String j = "J";

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("A", a);
        hm.put("B", b);
        hm.put("C", c);
        hm.put("D", d);
        hm.put("E", e);
        hm.put("F", f);
        hm.put("G", g);
        hm.put("H", h);
        hm.put("I", i);
        hm.put("J", j);
        
        System.out.println(hm.get(e)); // Key by Value.
        System.out.println(hm.clone()); // Show All Key and Value.
        
        //hm.computeIfAbsent("K", k -> "K"); // If Key does not exit then you can put by conditionally. Here if Key 'K' not exits then put it.
        //System.out.println("HashMap : "+hm);
         
        if(hm.isEmpty())                // Check map is Empty or Fill
            System.out.println("hm is empty." );
        else
            System.out.println("hm not empty.");
        
        System.out.println("containsKey :" + hm.containsKey("H")); // Return true/false on given key available or not in map. 
        
        System.out.println("containsValue :"+ hm.containsValue(h)); // Return true/false on given value available or not in map.
        
        System.out.println("entrySet :"+hm.entrySet()); // Show all key and value
        System.out.println("entrySet :"+hm.entrySet().size()); // Show how many keyset available in map
        
        System.out.println("hm.get(e) :"+ hm.get(e)); // Return Key name of Value.
        
        // Looping in map
        for (Map.Entry<String, String> entry : hm.entrySet()) { // For loop genarate by map
         String key = entry.getKey();
            System.out.println("key = " + key);
         Object value = entry.getValue();
            System.out.println("value = " + value);
         
        }
        
    }
    
    
    
}
