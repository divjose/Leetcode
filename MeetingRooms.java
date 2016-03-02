package LeetCode;

import java.util.Arrays;

public class MeetingRooms {
	public static void main(String[] args) {
		MeetingRooms mr = new MeetingRooms();
		Interval interval = new Interval(0,10);
		Interval interval2 = new Interval(15,20);
		Interval interval3 = new Interval(35,40);
		//	Interval interval4 = new Interval(45,50);
		//	Interval interval5 = new Interval(16,21);
		Interval[] arrayInterval = {interval,interval2,interval3};

		System.out.println(mr.canAttendMeetings(arrayInterval));

	}

	public boolean canAttendMeetings(Interval[] intervals){

		int arrStart[] = new int[intervals.length];
		int arrEnd[] = new int[intervals.length];

		for(int i=0; i<arrStart.length ;i++){
			arrStart[i] = intervals[i].start;
			arrEnd[i] = intervals[i].end;
		}

		Arrays.sort(arrStart);
		Arrays.sort(arrEnd);

		int e = 0;
		int s = 1;

		while(s < arrStart.length && e < arrStart.length){
			if(arrStart[s] > arrEnd[e]){
				s++;
				e++;
			}
			else
				return false;
		}
		return true;
	}
}
