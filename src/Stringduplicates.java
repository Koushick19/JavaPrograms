import java.util.HashMap;
import java.util.Set;


public class Stringduplicates 
{
	
	public void findstring(String searchkey)
	{
		HashMap<Character, Integer> Map = new HashMap<Character, Integer>();
		char[] ch = searchkey.toCharArray();
		
		for(Character chararry:ch)
		{
			if(Map.containsKey(chararry))
			{
				Map.put(chararry, Map.get(chararry)+1);
			}
			else
			{
				Map.put(chararry, 1);
			}
		}
		Set<Character> keys = Map.keySet();
		
		for(Character chararry:keys)
		{
			if(Map.get(chararry)>=1)
			{
				System.out.println(chararry + " is " + Map.get(chararry) + " times ");
			}
		}
		
	}

	public static void main(String[] args) 
	{
		Stringduplicates obj = new Stringduplicates();
		obj.findstring("Koushickaeio");
		
	}
}
