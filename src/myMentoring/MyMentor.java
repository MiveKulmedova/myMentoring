package myMentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyMentor {

	public static void main(String[] args) {

		// write a java code add element to hashMap and get values from that

//		Map<String, Integer> mp = new HashMap<>();
//		mp.put("cat", 2);
//		mp.put("dog", 1);
//		mp.put("fish", 3);
//
//		System.out.println(mp.get("cat"));
//		System.out.println(mp.values());
//		System.out.println(mp.keySet());
//		System.out.println(mp.containsKey("bird"));

		// how to get max value from arrayList
//		ArrayList<Integer> ls = new ArrayList<>();
//		ls.add(2);
//		ls.add(100);
//		ls.add(20);
//		ls.add(99);
//		
////		System.out.println(ls.size());
////		System.out.println(ls.get(2));
//		
//		
//		Integer max=ls.get(0);
//		for(int i=0; i<ls.size(); i++) {
//			if(ls.get(i)>=max) {
//				max=ls.get(i);
//			}
//		}
//
//		System.out.println(max);

		
		//reverse a String using Scanner
		
//		System.out.println("Enter a String to reverse: ");
//
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		String reverse="";
//		
//		for(int i=str.length()-1; i>=0; i--) {
//			reverse=reverse+str.charAt(i);
//		}
//		System.out.println("Reversed string is: "+ reverse);
		
	// remove duplicate letter
		
//		String str="pppaaabbbcccddd";
//		String[]arr=str.split("");
//		List<String>l1=new ArrayList<>(Arrays.asList(arr));
//		
//		System.out.println("before: "+ l1);
//		
//		Set<String>s=new LinkedHashSet<>(l1);
//		System.out.println("After: "+ s);
		
		
	//Map add values and print them	
		
//		Map<Integer, String> names=new TreeMap<>();
//		names.put(22, "John");
//		names.put(30, "Helen");
//		names.put(45, "Adam ");
//		names.put(89, "Jack");
//		
//		for(Map.Entry all: names.entrySet()) {
//			System.out.println("Name: "+all.getValue()+ ", age: "+all.getKey());
//		}
//		
		
		
	//Find a duplicate in Array
		
//		String[] names=new String[5];
//		names[0]="Adam";
//		names[1]="Adam";
//		names[2]="Jack";
//		names[3]="jack";
//		names[4]="John";
//		
//		for(int i=0; i<names.length; i++) {
//			for(int j=i+1; j<names.length; j++) {
//				if(names[i].equals(names[j])) {
//					System.out.println(names[i]);
//				}
//			}
//		}
	
		//find unique numbers
		
//		Integer[]numbers= {-1,99,1,2,3,2,4,2,8,9,10,9};
//		Set<Integer> nums=new TreeSet<>();
//		nums.addAll(Arrays.asList(numbers));
//		System.out.println("Unique numbers: "+nums);
//		
//		
//		int[]numbers2={-1,99,1,2,3,2,4,2,8,9,10,9};
//		Set<Integer> nums2=new TreeSet<>();
//		for(int x: numbers2) {
//			nums2.add(x);
//		}
//		System.out.println("Unique numbers2: "+ nums2);
		
		//counting given letters
		
//		String word="wwwgfouqwgfoifhpihfifieohfjfuofgqwoifoq";
//		String[]s=word.split("");
//		int count=0;
//		
//		for(int i=0; i<word.length(); i++) {
//			if(s[i].equals("w")) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		//swap two numbers without using temp variable
		
//		int a=30;
//		int b=51;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println(a);
//		System.out.println(b);
		
		//print odd and even numbers
//		
//		int[]numbers= {1,2,3,7,4,0,100,99,88,44,3,7};
//		
//		for(int evenNumbers:numbers) {
//			if(evenNumbers%2==0) {
//				System.out.print(evenNumbers+ " ");
//			}
//		}
//		System.out.println();
//		for(int oddNumbers: numbers) {
//			if(oddNumbers%2!=0) {
//				System.out.print(oddNumbers+" ");
//			}
//		}
//		
//		
		
		
		
		
		
		
		
	}

}
