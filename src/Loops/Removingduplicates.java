package Loops;

public class Removingduplicates 
{	
	public static void main(String[] args) {
		Removingduplicates obj = new Removingduplicates();
		obj.FindDuplicate("KoushicK");
	}
	
	public void FindDuplicate(String dup)
	{
		int sum=0;
		for(int i=0;i<dup.length();i++)
		{
			if(dup.charAt(i)!= '-' && dup.charAt(i)!= ' ')
			{
			for(int j=0;j<dup.length();j++)
			{
				if (dup.charAt(i)==dup.charAt(j)) 
				{
					sum++;
				}
			}
			System.out.println(dup +"---------->" + sum + dup.charAt(i));
			String Duplicate = dup.replace(dup.toLowerCase(), dup.toUpperCase()).trim();
			dup.replaceAll(Duplicate, "");
			sum=0;

		}
		}
	}
	

}
