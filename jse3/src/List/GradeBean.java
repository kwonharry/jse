package List;

public class GradeBean {
	private int java, oracle, spring;
	private String name,hak;
	public GradeBean(){
		//생성자 오버로딩
		this("","",0,0,0);
	}
	
	public GradeBean(String hak,String name, int java, int oracle, int spring){
		this.hak=hak;
		this.name=name;
		this.java=java;
		this.oracle=oracle;
		this.spring=spring;
		
	}
	
	public int getTotal() {
		return java+oracle+spring;
	}
	
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	
	@Override
	public String toString() {
		return "성적표 [java=" + java + ", oracle=" + oracle + ", spring=" + spring + ", 이름=" + name + ", 학번="
				+ hak + "]";
	}
	
	
	
	
	
}
