//Strings are inmutable in java
public class concatination {
    //concatination means joining
    public static void main(String[] args) {
        
    String firstnmae = "Drashti";
    String lastname = "Parmar";

    String fullname = firstnmae + " " + lastname;
    System.out.println("your full name is : "+ fullname);
    
    for(int i =0; i<fullname.length(); i++){
        System.out.println(fullname.charAt(i));
    }
    
    System.out.println("the length of the String is : " + fullname.length());
    //drashti parmar = 14 is length
    
    } 
}