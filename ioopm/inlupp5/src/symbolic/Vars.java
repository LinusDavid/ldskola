package symbolic;

import java.util.Iterator;
import java.util.Map;

public class Vars extends Command {

	public String getName() {
		return "Vars";
	}

	public Sexpr eval(Map<String, Sexpr> variables) {
	//	System.out.print(variables.values());
	    Iterator<String> iterator = variables.keySet().iterator();  
	       String s = "";
	    while (iterator.hasNext()) {  
	       String key = iterator.next().toString();  
	       String value = variables.get(key).toString();  
	       s = s+key + " " + value +"\n"; 
	     //  System.out.println(key + " " + value);  
	    }  
		return new Variable(s); 
	}
	public String toString() {
	      
		return getName();
	}

}
