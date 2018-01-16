import com.tw.practice.Vowel;
import com.tw.practice.StringReader;
import com.tw.practice.Printer;

public class Main {
    public static void main(String[] args) throws Exception{
        Vowel vowel = new Vowel();
        new Printer().print(vowel.replaceVowel( new StringReader().read()));
    }
}
