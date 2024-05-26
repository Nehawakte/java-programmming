// Java code to illustrate remove duplicate 
// of ArrayList using hashSet<> method 

import java.util.*; 

public class main { 
	public static void main(String args[]) 
	{ 

		// create a ArrayList String type 
		ArrayList<String> 
			main = new ArrayList<String>(); 

		// Initialize an ArrayList 
		main.add("Mountains"); 
		main.add("and"); 
		main.add("River"); 

		// print ArrayList 
		System.out.println("Original ArrayList : "
						+ main); 

		// -----Using LinkedHashSet----- 
		System.out.println("\nUsing LinkedHashSet:\n"); 

		// create a set and copy all value of list 
		Set<String> set = new LinkedHashSet<>(main); 

		// create a list and copy all value of set 
		List<String> main1 = new ArrayList<>(set); 

		// print ArrayList 
		System.out.println("Modified ArrayList : "
						+ main1); 

		// -----Using HashSet----- 
		System.out.println("\nUsing HashSet:\n"); 

		// create a set and copy all value of list 
		Set<String> set1 = new HashSet<>(main); 

		// create a list and copy all value of set 
		List<String> main2 = new ArrayList<>(set); 

		// print ArrayList 
		System.out.println("Modified ArrayList : "
						+ main2); 
	} 
} 
