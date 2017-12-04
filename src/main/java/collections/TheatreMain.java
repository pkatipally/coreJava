package collections;

public class TheatreMain {
	public static void main(String args[]){
		Theatre theatre=new Theatre("Priya",10,8);
		theatre.getSeats();
		if(theatre.reserveSeat("R3")){
			System.out.println("please pay ");
		}
		else{
			System.out.println("Sorry,seat reserved");
		}
		if(theatre.reserveSeat("R3")){
		System.out.println("please pay");
		}
		else{
			System.out.println("Sorry, seat reserved");
		}
	}

}
