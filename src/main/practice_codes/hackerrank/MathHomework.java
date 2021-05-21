package practice_codes.hackerrank;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Math Homework
* Students have been assigned a series of math problems that have points associated with them. 
* Given a sorted points array, minimize the number of problems a student needs to solve based on the criteria below:
* 1. They must always solve the first problem, index 0
* 2. After solving the problem, they have a choice: solve the next problem (+1) or skip ahead and work the (+2) problem.
* 3. Students must keep solving problems until the difference between the maximum points and the minimum points questions solved so far meets or exceeds a specified threshold
* 4. If the student cannot meet or exceed the threshold they must work all the problems.
* Return the minimum number of problems a student needs to solve.
* Example:
* Threashold = 2
* Points = [1,2,3]
* Output : 2
* Explainantion:
* Student chooses to solve problems points[0]=1 and points[2]=3
* Diff between min and max is 3-1=2 -> which is matching threashold
* thats why student will solve 2 problems and output is 2
 */
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
