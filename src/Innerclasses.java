
public class Innerclasses {
	
	public static void main(String[] args) {
		
		Testing clas = new Testing();
		clas.NestedStaticClass();
		
		
	}
	
}

class Testing
{

public void NestedStaticClass() {
      int x = 10;
      int y = 20;
      int z = x+y;
      System.out.println("The output is " + z);
      
      class data
      {
    	  public void rundata()
    	  {
    		  System.out.println("Execution Finished!");
    	  }
      }
      data obj = new data();
      obj.rundata();
      
   } 

}
