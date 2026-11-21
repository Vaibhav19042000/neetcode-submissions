class Solution {
    public boolean isAnagram(String s, String t) {

        if(t.length() == 0) return true;

        if(s.length()!=t.length()) return false;

        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if(m1.containsKey(temp)){
                m1.put(temp,m1.get(temp)+1);
            }
            else{
                m1.put(temp,1);
            }
        }

        for(int i = 0;i<t.length();i++){
            char temp = t.charAt(i);
            if(m2.containsKey(temp)){
                m2.put(temp,m2.get(temp)+1);
            }
            else{
                m2.put(temp,1);
            }
        }

        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if(!m1.get(temp).equals(m2.get(temp))) return false;
        }

        return true;
    }
}
