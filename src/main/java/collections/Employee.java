package collections;

public class Employee {
	private String name;
	public int id;
	private String email;

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setid(int id) {
		this.id = id;
	}

	public int getid() {
		return id;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee employee1 = (Employee) obj;
		return this.email == employee1.email;
	}
	public String toString(){
		return name+" "+id+" "+email;
	}

}
