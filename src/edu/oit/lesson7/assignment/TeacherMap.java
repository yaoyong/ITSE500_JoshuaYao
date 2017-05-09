/**
 * 
 */
package edu.oit.lesson7.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author JoshuaYao
 *
 */
public class TeacherMap {

	/**
	 * @param args
	 */
	public Map<String, String> teacher(Map<String, Integer> roster, Map<Integer, String> gradeMap) {
		Map<String, String> score = new HashMap<>();
		for (Entry<String, Integer> entry : roster.entrySet()) {
			String Sname = entry.getKey();
			int a = entry.getValue();
			String Smark = convertScore(a);
			score.put(Sname, Smark);
		}
		return score;
	}

	public String convertScore(int a) {
		if (52 <= a && a < 70) {
			return "D";
		} else if (70 <= a && a < 73) {
			return "C-";
		} else if (73 <= a && a < 76) {
			return "C";
		} else if (76 <= a && a < 80) {
			return "C+";
		} else if (80 <= a && a < 84) {
			return "B-";
		} else if (84 <= a && a < 87) {
			return "B";
		} else if (87 <= a && a < 89) {
			return "B+";
		} else if (89 <= a && a < 91) {
			return "A-";
		} else if (91 <= a && a < 98) {
			return "A";
		} else if (98 <= a && a < 100) {
			return "A+";
		} else {
			return "F";
		}

	}

	public static void main(String[] args) {
		Map<String, Integer> roster = new HashMap<>();
		roster.put("Mort", 77);
		roster.put("Dan", 81);
		roster.put("Alyssa", 98);
		roster.put("Kim", 52);
		roster.put("Lisa", 87);
		roster.put("Bob", 43);
		roster.put("Jeff", 70);
		roster.put("Sylvia", 92);
		roster.put("Vikram", 90);
		// {52=D, 70=C-, 73=C, 76=C+, 80=B-, 84=B, 87=B+, 89=A-, 91=A, 98=A+}
		Map<Integer, String> gradeMap = new HashMap<>();
		gradeMap.put(52, "D");
		gradeMap.put(70, "C-");
		gradeMap.put(73, "C");
		gradeMap.put(76, "C+");
		gradeMap.put(80, "B-");
		gradeMap.put(84, "B");
		gradeMap.put(87, "B+");
		gradeMap.put(89, "A-");
		gradeMap.put(91, "A");
		gradeMap.put(98, "A+");
		TeacherMap teacherMap = new TeacherMap();
		System.out.println(teacherMap.teacher(roster, gradeMap));
	}

}
