package practice;

public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String compressed = compress("eeefffggg");
		System.out.println(compressed);
		System.out.println(decompress(compressed));

	}
	
	public static String compress(String og) {

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < og.length(); i++) {
            if (og.charAt(i) == og.charAt(i - 1)) {
                count++;
            } else {
                result.append(og.charAt(i - 1));
                if (count > 1) result.append(count);
                count = 1;
            }
        }

        // last characters
        result.append(og.charAt(og.length() - 1));
        if (count > 1) result.append(count);

        return result.toString();
	}
	
	public static String decompress(String compressed) {
		
    StringBuilder result = new StringBuilder();
    int i = 0;

    while (i < compressed.length()) {
        char ch = compressed.charAt(i);
        i++;
        StringBuilder countstr = new StringBuilder();

        while (i < compressed.length() && Character.isDigit(compressed.charAt(i))) {
            countstr.append(compressed.charAt(i));
            i++;
        }

        int count = countstr.length() > 0 ? Integer.parseInt(countstr.toString()) : 1;

        for (int j = 0; j < count; j++) {
            result.append(ch);
        }
    }

    return result.toString();
}

}
