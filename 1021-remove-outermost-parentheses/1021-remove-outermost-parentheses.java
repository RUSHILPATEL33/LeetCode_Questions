class Solution {
    public String removeOuterParentheses(String s) {
        int n =s.length();
        int count =0;
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i++){
            if(s.charAt(i)=='('){
                if(count>0){
                    sb.append(s.charAt(i));
                }
                count++;
            }else if(s.charAt(i)==')'){
                count--;
                if(count>0){
                    sb.append(s.charAt(i));
                }
            }
           
        }
        return sb.toString();
    }
}