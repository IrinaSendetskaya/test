package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//System.out.println(TestClass.findMissingLetter(new char[]{'C','D','F'}));
		//TestClass.isSquare(4);

		TestClass.calculateYears(1000,0.05,0.18,1100);
		//System.out.println(TestClass.sumDigPow(1, 1000));
		//System.out.println(Arrays.toString(TestClass.sumDigPow(90, 100).toArray()));
		//System.out.println(TestClass.persistence(25));
		//System.out.println(TestClass.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,0))));
		
		System.out.println(TestClass.solveSuperMarketQueue(new int[] {10,2,3,3}, 2));
	}

}
