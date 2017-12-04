package collections;

public class SortStudent {
	String id;
	String year;
	String address;
	public SortStudent(String id,String year,String address){
		this.id=id;
		this.year=year;
		this.address=address;
	}
	public String toString(){
		return this.id+""+this.year+""+this.address;
	
	}

}
