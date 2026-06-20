class Solution {
    public int maxDistance(int[] p, int m) {
        Arrays.sort(p);
        long l=1;
        long r=p[p.length - 1] - p[0];
        int ans=0;
        while(l<=r){
            long mid=(l+r)/2;
            int ball=m;
            int cu=p[0];
            ball=ball-1;
            for(int i=1;i<p.length;i++){
                if(p[i]-cu>=mid){
                    ball--;
                    cu=p[i];
                }
                if(ball==0)break;
            }
            if(ball ==0){
            ans=(int)mid;
            l=mid+1;
            }
            else{
            r=mid-1;
            }
        }
        return ans;
    }
}
