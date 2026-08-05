class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n =matrix.length;
        int m =matrix[0].length;
        int i =0;
        int j =m-1;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        while(i<n && j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                j--;
            }else{
            i++;
            }
        } 
        return false;
    }
}