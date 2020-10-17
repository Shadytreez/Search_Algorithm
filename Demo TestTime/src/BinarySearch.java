
public class BinarySearch extends  TestTimes implements SearchInterface{

	@Override
	public int search(int[] listOfNumbers, int target) {
		long startTime = System.nanoTime();
		long endTime;
		
		int low = 0;
		int high = listOfNumbers.length;
		int middle = (low+ high)/2;
		
		while(high >= low) {
			middle = (low+ high)/2;
			if(listOfNumbers[middle] == target) {
				endTime = System.nanoTime();
				long Timeamount = endTime - startTime;
				addTestTime(Timeamount);
				return middle;
			}else if (listOfNumbers[middle] > target) {
				high = middle - 1;
			}else {
				low = middle + 1;
			}
		}
		endTime = System.nanoTime();
		long Timeamount = endTime - startTime;
		addTestTime(Timeamount);
		return -1;
	}

}
