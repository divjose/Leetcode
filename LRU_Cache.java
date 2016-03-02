package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Pair{

	private int key;
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Pair(int key,int value){
		this.key=key;
		this.value=value;
	}

}


public class LRU_Cache {

	private int capacity;
	ArrayList<Pair> arrayList = new ArrayList<Pair>();

	public static void main(String args[]){

		LRU_Cache lru_cache = new LRU_Cache(5);

		lru_cache.set(1,1);
		lru_cache.display();
		System.out.println("-----");
		lru_cache.set(2,1);
		lru_cache.display();
		System.out.println("-----");
		lru_cache.set(3,1);
		lru_cache.display();
		System.out.println("-----");
		lru_cache.set(1,2);
		lru_cache.display();
		System.out.println("-----");
		lru_cache.set(2,2);
		lru_cache.display();
		System.out.println("-----");
		lru_cache.set(1,3);
		lru_cache.display();
		System.out.println("-----");
		lru_cache.set(4,4);
		lru_cache.display();
		System.out.println("-----");
		lru_cache.set(5,5);
		lru_cache.display();
		System.out.println("-----");
		lru_cache.set(6,6);
		lru_cache.display();
	}

	public void display(){
		for(Pair i: arrayList){
			System.out.println(i.getKey() +" " + i.getValue());
		}
	}

	public LRU_Cache(int capacity) {
		this.capacity= capacity;
	}

	public int get(int key) {
		//get the key least recently used
		for(Pair i: arrayList){
			if(i.getKey()==key){
				return i.getValue();
			}
		}
		return -1;
	}
	

	public void set(int key, int value) {

		Pair p = new Pair(key,value);
		boolean elementFound = false;
		int currentIndex = 0;
		
		for(Pair i: arrayList){
			if(i.getKey()==key){
				elementFound= true;
				break;
			}
			currentIndex++;
		}
		
		if(elementFound){
			arrayList.remove(currentIndex);
			capacity++;
		}

		if(capacity==0){
			arrayList.remove(0);
			capacity++;
		}
		
		arrayList.add(p);
		capacity--;
	}
}
