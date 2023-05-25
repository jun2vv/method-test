package vo;

public class Emp {
	private int empId;
	private int empNo;
	private String team;
	private String empName;
	private boolean retirer;
	
	
	public boolean isRetirer() {
		return retirer;
	}
	public void setRetirer(boolean retirer) {
		this.retirer = retirer;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
