package Member;

public class AdminBean extends MemberBean {
	//기능 상속 & 속성 상속
	private String employeeNo;

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	
}
