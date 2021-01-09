package TechProEd.MyHibernate;

import javax.persistence.*;

@Entity
public class Students12 {
	@Id
	private int std_id;
	private String st_name;
	private int mathGrade;
	private String state;
	private String ssn;
	
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	@Override
	public String toString() {
		return "Students12 [std_id=" + std_id + ", st_name=" + st_name + ", mathGrade=" + mathGrade + ", state=" + state
				+ ", ssn=" + ssn + "]";
	}
	public int getMathGrade() {
		return mathGrade;
	}
	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	

}
