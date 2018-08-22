package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestClass {

	// public static char findMissingLetter(char[] array) {
	// char missingLetter = array[0];
	// boolean flag = true;
	//
	// for (char i = missingLetter, j=0; i <= 'z'; i++,j++) {
	// if (flag) {
	// if (i != array[j]) {
	// missingLetter = i;
	// flag = false;
	// }
	// } else
	// break;
	// }
	//
	// return missingLetter;
	// }

	// public static boolean isSquare(int n) {
	//
	// return Math.sqrt(n)%1==0;
	//// Double i=Math.sqrt(Double.parseDouble(n+""));
	//// int j=(int)Math.sqrt(Double.parseDouble(n+""));
	//// if(n<0)
	//// {
	//// System.out.println("negative numbers aren't square numbers");
	//// } else if(n==0) {
	////
	//// System.out.printf("%d is a square number (%d * %d)", 0, 0,0);
	//// return true;
	//// }else if(n==(int)(Math.pow(i, 2.0))) {
	////
	//// System.out.printf("%d is a square number (%d * %d)", n, j,j);
	//// return true;
	//// }
	//// System.out.printf("%d isn't a square number", n);
	//// return false; // fix me!
	// }

	public static int calculateYears(double principal, double interest, double tax, double desired) { // i percent, t
																										// tax for
																										// percent
		int countYear = 0;
		if (principal == desired)
			countYear = 0;
		else {
			do {
				principal *= (1 + interest * (1 - tax));

				countYear++;
			} while (principal < desired);
		}

		return countYear;
	}

	public static String HighAndLow(String numbers) {

		String[] arr = numbers.trim().split(" ");
		int[] arrInt = new int[arr.length];
		int i = 0;
		for (String string : arr) {
			arrInt[i] = Integer.parseInt(string);
			i++;
		}
		int max = arrInt[0];
		int min = arrInt[0];

		for (int j = 0; j < arrInt.length; j++) {
			if (arrInt[j] > max) {
				max = arrInt[j];
			}
			if (arrInt[j] < min) {
				min = arrInt[j];
			}
		}
		String ready = max + " " + min;

		return ready;
	}

	public static List<Long> sumDigPow(long a, long b) {
		List<Long> readyList = new ArrayList<>();
		StringBuilder s = new StringBuilder();
		StringBuffer sb;
		StringBuilder sOut;

		for (long i = a; i <= b; i++) {
			sb = new StringBuffer();
			sOut = new StringBuilder();
			int countPer = 0;
			double sum = 0;
			for (long j = i; j > 0; j /= 10) {
				countPer++;
			}
			for (long j = i; j > 0; j /= 10) {
				long res = j % 10;
				sum += Math.pow(res, countPer);
				sOut.insert(0, countPer);
				sOut.insert(0, "^");
				sb.insert(0, res);
				sOut.insert(0, res);

				countPer--;
				if (countPer != 0)
					sOut.insert(0, "+");
			}
			if (sum == i) {
				System.out.println(i + "=" + sOut);
				s.append(sb);
				s.append(",");
			}
		}

		String[] buf = s.toString().split(",");
		for (String string : buf) {
			if (string.isEmpty()) {
			} else
				readyList.add(Long.parseLong(string));
		}

		return readyList;
	}

	public static int persistence(long n) {
		int countMultiply = 0;
		long result;
		List<Long> arr = new ArrayList<>();

		do {
			arr = persNew(n);
			if (arr.size() != 0 && arr.size() != 1) {
				result = 1;
				for (Long digit : arr) {
					result *= digit;
				}
				n = result;
				countMultiply++;
			}
		} while (arr.size() != 0 && arr.size() != 1);

		return countMultiply;
	}

	public static List<Long> persNew(long n) {

		List<Long> arr = new ArrayList<>();

		for (long i = n; i > 0; i /= 10) {
			arr.add(i % 10);
		}
		return arr;

	}

	public static int convertBinaryArrayToInt(List<Integer> binary) { // {1,1,1,1} = 1*2^3+1*2^2+1*2^1+1*2^0=15
		int intConverting = 0;
		int degree = binary.size();// 4

		for (Integer integer : binary) {
			degree--;
			intConverting += integer.intValue() * Math.pow(2.0, degree);
		}

		return intConverting;
	}

	public static String encrypt(final String text, final int n) { // This is a test! //hsi etTi sats!
		StringBuilder sb;
		StringBuilder sb1;
		String textNew = text;
		int count = 0;
		if (text == null)
			return null;
		else if (text=="")
			return "";
		else {
			if (n <= 0) {

				return text;
			} else {
				while (count != n) {
					sb = new StringBuilder();
					sb1 = new StringBuilder();
					char[] buf = textNew.toCharArray();
					for (int i = 1; i < buf.length; i += 2) {
						char b = buf[i];
						sb.append(b);
					}
					for (int i = 0; i < buf.length; i += 2) {
						char b = buf[i];
						sb1.append(b);
					}
					sb.append(sb1);
					textNew = sb.toString();
					count++;
				}
			}

		}
		return textNew;
	}

	public static String decrypt(final String encryptedText, final int n) {
		
		StringBuilder sb;
		String textNew = encryptedText;
		int count = 0;
		if (encryptedText == null)
			return null;
		else if (encryptedText=="")
			return "";
		else {
			if (n <= 0) {

				return encryptedText;
			} else {
				while (count != n) {
					sb = new StringBuilder();
					char[] buf = textNew.toCharArray();
					int j=buf.length/2;
					int countRow=0;
					for (int i = 0; i < buf.length/2+1; ) {       //i tist!s eT as   // This is a test! //hsi etTi sats!
						if(countRow%2==0||countRow==0)
						{
							char b = buf[j];
							j++;
							sb.append(b);
						} else if(i<buf.length/2){
						char b = buf[i];
						i++;
						sb.append(b);
						}
						countRow++;
						if(countRow==buf.length) {
							break;
						}
					}
					
					textNew = sb.toString();
					count++;
				}
			}

		}
		return textNew;
	}
	
	public static int solveSuperMarketQueue(int[] customers, int n) {
		int timeGeneralCheckOut = 0;
		Queue<Integer> quequeCustomers = new ArrayDeque<Integer>(n-1);
		boolean flag = true;

		if (customers.length == 0) {
			return 0;
		} else if (n == 1||customers.length<=n) {
			for (int count : customers) {
				timeGeneralCheckOut += count;
			}
			return timeGeneralCheckOut;
		} else if (n > 1) {

			for (int i = 0; i < customers.length&&i<n; i++) {
				int sumNext=0;

						quequeCustomers.offer(customers[i]);

						if(i>0)flag=false;
					

						int count;
						
						
						Iterator<Integer> iterator = quequeCustomers.iterator();
						
						while (iterator.hasNext()) {
							count = (int) iterator.next();
							sumNext+=count;
//							if(flag||count<sumNext) {
							if (quequeCustomers.remove(count)) {
								
								timeGeneralCheckOut += count;
							}
							
							
					}
				
			}

		}
		return timeGeneralCheckOut;
	}
}
