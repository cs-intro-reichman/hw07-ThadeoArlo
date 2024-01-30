public class LevenshteinTester {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java LevenshteinTester <word1> <word2>");
            return;
        }

        String word1 = args[0];
        String word2 = args[1];

        int distance = SpellChecker.levenshtein(word1, word2);

        System.out.println("Levenshtein Distance between " + word1 + " and " + word2 + ": " + distance);
    }
}
