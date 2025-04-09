public class myClass {
    public static void main(String args[]) {
        String phrase = "The golden fox";
        System.out.println("Original -> " + phrase);
        //replacing chatacters
        String newPhrase = phrase.replace('o','k');
        System.out.println("New -> " + newPhrase);
        //coverting to uppercase
        String upperCased  = phrase.toUpperCase();
        System.out.println("Upper Cased String -> " + upperCased);
        //converting to lowercase
        String lowerCased  = phrase.toLowerCase();
        System.out.println("Lower Cased String -> " + lowerCased);
    }
}