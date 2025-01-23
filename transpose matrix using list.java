class Solution {
    public int[][] transpose(int[][] matrix) {
        int c=matrix[0].length;
        int r=matrix.length;
        
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<c;i++){
            List<Integer> t=new ArrayList<>();
            for(int j=0;j<r;j++){
                 t.add(matrix[j][i]);
            }
            l.add(t);
        }
        int[][] a=new int[l.size()][];
        for(int i=0;i<l.size();i++){
            List<Integer> rr=l.get(i);
            a[i]=rr.stream().mapToInt(Integer::intValue).toArray();
        }
        return a;

    }
}