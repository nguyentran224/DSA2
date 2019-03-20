import java.util.ArrayList;
import java.util.*;
public class Gqueue<T> {
	// FIrst in first out
	private ArrayList<T> data = new ArrayList<>();
	
	public void push(T element) {
		data.add(element);	
	}
	public T pop() {
		T element = data.get(0);
		data.remove(0);
		return element;
	}
	public boolean isEmpty() {
		return data.size() == 0;
	}
	public String toString() {
		return "Gstack [data = " + data + "]";
	}
	public static void main(String []args) {
		Gqueue<String> t = new Gqueue<>();
		t.push("E");
		t.push("S");
		t.push("S");
		t.push("I");
		t.push("E");
		System.out.println(t);
		String x = t.pop();
		System.out.println(x);
		x = t.pop();
		System.out.println(x);
		System.out.println(t);
	}
}
