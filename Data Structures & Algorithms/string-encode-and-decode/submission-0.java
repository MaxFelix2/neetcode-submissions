class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        char[] strArray = str.toCharArray();
        int index = 0;
        while (index < str.length()) {
            int j = index;
            while(strArray[j] != '#') {
                j++;
            }
            String lengthString = String.valueOf(Arrays.copyOfRange(strArray, index, j));
            int length = Integer.parseInt(lengthString);
            res.add(String.valueOf(Arrays.copyOfRange(strArray, j+1, j+1+length)));
            index = j + 1 + length;
        }
        return res;
    }
}
