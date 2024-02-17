package exercicio01;

import java.util.ArrayList;

public class TesteString {
	public static void main(String[] args) {
		String time1 = "Corinthians";
		String time2 = "Corinthians";
		String time3 = "Corinthians";
		String time4 = "Corinthians";
		String time5 = "united";
		String time6 = "city";
		String time7 = "Corinthians";
		String time8 = "Real Madrid";
		String time9 = "Corinthians";
		String time10 = "Corinthians";

		ArrayList<String> times = new ArrayList<String>();
		times.add(time1);
		times.add(time2);
		times.add(time3);
		times.add(time4);
		times.add(time5);
		times.add(time6);
		times.add(time7);
		times.add(time8);
		times.add(time9);
		times.add(time10);

		times.remove(6);
		for (int i = 0; i < times.size(); i++) {
			System.out.println(times.get(i));

		}

	}

}