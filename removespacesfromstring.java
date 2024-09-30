//Q8.Remove all the white spaces from the string passed to the method and return the modified string.
class Tester{

    public static String removeWhiteSpaces(String str){
		 return str.replaceAll("\\s+", "");//Implement your code here and change the return value accordingly
        
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}
