package map;

public class Employee implements Comparable{
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		if(!(obj instanceof Employee)){
			return false;
		}
		Employee employee=(Employee)obj;
		return this.name==employee.name;
	}
	@Override
	public int compareTo(Object obj){
		if(this==obj){
			return 0;		
		}
		if(obj==null){
			return 1;
		}
		if(!(obj instanceof Employee)){
			return -1;
		}
		Employee employee=(Employee)obj;
		return this.name.compareTo(employee.name);
	}
	@Override
	public int hashCode(){
		return 31*(this.name.hashCode());
	}
	public String toString(){
		return "name:"+this.name+"id:"+this.id;
	}

}
