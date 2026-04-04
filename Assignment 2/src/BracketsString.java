public class BracketsString {
    private String string;
    public BracketsString(String str)
    {
        string = str;
    }
    //task5
    public boolean BalancedBrackets()
    {
        char[] charArray = string.toCharArray();
        for (int i = 1; i < string.length()/2 ; i++ ){
            if (charArray[i] == '(' && charArray[string.length()-i] == ')' )
                return true;
        }
        return false;
    }
}
