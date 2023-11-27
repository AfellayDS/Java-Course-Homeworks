public class Main
{
    public static void main(String[] args)
    {
        String template = "String instance";

        // 1. Returns the length of a specified string
        int length = template.length();
        System.out.println("1. Length: " + length);

        // 2. Appends a string to the end of another string
        String str2 = template.concat(" immutable");
        System.out.println("2. Concatenation: " + str2);

        // 3. Returns the position of the first found
        // occurrence of specified characters in a string
        String str4 = "inst";
        System.out.println("3. Index: " + template.indexOf(str4));

        // 4. Returns a new string which is the substring of a specified string
        String str5 = template.substring(7, length);
        System.out.println("4. Substring: " + str5);

        // 5. Converts a string to upper case letters
        String str6 = template.substring(0, 6).toUpperCase();
        System.out.println("5. Upper Case: " + str6);

        // 6. Splits a string into an array of substrings
        String[] words = str2.split(" ");
        System.out.println("6. Split: ");
        for(String word : words) {
            System.out.println("\t" + word.toLowerCase());
        }

        // 7. Searches a string for a specified value,
        // and returns a new string where the specified values are replaced
        String str8 = template.replace("instance", "object");
        System.out.println("7. Replacement: " + str8);

        // 8. Returns the hash code of a string
        int hash = template.hashCode();
        System.out.println("8. Hash code: " + hash);

        // 9. Returns a formatted string
        // using the specified locale, format string, and arguments
        String product = "bread";
        double price = 4.99;
        String str = String.format("The price of %s is $%.2f", product, price);
        System.out.println("9. Format: " + str);
    }
}