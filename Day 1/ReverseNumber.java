class ReverseNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }


        int n=x;
        int RevNo=0;

        while(n>0){
            int d=n%10;

            RevNo=RevNo * 10 + d;

            n=n/10;

        }
        if(RevNo==x){
            return true;
        }else{
            return false;
        }

    }
}