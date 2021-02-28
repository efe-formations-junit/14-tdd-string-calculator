package fr.formation.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	public static int add(String s) {
		int res = 0;
		
		if (!s.isEmpty()){
			String[] tabS = split(s);
			List<Integer> listeI = stringTableToIntegerList(tabS);

			int somme = sumOfIntegerList(listeI);

			res = somme;
		}
		return res;
	}

	private static String[] split(String s) {
		if (isUseOfCustomDelimiter(s)) { 
			return splitWithCustomDelimiter(s);
		}
		else
			return splitWithNewLineAndComma(s);
	}

	private static boolean isUseOfCustomDelimiter(String s) {
		return s.startsWith("//");
	}

	private static String[] splitWithNewLineAndComma(String s) {
		String[] tabS = s.split(",|\n");
		return tabS;
	}

	private static String[] splitWithCustomDelimiter(String s) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);
		m.matches();
		String delimiter = m.group(1);
		String nombres = m.group(2);
		return nombres.split(delimiter);
	}

	private static int sumOfIntegerList(List<Integer> listeI) {
		int somme = 0;
		for (Integer integer : listeI) {
			somme += integer;
		}
		return somme;
	}

	private static List<Integer> stringTableToIntegerList(String[] tabS) {
		List<Integer> listeI = new ArrayList<Integer>();
		for (String string : tabS) {
			listeI.add(parseInt(string));
		}
		return listeI;
	}

	private static int parseInt(String s) {
		return Integer.parseInt(s);
	}

}
