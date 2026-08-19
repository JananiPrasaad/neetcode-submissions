class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          HashMap<String, List<String>> hmap = new HashMap<>();

        for(String word : strs){
            char[] carr = word.toCharArray();
            Arrays.sort(carr);
            String finalWord = new String(carr);


            hmap.putIfAbsent(finalWord, new ArrayList<>());
            hmap.get(finalWord).add(word);
        }

        return new ArrayList<>(hmap.values());
    }
    }
