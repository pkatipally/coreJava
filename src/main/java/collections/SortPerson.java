package collections;

public class SortPerson implements Comparable {
	public String name;
	public int age;
	public String email;

	public SortPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object obj){
		if(this==obj){
			return 0;
		}
		if(obj==null){
			return 1;
		}
		if(!(obj instanceof SortPerson)){
			return -1;
		}
		SortPerson person=(SortPerson)obj;
			return this.name.compareTo(person.name);
		}
	@Override
	public String toString() {
		return name + ":name" + " :age:" + age ;
	}
				
	}

	


