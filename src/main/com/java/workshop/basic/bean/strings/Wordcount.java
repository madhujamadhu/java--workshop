package strings;

public class Wordcount {
    public static void main(String[] args) {
        String sentance="this program shows how can we split a string into multiple strings.we need to find sentance,word and lettr count in a string";
        String dots[]=sentance.split("\\.");
        String words[]=sentance.split(" ");
        String letter[]=sentance.split("");
        System.out.println(dots.length);
        System.out.println(words.length);
        System.out.println(letter.length );
    }
    
}
