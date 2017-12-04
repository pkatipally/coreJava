package collections;

import java.util.*;

public class Theatre {
	private final String theatreName;
	public List<Seat> seats = new ArrayList<Seat>();

	public Theatre(String theatreName, int numOfRows, int seatsPerRow) {
		this.theatreName = theatreName;
		int lastRow = 'A' + (numOfRows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%d", seatNum));
				seats.add(seat);
			}		}
	}
	public String getTheatreName() {
		return this.theatreName;
	}
	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		if (foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		} else {
			System.out.println("There is no seat " + seatNumber);
			return false;
		}
	}
	public String getSeats() {
		for (Seat seat : seats) {
			System.out.println("seat numbers:" + seat.getSeatNumber());
		}
		return theatreName;
	}

	public class Seat implements Comparable<Seat>{
		private final String seatNumber;
		private boolean reserved=false;
		public Seat(String seatNumber){
			this.seatNumber=seatNumber;
		}
		public int compareTo(Seat seat){
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}
	public boolean  reserve(){
		if(!this.reserved){
			this.reserved=true;
			System.out.println("Seat "+seatNumber+" reserved");
			this.reserved=true;
		}
		else	{
//		this.reserved=false;
			System.out.println("sorry,seat reserved");
		return this.reserved=false;
		}
		return reserved=false;
		}
		public void cancel(){
			if(this.reserved){
				this.reserved=false;
				System.out.println("Reservation of seat "+seatNumber+" canceled");
			}else{
			return;
			}
					
		}
	
	private String getSeatNumber() {		
		return seatNumber;
	}
}
}