package Serching;

import java.util.*;

public class SearchTarget {

	private static int[] getSumOfTwo(int[] number,int target) {
		Map<Integer,Integer> sumnum= new HashMap<>();
		
		
		for(int i=0; i<number.length; i++) {
			
			int delta = target - number[i];//will find sum number
					
			if(sumnum.containsKey(delta)) {
				return new int[] {i,sumnum.get(delta)};
			}
			sumnum.put(number[i],i);//must follow sequence number
		}
		return new int[]{-1,-1};
	}
		
		
	public static void main(String[] args) {

		
		int[] number= new int[]{2,3,5,4,7,10};
		
		int target=7;
		
		int[] result = getSumOfTwo(number,target);
		
		System.out.println(result[0]+" "+result[1]);// show index of sum numbers

	}


}
