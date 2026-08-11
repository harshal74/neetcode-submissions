class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        String ans = "";
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].equals(""))
                return "";
            String temp1 = "";
            String temp2 = "";
            if (strs[i].length() < temp.length()) {
                temp2 = strs[i];
            } else {
                temp2 = temp;
            }

            for (int j = 0; j < temp2.length(); j++) {
                if (temp.charAt(j) == strs[i].charAt(j)) {
                    temp1 += temp.charAt(j);
                } else if (temp1.length() == strs[i].length()) {
                    temp = strs[i];
                    break;
                } else {
                    if (temp.length() > temp1.length()) {
                        temp = temp1;
                    }
                    break;
                }
            }
            if (temp1.length() == temp2.length()) {
                temp = temp1;
            }
        }
        return temp;
    }
}