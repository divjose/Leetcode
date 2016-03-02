package LeetCode;

import java.util.*;

public class GrayCode {
    
    List<Integer> grayCode = new ArrayList<Integer>();
    
    public static void main(String arg[]){
    	
    	GrayCode gc = new GrayCode();
    	System.out.println(gc.grayCode(4));
    }
    	
    
    public List<Integer> grayCode(int n) {        
        
        int zeroArray[] = new int[n];
        
        for(int i=0; i<n;i++){
            zeroArray[i]=0;
        }
       grayCode.add(0);
        
        
        for(int i=n-1 ;i>=0; i--){
        	if(zeroArray[i] == 0)
        		zeroArray[i] = 1;
        	else
        		zeroArray[i] = 0;
                	
            int sequence = binaryToDecimal(zeroArray);
       
            if(!grayCode.contains(sequence)){
            	grayCode.add(sequence);
            	i=n;
            }
            
            else{
            	if(zeroArray[i] == 0)
            		zeroArray[i] = 1;
            	else
            		zeroArray[i] = 0;
            	
            }
        }
		return grayCode;
        
    }
    
    public int binaryToDecimal(int arr[]){
        int counter=0; 
        int result =0;
        
        for(int i=arr.length-1;i>=0;i--){
            result =  result + (arr[i] * (int)Math.pow(2,counter));
            counter++;
        }
    return result;
    }
}

