package javaTest;

import java.util.ArrayList;
import java.util.List;

//SQ:117

class Patient {

	String name;
	
	public Patient (String name) {
		this.name = name;
	}
}	
	
public class Q090PatientTest {

	public static void main(String[] args) {
		
		List ps = new ArrayList();
		Patient p2 = new Patient("Mike");
		
		ps.add(p2);
		
		// insert code here
			
		if (f >= 0) {
			System.out.println("Mike Found");
		}
		
	}
}

/*
	Which code fragment, when inserted at line 24, enables the code to print Mike Found?
	
	A. int f = ps.indexOf (p2)
	B. int f = ps.indexOf (Patient (“Mike”) );
	C. int f = ps.indexOf (new Patient “Mike”) );
	D. Patient p = new Patient (“Mike”);Int f = ps.indexOf (p)

	Answ: A



*/