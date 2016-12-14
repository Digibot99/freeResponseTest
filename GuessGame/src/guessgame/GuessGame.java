//Output is below
//
//HARPS
//AAAAA +A+++
//HELLO H****
//HEART H*++*
//HARMS HAR*S
//HARPS HARPS

package guessgame;
public class GuessGame {

    public static void main(String[] args) {        
        System.out.println("HARPS");
        HiddenWord word = new HiddenWord("HARPS");

        System.out.println("AAAAA " + word.getHint("AAAAA"));
        System.out.println("HELLO " + word.getHint("HELLO"));
        System.out.println("HEART " + word.getHint("HEART"));
        System.out.println("HARMS " + word.getHint("HARMS"));
        System.out.println("HARPS " + word.getHint("HARPS"));
    }
}

class HiddenWord
{
    private String hiddenWord;
    public HiddenWord(String _hiddenWord)
    {
        hiddenWord = _hiddenWord;
    }
    public String getHint(String guess)
    {
        String resultStr = "";
        return(resultStr);
    }
}
