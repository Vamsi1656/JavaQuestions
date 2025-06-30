package DuplicateCharacters;

public class FindingDuplicateCharacters {

    public static void main(String args[]){
        int[] count=new int[256]; // ASCII value representation for characters

        String str="Programming";
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }

        for(int i=0;i<256;i++){
            if(count[i]>1) {
                System.out.println((char) i + "=" + count[i]);
            }

        }
    }
}
