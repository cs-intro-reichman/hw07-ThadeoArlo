import java.util.Arrays;

public class HashTagTokenizerTester {

    static String FILE_NAME = "dictionary.txt";
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java HashTagTokenizerTester <function_name> <word>");
            return;
        }

        String functionName = args[0];
        String input = args[1];

        switch (functionName) {
            case "readDictionary":
                testReadDictionary();
                break;
            case "existInDictionary":
                testExistInDictionary(input);
                break;
            case "breakHashTag":
                testBreakHashTag(input);
                break;
            default:
                System.out.println("Invalid function name.");
        }
    }

    private static void testReadDictionary() {
        String[] result = HashTagTokenizer.readDictionary(FILE_NAME);
        System.out.println("Dictionary loaded successfully.");
        System.out.println("Dictionary length: " + result.length);
    }

    private static void testExistInDictionary(String word) {
        String[] dictionary = HashTagTokenizer.readDictionary(FILE_NAME);
        System.out.println("Word '" + word + "' exists: " + HashTagTokenizer.existInDictionary(word, dictionary));
    }

    private static void testBreakHashTag(String hashtag) {
        String[] dictionary = HashTagTokenizer.readDictionary(FILE_NAME);
        System.out.println("\nBreak HashTag:");
        HashTagTokenizer.breakHashTag(hashtag, dictionary);
    }
}
