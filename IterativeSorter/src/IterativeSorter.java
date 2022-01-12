public class IterativeSorter {

	public void doBubbleSort(IntegerArray arrayToSort) {
		int size = arrayToSort.length();
		for (int i = 0; i < (size - 1); i++) {
			for (int j = 0; j < (size - i - 1); j++) {
				if (arrayToSort.read(j) > arrayToSort.read(j + 1)) {
					int temp = arrayToSort.read(j);
					arrayToSort.write(j, arrayToSort.read(j + 1));
					arrayToSort.write(j + 1, temp);

				}
			}
		}
	}

	public void doSelectionSort(IntegerArray arrayToSort) {
		int size = arrayToSort.length();
		for (int i = 0; i < size; i++) {
			int min = i;
			for (int j = (i + 1); j < size; j++) {
				if (arrayToSort.read(j) < arrayToSort.read(min)) {
					min = j;
				}
			}
			int swap = arrayToSort.read(i);
			arrayToSort.write(i, arrayToSort.read(min));
			arrayToSort.write(min, swap);
		}
	}

	public void doInsertionSort(IntegerArray arrayToSort) {
		int size = arrayToSort.length();
		for (int step = 1; step < size; step++) {
			int key = arrayToSort.read(step);
			int j = step - 1;

			while (j >= 0 && key < arrayToSort.read(j)) {
				arrayToSort.write(j + 1, arrayToSort.read(j));
				j--;
			}
			arrayToSort.write(j + 1, key);
		}
	}

}
