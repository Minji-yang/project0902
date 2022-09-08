package project0902금;
class Animal {
	String name; 
	
	void setName(String name) { 
		this.name = name; } 
	    } //부모클래스 안 setName메소드

class Dog extends Animal { 
	void sleep() { 
		System.out.println(this.name + " zzz"); }
	} //그대로 상속됨 +  sleep메소드추가

class HouseDog extends Dog { 
	
	void sleep() { 
		System.out.println(this.name + " zzz in house"); } //상속+ sleep 덮어쓰기
      void sleep(int hour) { 
    	  System.out.println(this.name + " zzz in house for " + hour + " hours"); }
         }         //상속 + sleep추가하기(입력항목이 달라야 가능)

  public class Sample2 { 
	  public static void main(String[] args) {
  
	  HouseDog houseDog = new HouseDog();
	   houseDog.setName("happy");     
	   // 상속받았기 때문에 setName메소드를 houseDog클래스에 안 만들어도 사용가능
	   houseDog.sleep(); 
	   // happy zzz in house 출력  //Dog에서 sleep상속받은 후에 덮어쓰기 했으므로 in house붙어나옴
       houseDog.sleep(3); }}// happy zzz in house for 3 hours 출력 } }

		 /*Counter myCounter = new Counter();
					 System.out.println("before update:"+myCounter.count); //객체.
		 Updater myUpdater = new Updater();
					 System.out.println("after update:"+myCounter.count);*/
	/*
	 * void varTest(int a) { a++; }
	 * 
	 * public static void main(String[] args) { 
	 * int a =1; Sample2 sample=new
	 * Sample2(); sample.varTest(a); System.out.println(a); }
	 */
	/*
	 * int varTest(int a) { a++; return a;}
	 */
	/*
	 * int a; void varTest(Sample2 sample) { sample.a++;}
	 */
	 
	
					
	
			 
			 /*
				 * int a=1; Sample2 sample=new Sample2(); a=sample.varTest(a);
				 * System.out.println(a);
				 */
				/*
				 * Sample2 sample = new Sample2(); sample.a=1; sample.varTest(sample);
				 * System.out.println(sample.a);
				 */
	 
