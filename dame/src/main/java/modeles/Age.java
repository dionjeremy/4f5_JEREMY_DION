package modeles;

public class Age implements AgeLectureSeule{

	private int age;
	
	@Override
	public int getAge() {
		return age;
	}


	@Override
	public void setAge(int age) {
		this.age=age;
	}
	
	
	
}
