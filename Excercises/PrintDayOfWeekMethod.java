package excercises;

public class PrintDayOfWeekMethod {

	public void printDayOfWeek(int i){ 
	switch(i){
	case 1:
		System.out.println("num 1 represent Monday");
	break;
	case 2:
		System.out.println("num 2 represent Tuesday");
		break;
	case 3:
		System.out.println("num 3 represent Wednesday");
		break;
	case 4:
		System.out.println("num 4 represent Thursday");
		break;
	case 5:
		System.out.println("num 5 represent Friday");
		break;
	case 6:
		System.out.println("num 6 represent Saturday");
		break;
	case 7:
		System.out.println("num 7 represent Sunday");
		break;
		default :
			System.out.println("number not found");
			break;
	}
	}
}
