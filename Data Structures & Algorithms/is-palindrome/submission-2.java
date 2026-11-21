class Solution {
    public boolean isPalindrome(String s) {
       

        StringBuilder temp = new StringBuilder();
    for(int i = 0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i)))
            temp.append(s.charAt(i));
    }

    int i = 0;
    int j = temp.length()-1;

    while(i<=j){
        if(Character.toLowerCase(temp.charAt(i)) !=Character.toLowerCase((temp.charAt(j)))){
            return false;
        }
        i++;
        j--;
    }
    return true;
    }
}
