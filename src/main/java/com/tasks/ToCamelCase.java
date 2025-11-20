package tasks;

public class ToCamelCase {

    public static void main(String[] args) {
        System.out.println("the_Stealth_Warrior");
        System.out.println(toCamelCase("the-stealth-warrior"));
    }

    public static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '-' || sb.charAt(i) == '_') {
                sb.deleteCharAt(i);
                if (!Character.isUpperCase(sb.charAt(i))) {
                    sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                }
            }
        }
        return sb.toString();
    }
}
