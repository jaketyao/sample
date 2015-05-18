package demo.util;

public class QuickSort {

	public int partition(int list[], int left, int right) {
		int pivot, temp;
		int low, high;

		low = left;
		high = right;
		pivot = list[left];
		while (low < high) {
			do {
				low++;
			} while (low <= right && list[low] < pivot);

			while (high >= left && list[high] > pivot) {
				high--;
			}
			if (low < high) {
				temp = list[low];
				list[low] = list[high];
				list[high] = temp;
			}
		}

		temp = list[left];
		list[left] = list[high];
		list[high] = temp;

		return high;
	}

	//필터링 된것을 sorting 한다
	void quickSort(int list[], int left, int right) {
		if (left < right) {
			int q = this.partition(list, left, right);
			quickSort(list, left, q - 1);
			quickSort(list, q + 1, right);
		}
		
	}
}
