package edu.oit.extra;
//2.Write a Java program to find the key of the element in an Map 
//which has the second smallest value.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class KeyElement {
	public static HashMap hashmap = new HashMap();
	public static HashMap tempHashmap = new HashMap();
	public static String getKeyByValue(Map map, Object value) {
        String keys="";
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object obj = entry.getValue();
            if (obj != null && obj.equals(value)) {
                keys=(String) entry.getKey();
            }

        }
        return keys;
	}
    public static Double minValue(HashMap hashmap){
    	Double min = 100.0;
		
		Iterator<Double> iterator = hashmap.values().iterator();
		while(iterator.hasNext()){
            Double a = iterator.next();
            if(a<min){
                min = a;
            }   
        }
		
		//System.out.println(min);
		return min;
    	} 
   

	public static void main(String[] args){
		String st = "string";
		for(Double i = 9.0; i>0.0; i--){
			hashmap.put(st+i.toString(), i);
	}
		//KeyElement.minValue(hashmap);
		tempHashmap = hashmap;
		tempHashmap.remove(getKeyByValue(hashmap, KeyElement.minValue(hashmap)));
		Double secondMinValue= KeyElement.minValue(tempHashmap);
		
		System.out.println(getKeyByValue(tempHashmap,secondMinValue));
		
	
	}
	
}

