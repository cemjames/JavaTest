package javaTest;
//SQ:15
public class Q062intArr { 

	public static void main(String[] args) {
		
		int [] intArr = {8, 16, 32, 64, 128};
		
		
	}

}

/*
	Which two code fragments, independently, print each element in this array?
	
	A. for (int i : intArr) {						==> foreach oldugu icin;
			System.out.print(intArr[i] + " ");			(i + " "); olmali.
		}
	
	B. for (int i : intArr) {						==> foreach. dogru
			System.out.print(i + " ");
		}
	
	C. for (int i = 0 : intArr) {					==> foreach'te ':'dan once esitlik olmaz.
			System.out.print(intArr[i] + " ");			sadece edclare edilir. '(int i:intArr)' olmali veya;
			i++;										for loop gibi dusunursek o zaman da soyle yazmali:
		}												'for (int i = 0 ; i< intArr.length;)'. i++ asagida yaziyor zaten. 
		
	D. for (int i = 0; i < intArr.length; i++) {	 ==> for loop oldugu icin;
			System.out.print(i + " ");					 (intArr[i] + " "); olmali.
		}
	
	E. for (int i = 0; i < intArr.length; i++) {	==> for loop. dogru.
			System.out.print(intArr[i] + " ");
		}
		
	F. for (int i; i < intArr.length; i++) {		==> 'int i;' demis ama kacinci index'ten baslayacagini belirtmemis. 
			System.out.print(intArr[i] + " ");
		}
		
		
		

	Answ: B, E
	
*/ 