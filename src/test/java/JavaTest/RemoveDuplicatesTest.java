package JavaTest;

public class RemoveDuplicatesTest {

	public static void main(String[] args) {
		String one = "I'm working in in virtusa virtusa";
        String output = removeDuplicates(one);
        System.out.println(output);
    }

    private static String removeDuplicates(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == 0 || !words[i].equals(words[i - 1])) {
                result.append(words[i]).append(" ");
            }
        }
        return result.toString().trim();
    }
}
