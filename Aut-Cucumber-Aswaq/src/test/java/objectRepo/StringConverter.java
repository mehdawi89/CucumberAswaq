package objectRepo;

public class StringConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "fred";  // use this if you want to test the exception below
	    String s = "Order ID 838759";
	    String w=  s.substring(9);
	    
	    System.out.println(w);
	 
	     try
	   {
	      // the String to int conversion happens here
	      int i = Integer.parseInt(w.trim());
	 
	      // print out the value after the conversion
	      System.out.println("int i = " + i);
	    }
	    catch (NumberFormatException nfe)
	    {
	      System.out.println("NumberFormatException: " + nfe.getMessage());
	  
	  }
		
		
	}}


