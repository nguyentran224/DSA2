import java.util.ArrayList;

public class Gstack<T> {
	//First in Last out
	private ArrayList<T> data = new ArrayList<>();
	
	public void push(T element) {
		data.add(element);
	}
	public T pop() {
		int end = data.size() - 1;
		T element = data.get(end);
		data.remove(end);
		return element;
	}
	public boolean isEmty() {
		return data.size() == 0;
	}
	public boolean contains(T obj) {
		return data.contains(obj);
	}


	@Override
	public String toString() {
		return "Gstack [data=" + data + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gstack<String> t = new Gstack<>();
		t.push("T");
		t.push("H");
		t.push("I");
		t.push("E");
		t.push("N");
		System.out.println(t);
		//first time
		String x = t.pop();
		System.out.println(x);
		//second time
		x = t.pop();
		System.out.println(x);
		System.out.println(t);
		System.out.println(t.isEmty());
	}
}
