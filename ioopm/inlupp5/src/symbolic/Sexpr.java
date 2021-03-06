package symbolic;

import java.util.*;

public abstract class Sexpr {
	public Sexpr() {
	}

	public abstract String getName();

	public double getValue() {
		return 0;
	}

	public int priority() {
		return 0;
	}

	public boolean isConstant() {
		return false;
	}

	public abstract Sexpr eval(Map<String, Sexpr> variables);

	public static void main(String[] args) {
		try {
			while (true) {
				Scanner sc = new Scanner(System.in);
				String var = sc.next();
				if (var.equals("quit")) {
					System.exit(0);
				} else if (var.equals("vars")) {
					System.exit(0);
				}
			}
		} finally {
			System.err.print("finally error");
		}
	}
}
