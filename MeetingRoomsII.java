package LeetCode;

import java.util.Arrays;

class Interval{

	int start;
	int end;

	Interval(){
		start = 0;
		end =0;
	}

	Interval(int s,int e){
		start = s;
		end = e;
	}	
}

public class MeetingRoomsII {
	public static void main(String[] args) {
		MeetingRoomsII mr = new MeetingRoomsII();
		Interval interval = new Interval(0,30);
		Interval interval2 = new Interval(5,10);
		Interval interval3 = new Interval(15,20);
		Interval interval4 = new Interval(45,50);
		Interval interval5 = new Interval(16,21);
		Interval[] arrayInterval = {interval,interval2,interval3,interval4,interval5};
		mr.minMeetingRooms(arrayInterval);

	}

	public void minMeetingRooms(Interval[] intervals){

		int arrStart[] = new int[intervals.length];
		int arrEnd[] = new int[intervals.length];

		for(int i=0; i<arrStart.length; i++){
			arrStart[i] = intervals[i].start;
			arrEnd[i] = intervals[i].end;
		}

		Arrays.sort(arrStart);
		Arrays.sort(arrEnd);

		int occupied_rooms =0;
		int max_rooms =0;
		int e=0;
		int s=0;

		while(s<arrStart.length){
			if(arrStart[s] > arrEnd[e]){
				occupied_rooms--;
				e++;
			}
			else{				
				occupied_rooms++;
				s++;
			}

			if(occupied_rooms > max_rooms){
				max_rooms = occupied_rooms;
			}
		}		
		System.out.println(occupied_rooms + "  "+ max_rooms);
	}
}
