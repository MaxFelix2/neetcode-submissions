class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(!count.containsKey(a)){
                count.put(a, 1);
            } else {
                count.put(a, count.get(a)+1);
            }
        }
        for(int j = 0; j < t.length(); j++) {
            char b = t.charAt(j); 
            if(!count.containsKey(b)){
                return false;
            }
            count.put(b, count.get(b)-1);
        }
        int sum = 0;
        for(int key : count.values()) {
            if(key < 0){
                return false;
            }
            sum += key;
        }
        if(sum == 0) {
            return true;
        }
        return false;
    }
}
