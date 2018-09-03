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
import java.util.TreeSet;

public class MyMentoring {

	public static void main(String[] args) {
		
	
	
//		Map<String, Integer> mp=new HashMap<String, Integer> ();
//		mp.put("cat", 2);
//		mp.put("Dog", 3);
//		mp.put("fish", 1);
//		
//		System.out.println(mp.get("cat"));
//		System.out.println(mp.values());
//		System.out.println(mp.keySet());
//		System.out.println(mp.containsKey("Dog"));
		
		
//	ArrayList<Integer>ls=new ArrayList<>();
//	ls.add(2);
//	ls.add(3);
//	ls.add(100);
//	ls.add(90);
//	
//	System.out.println(ls.size());
//	System.out.println(ls.get(2));
//	
//	Integer max=ls.get(0);
//	for(int i=0; i<ls.size(); i++) {
//		if(ls.get(i)>=max) {
//			max=ls.get(i);
//		}
//	}
//	
//	System.out.println(max);
		
//		System.out.println("Enter a String to reverse");
//		Scanner read=new Scanner(System.in);
//		String str=read.nextLine();
//		String reverse="";
//		
//		for(int i=str.length()-1; i>=0; i--) {
//			reverse=reverse+str.charAt(i);
//		}
//		System.out.println("Reversed string is: ");
//		System.out.println(reverse);
		
//		String str="hello world";
//		StringBuilder sb=new StringBuilder();
//		String[]words=str.split("");
//		for(int i=words.length-1; i>=0; i--) {
//			sb.append(words[i]);
//		}
//		System.out.println("Reverse of words: "+ sb.toString());

		
//		String str="aaabbbccc";
//		String[]arr=str.split("");
//		List<String>l1=new ArrayList<>(Arrays.asList(arr));
//		System.out.println("Before "+l1);
//		Set<String>s=new LinkedHashSet<>(l1);
//		List<String>l2=new ArrayList<>(s);
//		System.out.println("After: "+l2);
		
//		Map<Integer,String> names=new HashMap<>();
//		names.put(22, "John");
//		names.put(55, "Helen");
//		names.put(36, "Eva");
//		names.put(40,"Jack");
//		
//		
//		for(Map.Entry all: names.entrySet() ) {
//			System.out.println("Name : "+all.getValue()+ ", age: "+all.getKey());
//		}
		
//		Set<String> colors=new TreeSet<>();
//		colors.add("green");
//		colors.add("blue");
//		colors.add("yellow");
//		colors.add("red");
//		
//		System.out.print(colors);
		
//		int[]arr=new int[5];
//		arr[0]=1;
//		arr[1]=8;
//		arr[2]=5;
//		arr[3]=99;
//		arr[4]=66;
//		
//		System.out.println(Arrays.toString(arr));
//		
//		int x= arr[2];
//		System.out.println(x);
		
//		StringBuilder sb=new StringBuilder("Interview questions");
//		sb.setCharAt(8, 'W');
//		sb.setCharAt(10, 'Q');
//		sb.setCharAt(18, 'S');
//		
//		System.out.println(sb);
		
//		String[]names=new String[5];
//		names[0]="adam";
//		names[1]="adam";
//		names[2]="eva";
//		names[3]="john";
//		names[4]="eva";
//		
//		for (int i = 0; i < names.length; i++) { 
//			for (int j = i + 1 ; j < names.length; j++) {
//				if (names[i].equals(names[j])) { 
//					System.out.println(names[i]);
//			}
//		}
//
//
//		}
		
//	
//		Integer []numbers= {1,2,3,1,2,5,9,2};
//		Set<Integer>nums=new TreeSet<>();
//		nums.addAll(Arrays.asList(numbers));
//		System.out.println("Unique numbers: "+nums);
//		
//		int[]numbers2= {1,2,3,1,2,5,9,2};
//		Set<Integer>nums2=new TreeSet<>();
//		for(int x: numbers2) {
//			nums2.add(x);
//		}
//		System.out.println("Unique numbers2: "+nums2);
		
//		for(int i=1; i<=100; i++) {
//			if(i%15==0) {
//				System.out.println("FizzBuzz"+ " \t");
//			}else if(i%3==0) {
//				System.out.println("Buzz"+ " \t");
//			}else if(i%5==0) {
//				System.out.println("Fizz"+ " \t");
//			}else {
//				System.out.println(i+" \t");
//			}
//		}
		
//		String word="asklkhhhhscabciuabcuwb";
//		String[]s=word.split("");
//		int count=0;
//		
//		for (int i = 0; i < word.length(); i++) {
//			if(s[i].equals("h"))
//				count++;
//			
//		}
//		System.out.println(count);
		
//		int a=3;
//		int b=1;
//		
//		a=a+b; //4
//		b=a-b; //3
//		a=a-b; //1
//		
//		System.out.println(a);
//		System.out.println(b);
		
//		StringBuffer sb=new StringBuffer("InterviewQuestion");
//		System.out.println(sb.reverse());
//		
//		String word="InterviewQuestion";
//		
//		for(int i=word.length()-1; i>=0; i--) {
//			System.out.print(word.charAt(i));
//		}
		
//		int[]numbers= {1,4,8,23,7,0,33,80,100,5,2,1000};
//		
//		for(int evenNumbers:numbers) {
//			if(evenNumbers%2==0) {
//				System.out.print(evenNumbers+" ");
//			}
//		}
//		System.out.println();
//		for(int oddNumbers:numbers) {
//			if(oddNumbers%2!=0) {
//				System.out.print(oddNumbers+" ");
//			}
//		}
		
//		String a="               apple                ";
//		System.out.println(a);
//		System.out.println(a.length());
//		System.out.println(a.charAt(15));
//		System.out.println(a.contains("z"));
//		System.out.println(a.startsWith("a"));
//		System.out.println(a.endsWith("e"));
//		System.out.println(a.trim().startsWith("a"));
//		
//		String b="ApplE";
//		System.out.println(a.equals(b));
//		System.out.println(a.trim().equalsIgnoreCase(b));
//		System.out.println(b.indexOf('p'));
//		System.out.println(b.isEmpty());
//		System.out.println(b.substring(1, 3));
//		System.out.println(b.substring(3));

//		String word="solve the interview questions";
//		String[]ArrWord=word.split(" ");
//		System.out.println(Arrays.asList(ArrWord));
		
//		String word="batch 8";
//		char[]character=word.toCharArray();  //it will take all character and give it Array
//		for(int i=0; i<character.length; i++) {
//			System.out.print(character[i]+"*");
//		}
		
//		int a=5;
//		a+=20;
//		System.out.println(a);
//		a-=10;
//		System.out.println(a);
//		
//		String num="90";
//		char ch='h';
//		char cr=ch;
//		String all=num+cr;
//		System.out.println(cr+all);
		
		
//		int a=2+4;
//		int b=a*9;
//		int num1=10;
//		int num2=20;
//		int num3=30;
//		
//		int sum=num2*num1;
//		System.out.println(b);
//		System.out.println(sum);
//		
//		int sum1=num3/num1;
//		System.out.println(sum1);
//		
//		double p=1.1;
//		double r=2.5;
//		double y=p*r;
//		System.out.println(y);
//		
//		int t=100/0;
//		System.out.println(t);
//		a aa=new a();
//		String[] words= {"all","sit","walk","eat"};
//	  aa.WordPrint(words);
//	   int[]numbers= {1,2,3,4,5,6,7,8,9,10};
//	   aa.NumPrint(numbers);
//
//	}
//	
//}
//
// class a {
// public static void WordPrint(String[] args) {
//	 for (String word:args) {
//		 System.out.print(word+" ");
//	 }
//	 System.out.println();
// }
//
// public static void  NumPrint(int[] args) {
//	 for(int num: args) {
//		 System.out.print(num+" ");
//	 }
//	 System.out.println();
// }
//	
//
//	}

//		for(int i=1; i<=5; i++) {
//			for( int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
//		ArrayList<String> ls=new ArrayList<>();
//		
//		ls.add("aa");
//		ls.add("bb");
//		ls.add("cc");
//		ls.add("aa");
//		ls.add("hh");
//		ls.add("bb");
//		System.out.println(ls.toString());
//		Set<String>st=new TreeSet<String>(ls); //HashSet, LinkedHashSet
//		System.out.println(st);
		
//		String[]list= {"Green","blue","yellow","Red","white","black","purple","Pink","grey","brown"};
//		
//		System.out.println(Arrays.toString(list));
//		Arrays.sort(list);
//		System.out.println(Arrays.toString(list));
//		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
//		
//		for(String a:list) {
//			System.out.print(a+" ");
//		}
//		
//		System.out.println();
//		System.out.println(Arrays.toString(list));
		
//		int num=0;
//		int reverse=0;
//		System.out.println("Enter a number and press enter: ");
//		Scanner sc=new Scanner(System.in);
//		num=sc.nextInt();
//		
//		while(num!=0) {
//			reverse=(reverse*10);
//			reverse=reverse+num%10;
//			num=num/10;
//		}
//		System.out.println("Reverse of entered number is: "+reverse);
		
		
//	
//		System.out.println("Enter a number: ");
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		if(isPrime(n)) {
//			System.out.println("number: "+n+" is prime number");
//		}else {
//			System.out.println("number: "+n+" is not a prime number");
//		}
//	}
//			
//			public static boolean isPrime(int n) {
//			    int i;
//			    if(n<=1) {
//			    	return false;
//			    }
//			    for (i = 2; i <= Math.sqrt(n); i++) {
//			        if (n % i == 0) {
//			            return false;
//			        }
//			    }
//			    return true;
//			}
//		
	
//		int num[]= {1,3,9,11,55,88,100,556,999};
//		printTwoMaxNumber(num);
//		
//	}
//	
//	public static void printTwoMaxNumber(int [] nums) {
//		int maxOne=0;
//		int maxTwo=0;
//		
//		for(int n: nums) {
//			if(maxOne<n) {
//				maxTwo=maxOne;
//				maxOne=n;
//			}else if (maxTwo<n) {
//				maxTwo=n;
//			}
//			
//		}
//		System.out.println("First Max number: "+ maxOne);
//		System.out.println("Second Max Number: "+ maxTwo);
//	}
		
//		String word="  Remove    extra     spaces   ";
//		StringTokenizer substr=new StringTokenizer(word, " ");
//		StringBuilder sb=new StringBuilder();
//		while(substr.hasMoreElements()) {
//			sb.append(substr.nextElement()).append(" ");
//		}
//		
//		System.out.println("Actual string: "+ word);
//		System.out.println("String without extra spaces: "+ sb.toString());
		
	
		
		
		
		
		a aa= new a();
		//System.out.println(aa.isPalindrome("anna"));
		
	

	
		
		
		
		
	}
		
		
	}
 class a extends MyMentoring {
	 public static boolean isPalindrome(String[] word) {
			int i1=0;
			int i2=word.length-1;
			while(i2>i1) {
				if(word[i1]!=word[i2]) {
					return false;
				}
				++i1;
				--i2;
			}
			return true;
		}
 }
