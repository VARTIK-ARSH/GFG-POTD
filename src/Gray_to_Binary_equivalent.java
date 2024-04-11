public class Gray_to_Binary_equivalent {
    class Solution{

        // function to convert a given Gray equivalent n to Binary equivalent.
        public  int grayToBinary(int n) {

            // Your code here
            int ans = 0;
            while(n>0){
                ans ^= n;
                n=n>>1;
            }
            return ans;

        }

    }
}
