package Bolum_9_Soru_6;

public class StopWatchTest {
	public static void main(String[] args) {
		
		StopWatch zaman = new StopWatch();
		
		int[] dizi = new int[10000];
		
		diziyeRastgeleSayiAtama(dizi);
		
		zaman.start();
		
		selectionSort(dizi);
		
		zaman.stop();
		
		System.out.println("Gecen sure = " + zaman.getElapsedTime());
		
		ekranaYaz(dizi);
	}

	private static void diziyeRastgeleSayiAtama(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random()*dizi.length);
		}
	}

	private static void ekranaYaz(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(dizi[i] + " ");
		}
	}

	public static void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			// min is the index of the smallest element with an index greater or equal to i
			int min = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[min]) {
					min = j;
				}
			}
			// Swapping i-th and min-th elements
			int swap = nums[i];
			nums[i] = nums[min];
			nums[min] = swap;
		}
	}

}
