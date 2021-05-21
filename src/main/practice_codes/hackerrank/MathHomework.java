package practice_codes.hackerrank;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathHomework {

	public static void main(String[] args) {
		int threashold = 4;
		ArrayList<Integer> points = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		callMinMathHomework(threashold, points);

	}

	protected static int callMinMathHomework(int threashold, List<Integer> points) {
		out.println("Given Data :");
		out.println("Threshold :" + threashold);
		out.println("Math homework points :" + points);
		int result = minHomeworkCount(threashold, points);
		out.println("Min homework can be done to reach threshold :" + result);
		return result;
	}

	private static int minHomeworkCount(int threashold, List<Integer> points) {
		List<Integer> result = new ArrayList<>();
		int min = points.get(0);
		result.add(min);

		if ((points.get(points.size() - 1) - min) < threashold) {
			return points.size();
		}

		for (int i = 2; i < points.size(); i++) {
			int currentPoint = points.get(i);
			if ((currentPoint - min) <= threashold) {
				result.add(currentPoint);
				if (i + 1 < points.size() && (points.get(i + 1) - min) < threashold) {
					i++;
				}
			} else {
				result.add(currentPoint);
				break;
			}

		}
		return result.size();
	}
}
