package kata7;

import java.util.Objects;

public class StringEndsWith {

    public boolean solution(String str, String ending) {
        if (ending.length() > str.length()){
            return false;
        }
        String lastChars = str.substring(str.length() - ending.length());
        return Objects.equals(lastChars, ending);
    }

    public boolean shortSolution(String str, String ending) {
        return str.endsWith(ending);
    }
}
