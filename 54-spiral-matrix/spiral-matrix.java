class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int left=0;
        int right=matrix[0].length-1;
        int down=matrix.length-1;
        
        List<Integer> list=new ArrayList<>();
        int dir=0;

        while(top<=down && left<=right){
            //left to right
            //constant: row (top)
            if(dir==0){
                for(int i=left;i<=right;i++){
                    list.add(matrix[top][i]);
                }
                top++;
            }
            
            //top to bottom
            //constant: column (right)
            if(dir==1){
                for(int i=top;i<=down;i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }
            
            //right to left
            //constant: row (down)
            if(dir==2){
                for(int i=right;i>=left;i--){
                    list.add(matrix[down][i]);
                }
                down--;
            }
            
            //bottom to top
            //constant: left
            if(dir==3){
                for(int i=down; i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
            dir++;

            if(dir==4){
                dir=0;
            }
        }
        return list;
    }
}