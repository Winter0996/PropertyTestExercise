package softwaretesting;

public class Letters {
    public static String processString(String input) {
        // Convert inputted String to uppercase
        String result = input.toUpperCase();

        // If a letter 'S' occurs, remove it
        result = result.replaceAll("S", "");

        return result;
    }

    public static void main(String[] args) {
        String input = "Saturday Sunday";
        String processedString = processString(input);
        System.out.println(processedString);
    }
}
