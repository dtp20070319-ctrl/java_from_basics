//Strings are inmutable in java

public class removeSubString {
    public static void main(String[] args) {
        String sentence = "my name is Drashti";
         //(starting index , ending index-1)
        String name = sentence.substring(11, sentence.length()); // Extracts "Drashti"
        System.out.println(name);
    }
}