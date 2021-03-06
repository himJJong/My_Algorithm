//(20/100) 배열로 풀었을 때 
package algorithm;

import java.util.Arrays;		//필요한 것 Import
import java.util.Scanner;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		int[] properties = {6,2,1,8,2,3,5,3};
		int[] newarr = new int[properties.length];
		int location =2;
		int answer = 0;
		int max=properties[0];
		int index = 0;
		
		for(int i=1; i<properties.length;i++) {
			if(properties[i]>max) {
				max=properties[i];
				index=i;
			}
			else
				continue;
		}
		
		int num =0;
		//우선순위 첫 번째 뒤로 새로운 배열에 대입 
		for(int i=index; i<properties.length;i++) {
			newarr[num]=properties[i];
			num++;
		}
		//우선순위 앞쪽 순서대로 새로운 배열에 대입 
		for(int i=0; i<index;i++) {
			newarr[num]=properties[i];
			num++;
		}

		if(index==location) {
			answer = 1;
		}
		else if(location>index) {
			answer=location-index+1;
		}
		else {
			answer = (properties.length-index)+(location+1);
		}
		
		System.out.println(answer);
	}
}

// 우선순위큐를 이용한 풀이

import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
      
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int answer = 0;
		
		for(int i=0; i<priorities.length ; i++) {
			pq.add(priorities[i]);
		}
		
		while(!pq.isEmpty()) {
			for(int i=0; i<priorities.length;i++) {
				if(priorities[i]==pq.peek()) {
					if(i==location) {
						answer++;
						return answer;
					}
					pq.poll();
					answer++;
				}
			}
		}
		return -1;
	}
}
		
