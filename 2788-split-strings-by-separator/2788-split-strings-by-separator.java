class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> result = new ArrayList<String>();

        for (String word : words) {
            StringBuilder palabra = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {

                if (word.charAt(i) == separator && palabra.length() > 0) {
                    result.add(palabra.toString());
                    palabra.delete(0, palabra.length());
                }

                else if (word.length() - 1 == i && word.charAt(i) != separator) {
                    palabra.append(word.charAt(i));
                    result.add(palabra.toString());
                    palabra.delete(0, palabra.length());
                }

                else if (word.charAt(i) != separator) {
                    palabra.append(word.charAt(i));
                }

                else {
                    continue;
                }

            }
        }

        return result;

    }
}