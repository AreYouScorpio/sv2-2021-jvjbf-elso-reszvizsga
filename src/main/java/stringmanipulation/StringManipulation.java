package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s){
        char[] charsOfWord = s.toCharArray();
        for (int i=1; i<charsOfWord.length; i+=2) {
                charsOfWord[i] = 0;


        }
        String result = new String(charsOfWord);
        return result;
    }

}
