package project0902금;

public class calculator {
	   int result=0;
	   
	   int add(int num) { 
		   result+=num;
		   return result;
	   }

	public static void main(String[] args) {
		calculator cal1=new calculator();
		calculator cal2=new calculator();
			
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(5));
		System.out.println(cal2.add(3));
		System.out.println(cal2.add(5));
		
		}

}
