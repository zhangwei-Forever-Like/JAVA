import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PolandNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression = "1+((20+3)*4)-5";
		List<String> list = getListString(expression);
		System.out.println(list);
		List<String> list2 = parseSuffixExpressionList(list);
		System.out.println(list2);
		int num = cal(list2);
		System.out.println(num);
	}

	public static List<String> getListString(String s) {
		List<String> list = new ArrayList<String>();
		int i = 0;
		String str;
		char c;
		do {
			if ((c = s.charAt(i)) < 48 || (c = s.charAt(i)) > 57) {
				list.add("" + c);
				i++;
			} else {
				str = "";
				while (i < s.length() && (c = s.charAt(i)) >= 48 && (c = s.charAt(i)) <= 57) {
					str += c;
					i++;
				}
				list.add(str);
			}
		} while (i < s.length());
		return list;
	}

	public static List<String> parseSuffixExpressionList(List<String> ls) {
		Stack<String> s1 = new Stack<String>();
		List<String> s2 = new ArrayList<String>();
		for (String item : ls) {
			if (item.matches("\\d+")) {
				s2.add(item);
			} else if (item.equals("(")) {
				s1.push(item);
			} else if (item.equals(")")) {
				while (!s1.peek().equals("(")) {
					s2.add(s1.pop());
				}
				s1.pop();
			} else {
				while (s1.size() != 0 && Operation.getValue(item) <= Operation.getValue(s1.peek())) {
					s2.add(s1.pop());
				}
				s1.push(item);
			}
		}
		while (s1.size() != 0) {
			s2.add(s1.pop());
		}
		return s2;
	}

	public static int cal(List<String> ls) {
		Stack<String> stack = new Stack<String>();
		for (String item : ls) {
			if (item.matches("\\d+")) {
				stack.push(item);
			} else {
				int num2 = Integer.parseInt(stack.pop());
				int num1 = Integer.parseInt(stack.pop());
				int result = 0;
				if (item.equals("+")) {
					result = num2 + num1;
				} else if (item.equals("-")) {
					result = num1 - num2;
				} else if (item.equals("*")) {
					result = num2 * num1;
				} else if (item.equals("/")) {
					result = num1 / num2;
				}
				stack.push("" + result);
			}
		}
		return Integer.parseInt(stack.pop());
	}
}

class Operation {
	public static int getValue(String operation) {
		int result = 0;
		switch (operation) {
		case "+":
			result = 1;
			break;
		case "-":
			result = 1;
			break;
		case "*":
			result = 2;
			break;
		case "/":
			result = 2;
			break;
		default:
			break;
		}
		return result;
	}
}
