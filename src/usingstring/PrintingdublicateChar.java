package usingstring;

public class PrintingdublicateChar {

	public static void main(String[] args) {
		
		String A = "Am Testing the Application";
		int[] count = new int[12345567];
		
		for(char ch : A.toCharArray()) 
		{
			if( ch!= ' ') {
				count[ch]++;
			}
			
		}
		System.out.println("PrintingdublicateChar");
		for(int i=0;i<count.length;i++) {
			if(count[i]>1) {
				System.out.println((char)i +" - " + count[i]);
			}
		}
		
	}

}
