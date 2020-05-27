import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Stringwithouthashmap 
{
	public static void main(String[] args) 
	{
		String str = "Koushickaeio";
		
		List<String> list = Arrays.asList(str.split(""));
		
		Set<String> string = new HashSet<String>(list);
		
		for(String dup:string){
			
			System.out.println(dup + "----------->" + Collections.frequency(list, dup));
		}
		
	}

}
