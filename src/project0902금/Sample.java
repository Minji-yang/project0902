package project0902금;

class Anim{
	String name;
	void setName(String name) {
		this.name=name;
	}}
	class Dg extends Anim{
				
		void sleep() {
			System.out.println(this.name+"zzz");
		}}
		
	class HseDog extends Dg{
		HseDog(String kind){this.setName(kind);}
			HseDog(int type){
				if (type==1) {this.setName("yorkshire");}
				else if(type==2) {this.setName("bulldog");				}
			}
			
			void sleep() {
				System.out.println(this.name+"zzz in the house");}
			void sleep(int hour) {
				System.out.println(this.name+"zzz in the house"+hour+"hours");}
			}

public class Sample {

	public static void main(String[] args) {
		HseDog dog = new HseDog("shiba");
		System.out.println(dog.name);
		HseDog dog2 = new HseDog(1);
		System.out.println(dog2.name);
		HseDog dog3 = new HseDog(2);
		System.out.println(dog3.name);
		dog3.sleep(3);
	}

}
