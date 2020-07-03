public class test1 {
<<<<<<< HEAD
	   public void reverseWordInMyString(String str)
	   {
	         
	                String[] words = str.split(" ");
	                String reversedString = "";
	               // Fix #1: pls complete the code here
           for (int i=(words.length-1);i>=0;i--)
	        {
	           String word = words[i];
	           String reverseWord = "";
	          // Fix #2: pls complete the code here
                       for(int j=(word.length()-1);j>=0;j--)
	                   {                
	                                reverseWord = reverseWord + word.charAt(j);
	                   }
	                   reversedString = reversedString + reverseWord + " ";
	                }
	                System.out.println(str);
	                System.out.println(reversedString);
	   }
	   public static void main(String[] args)
	   {
		   test1 obj = new test1();
	       obj.reverseWordInMyString("dlog fo gniws a no gnigniws nosdnarg reh ees ot stnaw rehtom ym");
	   }
}
=======

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World!!");
	}

}
>>>>>>> 1fef35c7d7508fd68559b5f5633edf9bf06a043e
