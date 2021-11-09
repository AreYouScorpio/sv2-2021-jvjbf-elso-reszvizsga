package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s){
        char[] charsOfWord = s.toCharArray();
        //String result;
        for (int i=0; i<s.length(); i+=2) {
           // if (i % 2 != 0) {
                charsOfWord[i] = s.charAt(i);
                // result =  s.charAt(i);
         //   }

        }
        String result = new String(charsOfWord);
        return result;
    }

}
