//import java.util.*;
public class Stringbuilder {
public static void main(String[] args) {
StringBuilder sb = new StringBuilder("tony");
System.out.println(sb);

//if end and run the output will be "tony"

//char at index 0
System.out.println(sb.charAt(0));

//to insert  (index number to be change , what to insert )
sb.insert(2,'n');
System.out.println(sb);

//to delete the cahracter or string lets delete the insered "n"
//(starting index , ending index(does not incule))
sb.delete(2,3);
System.out.println(sb);
}    
}
 