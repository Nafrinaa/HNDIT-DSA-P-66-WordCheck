package wordcheck;

public class wordcheck {
 public static void main(String[] args) {
     String sentence = "Data structures and algorithms";
     String word = "algorithms";
     String[] words = sentence.split(" ");
     boolean isPresent = isWordPresent(words, word);
     System.out.println(isPresent);
 }
 public static boolean isWordPresent(String[] words, String target) {
     for (String x : words) {
         if (x.equals(target)) {
             return true; 
         }
     }
     return false;
 }
}

