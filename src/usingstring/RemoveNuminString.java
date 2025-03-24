package usingstring;

public class RemoveNuminString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String A ="Guru0001Paaji70Happy30";
		char [] charArray = A.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char temp : charArray ) {
			if(!Character.isDigit(temp)) {
				sb.append(temp);
			}
		}
System.out.println(sb);
	}

}
