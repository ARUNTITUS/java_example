package Class_Program_oops;

public class inheritancemain {
	public class InheritanceMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ParentExample exp=new ParentExample(1);
			ParentExample exp1=new ParentExample("Titus");
			ChildExample childexp=new ChildExample();
			
			System.out.println("Print 1:"+exp.primNumber());
			System.out.println("Print 2:"+exp.test());
			System.out.println("Print 3:"+exp1.test());
			System.out.println("Print 4:"+childexp.test());
	    


		}

	}

}
