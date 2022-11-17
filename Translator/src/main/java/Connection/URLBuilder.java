package Connection;

public class URLBuilder {

    private final String SPACE = "%20";
    private final String LINEFEED = "%0A";

    public URLBuilder(){}
    /**
     * build a string in the format that https://www.deepl.com/de/
     * uses
     * @param searchedWords
     */
    public String buildURL(String searchedWords){
        StringBuilder sb = new StringBuilder();

        for (char c : searchedWords.toCharArray()) {
            if(c == ' '){
                sb.append(SPACE);
            }
            else {
                sb.append(c);
            }
        }

        return sb.append(LINEFEED).toString();
    }
}
