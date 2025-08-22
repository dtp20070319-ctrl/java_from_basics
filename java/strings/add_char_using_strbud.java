public class add_char_using_strbud {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e"); 
        sb.append("l");
        sb.append("l");
        sb.append("o");
        sb.append("!!!");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
