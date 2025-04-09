public class myClass {
    public static void main(String args[]) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        
        System.out.println(str1 == str2);
        System.out.println(str3 == str2);//we are not comparng contentm we are comparing refrrences
    }
}