package regex;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTest {

    public static void main(String[] args){
        Pattern pattern = Pattern.compile("(?:\\+|00)(\\d{1,3}) (\\(\\d{3}\\)|\\d{3})(( \\d{2}){3}|( \\d{3}){2})");
        Matcher matcher = pattern.matcher("+55 123 123 123");

        boolean checker = matcher.matches();
        if(checker) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
//        matcher.groupCount();
            for (int g = 0; g < matcher.groupCount(); g++) {
                System.out.println(matcher.group(g));
            }
        }
    }
}
