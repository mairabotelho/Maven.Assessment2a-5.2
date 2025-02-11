package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {

    public static String result = "";
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        result = "";

        for(int index = string1.length() - 1; index >= 0; index--)
            result += string1.charAt(index);

        return result;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder str1 = new StringBuilder(string1);
        StringBuilder str2 = new StringBuilder(string2);

        result = str1.reverse().toString() + str2.reverse().toString();

        return result;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove){
        result = "";
        boolean check;

        for(int index = 0; index < string.length(); index++){
            check = true;
            for(int x = 0; x < charactersToRemove.length(); x++ ) {
                if (string.charAt(index) == charactersToRemove.charAt(x)) {
                    check = false;
                }

            }
            if(check)
                result += string.charAt(index);

        }

        return result;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {

        return reverse(removeCharacters(string, charactersToRemove));
    }
}
