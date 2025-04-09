public class myClass {
    public static void main(String args[]) {
        String quote = "May the forth be with you";
        int length = quote.length();
        System.out.println(length);
        
        char firstChar = quote.charAt(0);
        char tenthChar = quote.charAt(9);
        System.out.println("First Character : " + firstChar);
        System.out.println("Tenth Character : " + tenthChar);
    }
}