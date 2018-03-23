import java.util.Random;

public class QuickSort {
	private static 	int[] array = new int[30];

	public static void main(String[] args) {
		
		for (int i = 0; i < array.length - 1; i++) {
			Random rand = new Random();
			int number = rand.nextInt(31);
			array[i] = number;
		}

		int low = 0;
		int high = array.length - 1;
		Sort(array, low, high);

		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	public static void Sort(int[] array, int low, int high) {
		
		if (low >= high)
			return;

		int pivot = array[high];
		
		int i = low, j = high;
		while(i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(i,j);
				i++;
				j--;
			}
			if (low < j)
				Sort(array, low, j);

			if (high > i)
				Sort(array, i, high);
		}

	}
	public static void swap(int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}

}
