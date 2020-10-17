import java.util.Random; 

public class Driver implements DriverInterface{

	@Override
	public int[] getListOfNumbers() {
		//make a array from 1 to 10000000
		int[] veryLongArray = new int[10000000] ;
		for (int i = 0; i < veryLongArray.length; i++) {
			veryLongArray[i] = i+1;
			
		}
		return veryLongArray;
	}

	@Override
	public int[] getTargets() {
		//return these specific number
		int[] newNum = new int[] {500, 10000,100000, 1000000, 5000000, 7500000, 10000000};
		return newNum;
	}

	@Override
	public TestTimes runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes) {
		int counter = 0;
		LinearSearch searcher = new LinearSearch();
		TestTimes tester = new TestTimes();
		
		
		while (counter != numberOfTimes ) {
			//to start the timer
			long startTime = System.nanoTime();
			//searching
			searcher.search(listOfNumbers, target);
			//stop the timer after the search and endTime - startTime = TimeAmount it took for the search
			long endTime  = System.nanoTime();
			long Timeamount = endTime - startTime;
			//then add that to the TestTimes class with addTestTime	
			tester.addTestTime(Timeamount);
			counter++;
		}
		return tester;
	}

	@Override
	public TestTimes runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes) {
		int counter = 0;
		BinarySearch searcher = new BinarySearch();
		TestTimes tester = new TestTimes();
		while (counter != numberOfTimes ) {
			//to start the timer
			long startTime = System.nanoTime();
			//searching
			searcher.search(listOfNumbers, target);
			//stop the timer after the search and endTime - startTime = TimeAmount it took for the search
			long endTime  = System.nanoTime();
			long Timeamount = endTime - startTime;
			//then add that to the TestTimes class with addTestTime	
			tester.addTestTime(Timeamount);
			counter++;
		}
		
		return tester;
	}
	

}
