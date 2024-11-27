package com.array_list;

public class ArrayList {
	private Object[] arr = new Object[10];
	private int count = 0;
	
	public void add(Object ele) {
		if (count == arr.length) increase();
		arr[count++] = ele;
	}
	
	public void add(Object ele, int index) {
		if (count == arr.length) increase();
		System.arraycopy(arr, index, arr, index + 1, arr.length - index - 1);
		arr[index] = ele;
		count++;
	}
	
	private void increase() {
		Object[] temp = new Object[arr.length + ((arr.length + 3) / 2)];
		System.out.println(temp.length);
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}
	
	public int size() {
		return count;
	}
	
	public Object get(int index) {
		return arr[index];
	}
	
	public void remove(int index) {
		System.arraycopy(arr, index + 1, arr, index, arr.length - index - 1);
		count--;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
}
