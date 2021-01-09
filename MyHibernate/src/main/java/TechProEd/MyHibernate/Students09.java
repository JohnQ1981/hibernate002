package TechProEd.MyHibernate;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "students_table09")// this is how you can rename table name in hibernate
public class Students09 {
	@Id
	private int id;
	@Column(name ="student_name")// this is how you rename columnt name in hibername
	private String name;
	private int mathGrade;// if you delete a variable it means you removed a column in DB and data also gone
	//private int address;// this is how you add new column in your table you just create a variable and create getter and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMathGrade() {
		return mathGrade;
	}
	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", mathGrade=" + mathGrade + "]";
	}

}
