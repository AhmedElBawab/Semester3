package eg.edu.alexu.csd.oop.calculator.cs08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import eg.edu.alexu.csd.oop.calculator.Calculator;

/**
 * @author ahmed
 *
 */
public class MyCalculator implements Calculator {
	/**.
	 * first number string
	 *
	 */
	private StringBuilder firstNum = new StringBuilder();
	/**.
	 * second number string
	 *
	 */
	private StringBuilder secondNum = new StringBuilder();
	/**.
	 * the operation
	 *
	 */
	private char operation;
	/**.
	 * first number integer
	 *
	 */
	private double x;
	/**.
	 * second number integer
	 *
	 */
	private double y;
	/**.
	 * the history
	 *
	 */
	private ArrayList<String> history = new ArrayList<String>();
	/**.
	 * the current index in history
	 *
	 */
	private int currentIndex = 0;
	/**.
	 * the file
	 *
	 */
	private File memory = new File("memory.txt");
	/**.
	 * the file index
	 *
	 */
	private int fileIndex = 0;
	/**.
	 * max size for the history
	 *
	 */
	private final int historySize = 5;
	/**.
	 * power base
	 *
	 */
	private final int base = 10;

	@Override
    public final void input(final String s) {
		// TODO Auto-generated method stub
		this.addHistory(s);
	}

	@Override
	public final String getResult() {
		// TODO Auto-generated method stub
		this.readFormula(this.history.get(this.currentIndex));
		this.x = this.readNumber(this.firstNum.toString());
		this.y = this.readNumber(this.secondNum.toString());
		if (this.operation == '+') {
			return String.valueOf(this.x + this.y);
		} else if (this.operation == '-') {
			return String.valueOf(this.x - this.y);
		} else if (this.operation == '*') {
			return String.valueOf(this.x * this.y);
		} else if (this.operation == '/') {
			if (this.y == 0) {
				return null;
			}
			return String.valueOf(this.x / this.y);
		} else {
			return null;
		}
	}

	@Override
	public final String current() {
		// TODO Auto-generated method stub
		if (this.currentIndex >= this.history.size()) {
			return null;
		}
		if (this.history.get(this.currentIndex).equals(null)) {
			return null;
		}
		return this.history.get(this.currentIndex);
	}

	@Override
	public final String prev() {
		// TODO Auto-generated method stub
		if (this.currentIndex > 0) {
			this.currentIndex--;
			return this.history.get(this.currentIndex);
		}
		return null;
	}

	@Override
	public final String next() {
		// TODO Auto-generated method stub
		if (this.currentIndex < this.history.size() - 1) {
			this.currentIndex++;
			return this.history.get(this.currentIndex);
		}
		return null;
	}

	@Override
	public final void save() {
		// TODO Auto-generated method stub
		try {
			PrintWriter p = new PrintWriter(this.memory);
			for (int i = 0; i < this.history.size(); i++) {
				p.println(this.history.get(i));
			}
			p.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.fileIndex = this.currentIndex;
	}

	@Override
	public final void load() {
		// TODO Auto-generated method stub
		try {
			this.history.clear();
			FileReader fr = new FileReader(this.memory);
			BufferedReader br = new BufferedReader(fr);
			try {
				String temp = br.readLine();
				while (temp != null) {
					this.history.add(temp);
					temp = br.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.currentIndex = this.fileIndex;
	}

	/**
	 * @add the new formula to the history
	 *
	 */
	/**
	 * @param s s
	 *
	 */
	private void addHistory(final String s) {
		if (this.history.size() == this.historySize) {
			this.history.remove(0);
		}
		this.history.add(s);
		this.currentIndex = this.history.size() - 1;
	}

	/**
	 * convert the formula to  strings
	 *
	 */
	/**
	 * @param s s
	 *
	 */
	private void readFormula(final String s) {
		int i = 0;
		this.firstNum = new StringBuilder();
		this.secondNum = new StringBuilder();
		while (s.charAt(i) != '+' && s.charAt(i) != '-'
				&& s.charAt(i) != '*' && s.charAt(i) != '/') {
			this.firstNum.append(s.charAt(i));
			i++;
		}
		this.operation = s.charAt(i);
		i++;
		while (i < s.length()) {
			this.secondNum.append(s.charAt(i));
			i++;
		}
	}

	/**
	 * convert the numbers string to int
	 *
	 */
	/**
	 * @return s s
	 * @param s s
	 *
	 */
	private double readNumber(final String s) {
		double num = 0;
		int p = s.length(); // point initial place
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.') {
				p = i;
				break;
			}
		}
		if (p != s.length()) {
			int t = -1;
			for (int i = p + 1; i < s.length(); i++) {
				num = num + (s.charAt(i) - '0')
						* Math.pow(this.base, t);
				t--;
			}
		}
		int t = 0;
		for (int i = p - 1; i > -1; i--) {
			num = num + (s.charAt(i) - '0')
					* Math.pow(this.base, t);
			t++;
		}
		return num;
	}

}
