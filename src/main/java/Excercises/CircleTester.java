package excercises;

import java.util.LinkedList;
import java.util.List;

public class CircleTester {

	List<Circle> circleList = new LinkedList<Circle>();

	public List<Circle> addCircle() {
		double radius = 0;
		double area = 0;
		for (int i = 0; i < 10; i++) {
			radius = Math.random();
			if (radius > 0.01) {
				circleList.add(new Circle(radius));
				System.out.println("radius :" + radius);
				area = Math.PI * Math.pow(radius, 2);
				System.out.println("Circle area:" + area);
			}
		}
		return circleList;
	}
}
