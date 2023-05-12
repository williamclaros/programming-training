import java.sql.SQLOutput;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome=new Palindrome();
        System.out.println(palindrome.isPalindrome("Oruro"));
    }

    public boolean isPalindrome(String word){
        return new StringBuilder(word).reverse().toString().toLowerCase().equals(word.toLowerCase());
    }
}
