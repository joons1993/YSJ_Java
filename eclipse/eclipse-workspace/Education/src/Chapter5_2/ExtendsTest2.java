package Chapter5_2;

public class ExtendsTest2 {
	class Super{
		int x = 90;
		void superMethod() {
			System.out.println("super Method");
		}
	}
	class Sub extends Super{
		int y = 10;
		void subMethod() {
			System.out.println("sub Method");
		}
	}
	class Subsub extends Sub{
		int z = 20;
		void subSubMethod() {
			System.out.println("subSub Method");
		}
	}

	public class ExtendsTest2 {
		/*
		 * 2�ܰ� ����׽�Ʈ
		 */

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Subsub ss = new Subsub();
			System.out.println("ss.x =" +ss.x);
			System.out.println("ss.y =" +ss.y);
			System.out.println("ss.z =" +ss.z);
			
			ss.subMethod();
			ss.subMethod();
			ss.subSubMethod();
		}

	}


}