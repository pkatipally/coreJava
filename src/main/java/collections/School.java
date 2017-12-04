package collections;

public class School {
	private String studentName;
	private String surname;
	private String dateOfBorth;

	public String getStudentName(){
		return studentName;
	}
	public void setStudentName(String studentName){
		this.studentName=studentName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDateOfBorth() {
		return dateOfBorth;
	}

	public void setDateofBorth(String dateOfBorth) {
		this.dateOfBorth = dateOfBorth;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof School)) {
			return false;
		}
		School school = (School) obj;
		return (this.studentName == school.studentName) && (this.surname == school.surname)
				&& (this.dateOfBorth == school.dateOfBorth);
	}

	public int hashCode() {
		return 31 *( studentName.hashCode())*(37*(surname.hashCode()))*(41*(dateOfBorth.hashCode()));
	}

}
