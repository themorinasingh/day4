public class myClass {
    public static void main(String args[]) {
        String batman = "Hi, I am Batman";
        String manbatman = new String("I am manBatMan");//after i update this, the content will go for garbage collection
        System.out.println(batman);
        System.out.println(manbatman);
        System.out.println("Bat Man:  are you?");
        manbatman = "No Sir";
        System.out.println(manbatman);
    }
}