public class myClass {
    public static void main(String args[]) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        
        //comparing the references of variables
        System.out.println("Comparing str1 and str2 with ==, result : " + (str1 == str2));
        System.out.println("Comparing str1 and str3 with ==, result : " + (str1 == str3));
        
        //comparing the value of the variables instead of the references
        System.out.println("\nComparing str1 and str2 with .equals(), result : " + (str1.equals(str2)));
        System.out.println("Comparing str1 and str3 with .equals(), result : " + (str1.equals(str3)));
        
        //comparing the stirng alues, but ignoring the case so java = Java, in this case
        String str4 = "java";
        System.out.println("\nComparing the str1 and str4 with .equalsIgnoreCase(), result : " + (str1.equalsIgnoreCase(str4)));
        
    }
}