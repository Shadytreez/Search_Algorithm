
public class TestTimes implements TestTimesInterface {

	private long[] testTimes = new long [10];
	private int numTestTimes = 0;
	
	@Override
	public long getLastTestTime() {
		//if the last number in  array is emepty 
		
		return testTimes[numTestTimes-1];
		
	}
	@Override
	public long[] getTestTimes() {
		//return a clone so the user cant change the array
		return testTimes.clone();
	}
	@Override
	public void resetTestTimes() {
		//set all the element in the array to 0
		for (int i = 0; i < testTimes.length; i++) {
			testTimes[i] = 0;
		}
		//we could also use
		//  testTimes = new long [10];
		//set the counter to 0
		numTestTimes = 0;
		
	}
	@Override
	public void addTestTime(long testTime) {
		//if we hit the max for length, make space for the new input by getting rid of the oldest elemenet
		//example 0123456789 to 1234567891
		if (numTestTimes ==  testTimes.length) {
			for(int i = 0; i < testTimes.length -1; i++ ) {
				testTimes[i] = testTimes[i+1];
			}
			testTimes[numTestTimes] = testTime;
		}else {
			testTimes[numTestTimes++] = testTime;
		}
		
	}
	@Override
	public double getAverageTestTime() {
		double counter = 0.0; //to keep track of  the amount number in the array that arent 0
		double numHolder= 0.0; //t0 keep track of all the number added together that arent 0
		
		for(int i = 0; i < testTimes.length; i++) {
			if(testTimes[i] != 0) {
				counter++;
				numHolder = numHolder + testTimes[i];
			}
		}
		//return the average ,if the array is all 0 then return 0
		return numHolder / counter;
	}
}
