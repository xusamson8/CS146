package HW.HW7;

public class hw7 {
    public int minMeetingRooms(int[][] intervals){
        if (intervals == null || intervals.length == 0){
            return 0;
        }
        return 
    }

    public static void main(String[] args) {
        hw7 test = new hw7();
        //given test cases
        int[][] intervals1 = {{0,30},{5,10},{15,20} }; //expected output 2
        int[][] intervals2 = {{0,1},{1,2},{2,3} }; //expected output 1
        //end of given test cases
        System.out.println(test.minMeetingRooms(intervals1));
        System.out.println(test.minMeetingRooms(intervals2));
    }
}
