package VowelsAndConsonants;

public class findingvowelsandconsonants {
	
	public static void main(String args[]) {
		String str="Hello Hi";
		
		int vowels=0,consonants=0;
		
		str=str.toLowerCase();
		
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		
		System.out.println("Vowels :" + vowels);
		System.out.println("Consonants :" + consonants);
	}

}
