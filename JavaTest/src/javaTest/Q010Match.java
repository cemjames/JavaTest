package javaTest;
// SQ: 13
public class Q010Match {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(5);
		
		String s = "";
		
		if (sb.equals(s)) {
			System.out.println("Match 1");
		} 
		else if (sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		}
		else {
			System.out.println("No Match");
		}
		
		//System.out.println("sb capacity is: " + sb.capacity());
		
	}

}
/*
 * Answ: B. Match 2

 	StringBuilder is bos, 5 stringlik kapasitesi var ama icinde string yok.  
 	s de bos. so equal.
 	but sb is object, s is variable. different type. 
    System.out.println("sb capacity = " + sb.capacity());


 
 
 
 */
