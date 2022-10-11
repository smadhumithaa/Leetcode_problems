//Weekly Contest 30
//566. Reshape the Matrix
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length)
            return mat;
        int a=0;
        int[] arr=new int[r*c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr[a++]=mat[i][j];
            }
        }
        a=0;
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=arr[a++];
            }
        }
        return m;
    }
}
