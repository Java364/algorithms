package console;

public class SortingStrategy {
	Sort sort;

	public SortingStrategy(Sort sort) {
		super();
		this.sort = sort;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public int[] sort(int[] array) {
		return sort.sort(array);
	}
}
