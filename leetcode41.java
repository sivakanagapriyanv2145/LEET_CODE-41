class Solution {
    public int firstMissingPositive(int[] nums) {
        int i,j,k=0,l=0;
        int p[]=Arrays.stream(nums).filter(n->n>0).toArray();
        Arrays.sort(p);
       
            k=1;
            for(i=0;i<p.length;i++)
            {
                if(k==p[i]){
                    k++;
                }
                else if(p[i]>k){
                    break;
                }
                
               
            }
        
        return k;
    }
}
