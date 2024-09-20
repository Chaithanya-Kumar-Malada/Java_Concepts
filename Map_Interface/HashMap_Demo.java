package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo {

	public static void main(String[] args) {
		 
	HashMap<Integer,String> std = new HashMap<Integer,String>();
	
	std.put(1, "Surya");                        // put(key,value);
	std.put(2, "Chaithanya");
	std.put(3, "Lav");
	std.put(4, "Gov");
	std.put(5, null);
	std.put(6, null);
	std.put(7,"Surya");
		
		System.out.println(std);  
		System.out.println(std.get(3));          // get(key)
		System.out.println(std.size());          // size();
		
		 
		System.out.println(std.containsKey(4));    			// containsKey(key);
		System.out.println(std.containsValue("Surya"));     // containsValue(Value);
		
		System.out.println(std.remove(4));                  // remove(key);
		System.out.println(std);  
		
		
		 // Looping through Map using For loop;
		
		for(Map.Entry<Integer, String> name:std.entrySet() ) {   
			
			System.out.println("Keys : "+name.getKey()+ " Values : "+ name.getValue());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
