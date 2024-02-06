import java.util.Arrays;

public class lab2 {
    public boolean isAnagram(String s, String t){
       char[] sCharArr = s.toCharArray();
       char[] tCharArr = t.toCharArray();
       Arrays.sort(sCharArr);
       Arrays.sort(tCharArr);

       return Arrays.equals(sCharArr,tCharArr);
    }
}
