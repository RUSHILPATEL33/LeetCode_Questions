class Solution {
    public int minimumPushes(String word) {
    int cnt =0;
    for(int i =0;i<word.length();i++){
        cnt+=i/8+1;
    }
    return cnt;
    }
}