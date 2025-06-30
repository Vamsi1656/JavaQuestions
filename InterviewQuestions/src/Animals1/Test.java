package Animals1;

import Animals.Animal;
import Animals.Dog;

public class Test extends Dog {
	
	public void m3() {
		m1();
	}
		public static void main(String args[]) {
			Test t=new Test();
			t.m3();
//			
//			Animal a=new Animal();
//			a.m1();
		}
}
