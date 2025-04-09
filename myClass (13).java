public class myClass {
    public static void main(String args[]) {
        String animal1 = "Cat";
        String animal2 = "Dog";
        String animal3 = "Cat";
        
        System.out.println("Lexicographic comparison of animal1 and animal2 : " + animal1.compareTo(animal2));
        System.out.println("Lexicographic comparison of animal1 and animal3 : " + animal1.compareTo(animal3));
        System.out.println("Lexicographic comparison of animal2 and animal1 : " + animal2.compareTo(animal1));
    }
}