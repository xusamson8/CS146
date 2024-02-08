public class hw2 {
    //You are given an API bool isBadVersion(version) which returns whether version is bad. 
    public boolean firstBadVer(int n){
        int low = 1, high = n;
        while(low <= high){    //loop exits when low > high
            int mid = low + (high - low)/2;
            if(isBadVersion(mid)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
