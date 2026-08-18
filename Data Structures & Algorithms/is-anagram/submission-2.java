class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length()!=t.length()){
            return false;
        }

       Map<Character, Integer> hmap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);

            // If char is missing in s OR count is already depleted
            if (!hmap.containsKey(ch) || hmap.get(ch) == 0) {
                return false;
            }
            hmap.put(ch, hmap.get(ch)-1);
        }
        return true;
    }
}
