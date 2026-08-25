class Solution {

    public String encode(List<String> strs) {
        StringBuilder build = new StringBuilder();
        for (String st : strs) {
            int len = st.length();
            build.append(len).append("#").append(st);
        }
        return build.toString();
    }


    public List<String> decode(String str) {
            List<String> result = new ArrayList<>();
    int i =0;
        while (i<str.length()){
            int j = str.indexOf("#", i);
            int len = Integer.parseInt(str.substring(i,j));

            String word = str.substring(j+1, j+1+len);
            result.add(word);
            i = j + 1 + len;
            }

        return result;
    }
}
