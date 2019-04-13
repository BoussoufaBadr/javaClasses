package Pack1;

public class Main1 {

	
		
		 static String mixString(String s1, String s2){
			word="";
		for (int i=0;i<s1.length();i++){
		 word=word+(s1.substring(i,i+1)+s2.substring(i,i+1));
		}
		return word;
		}
		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(mixString("12345","abcde")); //should be 1a2b3c4d5e
			System.out.println(mixString("howdy","hello")); //should be hhoewldlyo
		}
	}
		
		