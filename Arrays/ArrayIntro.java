public class ArrayIntro
{
  public static void main(String[] args)
   {
 	int[] intArray = new int[6];//Created the array of size 7
	intArray[0] = 20; //1st position
	intArray[1] = 35; //2nd position
	intArray[2] =-15;//3rd position
	intArray[3] = 14;//4rth position
	intArray[4] = 14;//4rth position
	intArray[5] = 16;//4rth position
	// intArray[6] = 7; Array Index out of bounds exception occurs

	//Iterating array using for each loop
	for(int var: intArray)
	{
	  System.out.println(var);
	}//for-each
    }//main
}//ArrayIntro class