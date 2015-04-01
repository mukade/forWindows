package danxiangxuanze;

class Target{
	public String name="hello";
}

class SubTarget extends Target{
	{
		super.name="hi";
	}
	public String name="hi2";
}

public class TargetTest{
	public static void main(String args[]){
		SubTarget st=new SubTarget();
		st.name="hi3";
		System.out.println(st.name);
	}
}




