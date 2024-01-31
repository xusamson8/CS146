import java.util.HashMap;
import java.util.Map;

public class lab2 {
    public boolean isAnagram(String s, String t){
        //ex fired and fried
        if(s.length() != t.length()){
            return false;
        }
        else{
            Map<Character,Integer>sMap = new HashMap<>();
            Map<Character,Integer>tMap = new HashMap<>();
            int n = s.length();
            //if s and t should have the same length if the first statement is passed

            for(int i = 0 ; i < n; i ++){
                sMap.put( s.charAt(i), i);
            }
            for(int i = 0 ; i < n; i ++){
                tMap.put( t.charAt(i), i);
            }

            for(int i = 0 ; i < n ; i++){
                if(sMap.containsKey(t)){
        
                }
             }
             //compare the maps and if theyre identical then its and anagram
             //with the keys?
             //sets are a TRAP b/c of duplicates
             //array approach?
        }
        return false;
    }
}
