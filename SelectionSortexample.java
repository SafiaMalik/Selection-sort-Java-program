
public class SelectionSortexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortNumber = new int[5];
        
        sortNumber[0] = 30;
        sortNumber[1] =15;
        sortNumber[2] = 7;
        sortNumber[3] = 20;
        sortNumber[4] = 5;
        sort(sortNumber,5);
        for(int count=0; count<5;count++)
                {
        	System.out.println(sortNumber[count]);
                 }
	}
	public static void sort(int[]   sortNumber, int count)
	{
	  int index, indexOfNextSmallest;
	  for (index = 0; index < count - 1; index++)
	  {
	 
	    indexOfNextSmallest = indexOfSmallest(index,   sortNumber, count);
	  interchange(index, indexOfNextSmallest,sortNumber);
	  }
	}

	    private static int indexOfSmallest(int startIndex, int[]   sortNumber, int count)
	   { 
	    int min =   sortNumber[startIndex];
	     int indexOfMin = startIndex;
	     int index;
	     for (index = startIndex + 1; index < count; index++)
 if (  sortNumber[index] < min)
 { 
   min =   sortNumber[index];
   indexOfMin = index;
   //min is smallest of a[startIndex] through
   //  sortNumber[index]
 }
return indexOfMin;

	   }
	    private static void interchange(int i, int j, int[] sortNumber)
{
int temp;
temp = sortNumber[i];
sortNumber[i] = sortNumber[j];
sortNumber[j] = temp; //original value of sorNumber[i]
   
}

}
