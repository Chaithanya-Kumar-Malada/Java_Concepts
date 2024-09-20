package Optional_Class;

import java.util.Optional;


	public class Main {
	  
	    public static void main(String[] args){
	    	
	        String[] words = new String[10];
	        
	        //	words[2] = "hi i am ";
	        
	          Optional<String> obj1 = Optional.empty();
	          	System.out.println(obj1);

	        	
        	// Optional<String> value = Optional.of(words[2]);
        	 	//System.out.println(value);
	          
	        	
	        	
	        Optional<String> obj = Optional.ofNullable(words[2]);
	        
	        if(obj.isPresent()) {
	        	
	        	String word = words[2].toUpperCase();
	        	
	        	System.out.println("word present : "+word);
	        }else {
	        	System.out.println("Null no values");
	        
	        }
	        
	   
	          
	}
	}
