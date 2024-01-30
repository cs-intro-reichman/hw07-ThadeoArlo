public class SpellCheckerTester {

    static String FILE_NAME = "dictionary.txt";
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SpellCheckerTester <word> <threshold>");
            return;
        }

        String word = args[0];
        int threshold = Integer.parseInt(args[1]);

        String[] dictionary = SpellChecker.readDictionary(FILE_NAME);
        String closest = SpellChecker.spellChecker(word, threshold, dictionary);

        System.out.println("Original Word: " + word);
        System.out.println("Answer: " + closest);
    }
}
