public class Populations {
    public static void main(String[] args) {
        long currentPop = 8000000000L; // replace with research value
        double rate = 0.0085; // 0.85% example
        System.out.println("Year\tPopulation\tIncrease");
		
		
        for (int year=1; year<=75; year++) {
            long increase = (long)(currentPop * rate);
            currentPop += increase;
            System.out.printf("%d\t%d\t%d%n", year, currentPop, increase);
			
            if (currentPop >= 16000000000L) {
                System.out.println("Doubles in year "+year);
                break;
            }
        }
    }
}