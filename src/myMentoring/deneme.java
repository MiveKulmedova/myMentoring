package myMentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class deneme {

	public static void main(String[] args) {


//System.out.println("Enter a String");
//Scanner sc=new Scanner(System.in);
//String word=sc.nextLine();
//int count=0;
//String[] letterCount = word.split("");
//	
//for(int i=0; i<word.length(); i++) {
//	if(letterCount[i].equals(word.charAt(i))) {
//		count++;
//	}
//}
//System.out.println(count);		
//	
//	}
		
		
		
//		String word="alsihoishfciw";
//		TreeMap<String, Integer> counter=new TreeMap<>();
//		
//		for(char c: word.toCharArray()) {
//			String str=c+"";
//			
//			if(!counter.containsKey(str)) {
//				counter.put(str, 1);
//			}else
//				counter.put(str, counter.get(str)+1);
//			
//		}
//		System.out.println(counter);
//			
//		}
		
//		
//		String word="mive";
//		TreeMap<String, Integer>counter=new TreeMap<>();
//		for(char c: word.toCharArray()) {
//			String str=c+""; 
//			if(!counter.containsKey(str)) {
//				counter.put(str, 1);
//			}
//			counter.put(str, counter.get(str)+1);
//		}
//		System.out.println(counter);
	
//		String atr="gggaaabbbcccddd";
//		String[]arr=atr.split("");
//		List<String>l1=new ArrayList<>(Arrays.asList(arr));
//		Set<String>s=new HashSet<>(l1);
//		System.out.println(s);
		
//		String word="I love java";
//		String reverse="";
//		for(int i=word.length()-1; i>=0; i-- ) {
//			reverse=reverse+word.charAt(i);
//			
//		}
//		System.out.println(reverse);
		
		
//		String word="ddvdfpadihgpappe";
//		HashMap<String, Integer> counter=new HashMap<>();
//		for(char c:word.toCharArray()) {
//			String str= c +"";
//			if(!counter.containsKey(str)) {
//				counter.put(str, 1);
//			}else {
//				counter.put(str, counter.get(str)+1);
//			}
//			
//		}
//		System.out.println(counter);
//		
		
		
		ArrayList<Integer>ls=new ArrayList<>();
		ls.add(20);
		ls.add(300);
		ls.add(100);
		ls.add(-1);
		
		Integer max=0;
		for(int i=0; i<ls.size(); i++) {
			if(ls.get(i)>=max) {
				max=ls.get(i);
			}
		}
		
		System.out.println(max);
		
		
		
		
		
		
		
		
	}
}


