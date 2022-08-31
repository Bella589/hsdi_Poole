import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;


class main {
	static final long createdNano = System.nanoTime();

	public static void main(String args[]) {
		long start = System.nanoTime();
		long finish = System.nanoTime();
		System.out.println("Created: " + createdNano);
		
		int [] times = {10, 100, 1000, 10000, 100000, 1000000, 10000000};
		int [] nums = new int[100];


		System.out.println("-------------------Test-------------------");
		System.out.println("");
		for(int i : times){
			System.out.println("Interval: " + i);
			
			nums = new int[i];
			start = System.nanoTime();
		}

			//  Put your method between these two comments
		
					int[] arr = new int[1000];
		
				for (int t = 0; t < arr.length; t++) {
					int  x = (int)(Math.random()*1000);
					arr[t] = x;
					System.out.print(arr[t] + " ");
		}
		
				for(int outer = 0; outer < arr.length-1;outer++){
					for(int inner = 0; inner<arr.length-outer-1;inner++){
						if(arr[inner]>arr[inner+1]){
							int temp = arr[inner];
							arr[inner]=arr[inner+1];
							arr[inner+1] = temp;
						}
					}
				}
				
			//

			finish = System.nanoTime();
			System.out.println("Started: " + start);
			System.out.println("Finished: " + finish);
			System.out.println("Duration: " + (finish-start));
			System.out.println("");
			///
			//randomise
			
				
		System.out.println("");
		System.out.println("");
		System.out.println("The sorted array list is;");

		for (int e = 0; e < arr.length; e++) {
			System.out.print(arr[e] + " ");
		}
		/////////////////
		///insertion
		
		int[] arr2 = new int[1000];
		
		for (int f = 0; f < arr2.length; f++) {
			int  x = (int)(Math.random()*1000);
			arr2[f] = x;
			System.out.print(arr2[f] + " ");
		}
		
 		int outer, inner, key;
		
		for(outer = 1; outer < arr2.length; outer++){
			key= arr2[outer];
			inner = outer-1;
			
			while(inner >= 0 && arr2[inner]>key){
				arr2[inner+ 1] = arr2[inner];
				inner = inner - 1;
			}
			arr2[inner + 1] = key;
			}
			
		System.out.println("");
		System.out.println("");
		System.out.println("The sorted array list is;");
		for (int f = 0; f < arr2.length; f++) {
			System.out.print(arr2[f] + " ");
		}
		///////////////
		///Selection sort
	
		int[] arr1 = new int[1000];

		for (int h = 0; h < arr1.length; h++) {
			int  x = (int)(Math.random()*1000);
			arr1[h] = x;
			System.out.print(arr1[h] + " ");
		}
		
 		int outer1, inner1, key1;
		
		for(outer1 = 1; outer1 < arr1.length; outer1++){
			key1= arr1[outer1];
			inner1 = outer1-1;
			
			while(inner1 >= 0 && arr1[inner1]>key1){
				arr1[inner1+ 1] = arr1[inner1];
				inner1 = inner1 - 1;
			}
			arr1[inner1 + 1] = key1;
			}
			
		System.out.println("");
		System.out.println("");
		System.out.println("The sorted array list is;");
				for (int j = 0; j < arr1.length; j++) {
					System.out.print(arr1[j] + " ");
		}
	}
	
	}
	
			
	

