package com.summitthai.tdd.tennis_legacy12;

import java.util.Arrays;
import java.util.List;

public class TennisScore {

	public static List<Integer> scoreList = Arrays.asList(0, 15, 30, 45);
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println(getScore(0,0));
		System.out.println(getScore(15,0));
		System.out.println(getScore(30,0));
		System.out.println(getScore(30,15));
		System.out.println(getScore(45,45));
	}
	
	public static String getScore(int scoreP1,
			               int scoreP2) {
		if (scoreP1 == 0 && scoreP2 == 0) {
			return "SCORE IS => LOVE";
		} else if (scoreP1 == 45 && scoreP2 == 45) {
			return "SCORE IS => DUECE";
		} else {
			return "SCORE IS => " + String.valueOf(scoreP1) + " : " + String.valueOf(scoreP2);
		}
	}
	
}
