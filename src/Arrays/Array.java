package Arrays;

public class Array 
{
	public static void main(String[] args) {
		
		int[] arr = new int[2];
		arr[0]=10;
		arr[1]=50;
		System.out.println(arr.length);
		
		String[] str = {"aeiou","aasdf"};
		str[1]="cfff";
		System.out.println(str[1]);
		
		String dd = "skiyou";
	
			String finaldata =dd.replace("i", "s");
			String finaldata1 =finaldata.replace("o", "k");
			String finaldata2 =finaldata1.replace("u", "k");
			

			System.out.println(finaldata2);

		
	}

}
