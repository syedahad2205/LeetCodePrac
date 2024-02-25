import java.util.HashMap;

public class IsValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            freqMap.put(c,freqMap.getOrDefault(c, 0) + 1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!freqMap.containsKey(ch)){
                return false;
            }
            freqMap.put(ch,freqMap.getOrDefault(ch, 0) - 1);
            if(freqMap.get(ch) == 0){
                freqMap.remove(ch);
            }
        }
        return freqMap.isEmpty();
    }
}
