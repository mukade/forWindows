package the_past;
class Person2
{
	private String name;
	private String idStr;
	
	public Person2(){}
	
	public Person2(String name,String idStr)
	{
		this.name = name;
		this.idStr = idStr;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdStr() {
		return idStr;
	}

	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}

	public boolean equals(Object obj){
		if (this == obj)return true;
		System.out.println(obj.getClass());
		if (obj != null && obj.getClass()==Person2.class){
			Person2 personObj = (Person2)obj;
			if (this.getIdStr().equals(personObj.getIdStr())){
				return true;
			}
		}
		return false;
	}
	
}

public class OverrideEqualsRight {
	public static void main(String[] args){
		Person2 p1 = new Person2("孙悟空","123123123");
		Person2 p2 = new Person2("孙猴子","123123123");
		Person2 p3 = new Person2("孙悟饭","999");
		System.out.println("p1等于p2?"+p1.equals(p2));
		System.out.println("p2等于p3?"+p2.equals(p3));
	}

}
