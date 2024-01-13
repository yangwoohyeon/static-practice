package 첫번째;

public class TV {
	private String name;
	private int year;
	private int inche;
	
	 TV(String s,int year, int inche) {
		name=s;
		this.year=year;
		this.inche=inche;
	}
	
	public void show() {
		System.out.println(name+" 에서 만든 "+year+"년형 "+inche+" TV");
	}
}
