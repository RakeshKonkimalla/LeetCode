class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int half = n / 2;
        String sliced1 = s.substring(0, half); 
        String sliced2 = s.substring(half, n); 
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < half; i++) {
            char ch1 = sliced1.charAt(i);
            char ch2 = sliced2.charAt(i);
            if ("aeiouAEIOU".indexOf(ch1) != -1) {
                count1++;
            }
            if ("aeiouAEIOU".indexOf(ch2) != -1) {
                count2++;
            }
        }
        if ( count1 == count2){
            return true;
        }
        return false;
    }
}