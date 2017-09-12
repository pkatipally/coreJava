package lambda;

public class AddableWithMultiParameters {
	public static void main(String args[]){
//		implementing lambda expr with return keyword
		Addable ad1=(int a,int b)->{
			return (a+b);
		};
		System.out.println("addition of a&b with return keyword: "+ad1.add(500, 844));
//		lambda expres without return keywords
		Addable ad2=(a,b)->(a+b);
			System.out.println("addition of a&b without return keyword :"+ad2.add(120,444));		
	}
}
