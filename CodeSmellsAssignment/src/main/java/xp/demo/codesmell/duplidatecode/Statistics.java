package xp.demo.codesmell.duplidatecode;

public class Statistics{
	
	public double calculateDifferenceOfAverage(double[] array1, double[] array2){
        return Math.abs(average(array1) - average(array2));
	}

    private double average(double[] array) {
        double sum = 0;
        for (double anArray : array) {
            sum += anArray;
        }
        return sum/array.length;
    }

    /* sampleVariance = Sum ( xi  - mean )2 / n-1  */
    public double calculateSampleVariance(double[] elements) {
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average(elements), 2);
        }
        return temp /(elements.length-1);
        
    }
}