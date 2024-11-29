package custom_array_list;

public class CustomArrayList {
	private Object[] arr = new Object[10];
	private int count;
	
	public void add(Object ele) {
		if (count == arr.length) increase();
		arr[count++] = ele;
	}
	
	public Object get(int index) {
		return arr[index];
	}
	
	public int size() {
		return count;
	}
	
	public void remove(int i) {
		System.arraycopy(arr, i + 1, arr, i, arr.length - i - 1);
		count--;
	}
	
	private void increase() {
		Object[] temp = new Object [arr.length + (arr.length + 3) / 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}
}
