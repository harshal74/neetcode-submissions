class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<=s.length()-1; i++){
            map.merge(s.charAt(i), 1, Integer::sum);
        }
        for(int i = 0; i<=s.length()-1; i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }
            if(map.containsKey(t.charAt(i)) ){
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                if(map.get(t.charAt(i))<0){
                    return false;
                }
            }
        }
        return true;
    }
}
