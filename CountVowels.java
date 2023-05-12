public class CountVowels {
    public static void main(String[] args) {
        CountVowels countVowels = new CountVowels();
        System.out.println(countVowels.countVowels("Biblioteca", 'i'));
    }
    public int countVowels(String word, char vowel){
        int cont = 0;
        for(int i = 0; i<word.length();i++)
        {
            if(word.charAt(i)==vowel)
                cont++;
        }
        return cont;
    }
}
