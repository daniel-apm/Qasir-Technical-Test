import java.util.HashMap;

public class QasirTechTest {
    public static void main(String args[]) {
      //Initialize first object
      HashMap<Character, Integer> objA = new HashMap<Character, Integer>();
      objA.put('a', 10);
      objA.put('b', 20);
      objA.put('c', 30);
      objA.put('f', 4);
      
      //Initialize second object
      HashMap<Character, Integer> objB = new HashMap<Character, Integer>();
      objB.put('a', 3);
      objB.put('c', 6);
      objB.put('d', 3);
      objB.put('e', 5);
      objB.put('f', 9);
      
      //Print out combined object
      System.out.println(combine(objA, objB));
    }
    
    public static HashMap combine(HashMap<Character, Integer> objA, HashMap<Character, Integer> objB) {
        HashMap<Character, Integer> combineObj = new HashMap<>(objA);
        for (Character key: objB.keySet()) {
            if (objA.containsKey(key) == true) {
                Integer combineVal = objA.get(key) + objB.get(key);
                combineObj.put(key, combineVal);
            } else {
                combineObj.put(key, objB.get(key));
            }
        }
        return combineObj;
    }
}