package lambda;

public class ComparisonOfWithLambdaWithOutLambdaExp {
	public static void main (String args[]){
//		below implementing "anonymousclass"
		ITv samsung=new ITv(){
			
			public void display(){
				System.out.println("nowadays sumsung  display is awesome ");
			}
		};		
		samsung.display();
//implementing 	Lambda expression 	with same code
		ITv LG=()->{
			System.out.println("We can see 4D in our Tv");		
	};
	LG.display();
		
	}

}
