import java.util.Scanner;
public class BubbleSort{

	public static void main(String[] args)
		{
			
				int[] intArray = {10, 35, -15, 7,55,1,-22}; //Hard coded
				
				/* To input manually from the user 
				int[] intArray= new int[10];
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the length:");
				int n = in.nextInt();
				for(int i=0; i<n;i++)
				{
					intArray[i] = in.nextInt();
				}//for
				*/
				
				
			for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
			{
			  /* Simple for loop used for iterating all the elements until the lastUnsortedIndex.*/
				for(int i = 0; i< lastUnsortedIndex;i++){
			 /*Simple for loop used for iterating through each element of the array until lastUnsortedIndex.*/
					if(intArray[i] > intArray[i + 1]){ /*If Left hand side element > Right Hand side element, call the swap method. */
						swap(intArray, i, i+1);
						}//if
				  }//for
			}//for
			for(int i=0 ; i<intArray.length; i++)
			{
			System.out.println(intArray[i]);
			}//for-each
		}//main

	public static void swap(int[] array, int i, int j){
	/* Used to Swap the elements of the array with the following parameters specified
		Parameter1 = Name of the array.
		Parameter2 = Index to 1st element to be swapped.
		Parameter3 = Index of next element to be swapped.
	*/
		if(i == j) /*If the elements are equal return the element*/
		{
		   return;
		} /* If the elements are unequal then the control reaches this position and swaps them */
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	} // swap
}// class-BubbleSort