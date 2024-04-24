import java.util.*;
public class Palindrome {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
    System.out.println("Enter sentence:");
    String sen=sc.nextLine();
    int c=count(sen);
    System.out.println(c);


    }
    public static int count(String sen){
    String[] words=sen.split("\\s+");
    int c=0;
    for(int i=0;i<words.length;i++){
        if(isPalindrome(words[i])){
            System.out.println( words[i]);
            c++;
        }
    }
    return c;
    }
    public static boolean isPalindrome(String word){
    int l=0;
    int r=word.length()-1;
    while(l<r){
        if(word.charAt(l++)!=word.charAt(r--)){
            return false;
        }
    }
    return true;
    }
}
