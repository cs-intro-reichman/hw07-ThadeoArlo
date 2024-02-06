public class HashTagTokenizer {
	public static void main(String[] args) {
		String hashTag = args[0];
		String[] dictionary = readDictionary("dictionary.txt");
		breakHashTag(hashTag, dictionary);
	}

	public static String[] readDictionary(String fileName) {
		String[] dictionary = new String[3000];
		In in = new In(fileName);
		for (int i=0; i<dictionary.length; i++) {
			dictionary[i] = in.readLine();
		}
		return dictionary;
	}

	public static boolean existInDictionary(String word, String []dictionary) {
		for (int i=0; i<dictionary.length; i++) {
			if (dictionary[i].equals(word)) return true;
		}
		return false;
	}

	public static void breakHashTag(String hashtag, String[] dictionary) {
		String hash = hashtag.toLowerCase();
        if (hash.isEmpty()) return;
		int j=0;
        for (int i=1; i<=hash.length(); i++) {
			String sub = hash.substring(j,i);
			if (existInDictionary(sub, dictionary)) {
				j=i;
				System.out.println(sub);
				breakHashTag(hash.substring(j,i), dictionary);
			}
        }
    }
}