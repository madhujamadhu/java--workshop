package strings;

public class Sentances {
    public static void main(String[] args) {
    String sentance="this program shows how can we split a string into multiple strings";
    String words[]=sentance.split(" ");
    System.out.println(words.length);
    for(String word :words){
        System.out.println(word);
    }
    }
    
}
