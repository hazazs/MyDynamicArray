package hu.hazazs.mda;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class DynamicArray<T> {

	private T[] array;
	private int length = 0;

	@SuppressWarnings("unchecked")
	void add(T element) {
		T[] temp = (T[]) Array.newInstance(Object.class, length + 1);
		if (array != null) {
			System.arraycopy(array, 0, temp, 0, length);
		}
		temp[length++] = element;
		array = temp;
	}

	@SuppressWarnings("unchecked")
	void add(int index, T element) {
		if (index > length || index < 0) {
			System.out.println("This index is not valid! The element cannot be inserted!");
		} else {
			T[] temp = (T[]) Array.newInstance(Object.class, length + 1);
			if (array != null) {
				for (int i = 0; i < array.length; i++) {
					temp[i >= index ? i + 1 : i] = array[i];
				}
			}
			temp[index] = element;
			array = temp;
			length++;
		}
	}

	T get(int index) {
		if (index >= length || index < 0) {
			System.out.print("This index is not valid! => ");
			return null;
		} else {
			return array[index];
		}
	}

	boolean contains(T element) {
		for (int i = 0; i < length; i++) {
			if (array[i] == element) {
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	void remove(int index) {
		if (index >= length || index < 0) {
			System.out.println("This index is not valid! The element cannot be deleted!");
		} else {
			if (length == 1) {
				array = null;
			} else {
				T[] temp = (T[]) Array.newInstance(Object.class, length - 1);
				for (int i = 0; i < temp.length; i++) {
					temp[i] = array[i >= index ? i + 1 : i];
				}
				array = temp;
			}
			length--;
		}
	}

	@SuppressWarnings("unchecked")
	void removeAll(T element) {
		int numberOfElement = numberOfElement(element);
		if (numberOfElement == 0) {
			System.out.println("The array doesn't contain this element! It cannot be deleted!");
		} else {
			if (length == numberOfElement) {
				array = null;
			} else {
				T[] temp = (T[]) Array.newInstance(Object.class, length - numberOfElement);
				for (int i = 0, j = 0; i < temp.length; i++, j++) {
					while (array[j] == element) {
						j++;
					}
					temp[i] = array[j];
				}
				array = temp;
			}
			length -= numberOfElement;
		}
	}

	private int numberOfElement(T element) {
		int counter = 0;
		for (int i = 0; i < length; i++) {
			if (array[i] == element) {
				counter++;
			}
		}
		return counter;
	}

	@Override
	public String toString() {
		return String.format("%s (length = %d)", Arrays.toString(array), length);
	}

}