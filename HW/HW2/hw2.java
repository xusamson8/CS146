public class hw2 {
    public static boolean isBadVersion(int version) {
        return version >= 9;
    }
    //above is purely for test cases
    //You are given an API bool isBadVersion(version) which returns whether version is bad. 
    public static int firstBadVersion(int n) {
        int low = 1, high = n;
        while(low <= high){                     //exit loop when low > high
            int mid = low + (high - low)/2;
            if(isBadVersion(mid)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int n = 10; // let's say we have 10 versions
        int result = firstBadVersion(n);
        System.out.println("The first bad version is " + result);
    }

}
