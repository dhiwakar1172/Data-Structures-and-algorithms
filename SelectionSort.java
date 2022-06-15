import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) 
	{
		
		for(int i=0;i<arr.length;i++) 
		{
			int minIndex = i;
			for(int j=i;j<arr.length;j++) 
			{
				if(arr[minIndex]>arr[j]) 
				{
					minIndex = j;
				}	
			}
			int temp = arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void descselectionSort(int[] arr) 
	{
		
		for(int i=0;i<arr.length;i++) 
		{
			int maxIndex = i;
			for(int j=i;j<arr.length;j++) 
			{
				if(arr[maxIndex]<arr[j]) 
				{
					maxIndex = j;
				}	
			}
			int temp = arr[maxIndex];
			arr[maxIndex]=arr[i];
			arr[i]=temp;
		}
	}

}
