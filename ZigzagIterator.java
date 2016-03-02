package LeetCode;

import java.util.ArrayList;
import java.util.List;

//1,2,3,4,5,10
//6,7,8,9

//1,6,2,7,3,8,4,9,5
public class ZigzagIterator {
	
	int counter= 0;
	List<Integer> finalList= new ArrayList<Integer>();
	
	public static void main(String arg[]){
		ZigzagIterator zzi = new ZigzagIterator();
		List<Integer> v1= new ArrayList<Integer>();
		List<Integer> v2= new ArrayList<Integer>();

		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(6);
		v1.add(7);

		v2.add(8);
		v2.add(9);
		v2.add(10);
		v2.add(11);
		
		zzi.finalList = zzi.newList(v1, v2);
		for(int i=0;i<11;i++)
			System.out.println(zzi.next());
	}

	public List<Integer> newList(List<Integer> v1, List<Integer> v2){

		int v1LargerBy = 0;
		int v2LargerBy = 0;
		int totalSize = v1.size()+v2.size();
		int smallerListSize=0;
		List<Integer> result = new ArrayList<Integer>(totalSize);
		
		for(int i=0;i<totalSize;i++){
			result.add(0);
		}
		
			
		if(v1.size() > v2.size()){
			smallerListSize= v2.size();
			v1LargerBy = v1.size() -v2.size();
			int setIndex =totalSize-v1LargerBy;

			for(int i=v1.size()-v1LargerBy;i<v1.size();i++){
				result.set(setIndex, v1.get(i));
				setIndex++;
			}
			
		}
		else{		
			smallerListSize = v1.size();
			v2LargerBy = v2.size() -v1.size();
			int setIndex =totalSize-v2LargerBy;
			for(int i=v2.size()-v2LargerBy;i<v2.size();i++){
				result.set(setIndex, v2.get(i));
				setIndex++;
			}
		}

		for(int i=0,j=0;i<smallerListSize;i++,j=j+2){
			result.set(j, v1.get(i));
			result.set(j+1, v2.get(i));   
		}

		return result;
	}
	
	public int next(){
		if(hasNext()){
			return finalList.get(counter++);
		}
		return -1;
	}
	
	public boolean hasNext(){
		if(counter < finalList.size())
			return true;
		
		return false;
	}
}
