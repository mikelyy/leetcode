class Solution {
    public int tribonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (n==2){
            return 1;
        }
        int a=0;
        int b=1;
        int c=1;
        
        for (int i=2; i<n; i++){
            int temp=c;
            c+=a+b;
            a=b;
            b=temp;
        }
        return c;
    }
}