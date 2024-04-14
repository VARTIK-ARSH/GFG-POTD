class Reverse_Bits {
    static Long reversedBits(Long x) {
        // code here
        long ans = 0,i=31;
        while(x!=0){
            ans+=(long)Math.pow(2,i)*(x&1);
            x>>=1;
            i--;
        }
        return ans;
    }
};