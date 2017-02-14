// Eric Chen
// APCS2 pd4
// HW06 -- Step 1: Split, Step 2: ?, Step 3: Sorted!
// 2017-02-10

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:

  Merge:
  It loops through a newly created int array 'retArray' and replaces the int it is targetted on
  with the lower of the two given arrays, using individual indices to serve as separators from
  ints that have been transferred to retArray already with ints that haven't been transferred yet.

  Sort:
  First, it checks if the length of the given array 'arr' is 1, and if so, it return arr.
  Otherwise, it splits arr into two different int arrays: a and b.  It then merges the two after
  they get recursively sorted.

  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) {

	int[] retArr = new int[ a.length + b.length ];
	
	int ia = 0;
	int ib = 0;
	for ( int i = 0 ; i < retArr.length ; i++ ) {
	    if ( ia == a.length ) {
		retArr[i] = b[ib];
		ib++;
	    }
	    else if ( ib == b.length ) {
		retArr[i] = a[ia];
		ia++;
	    }
	    else if ( a[ia] < b[ib] ) {
		retArr[i] = a[ia];
		ia++;
	    }
	    else {
		retArr[i] = b[ib];
		ib++;
	    }
	}// Close for loop
	
	return retArr;
	
    }// end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) {

	int[] retArr = new int[arr.length];
	
	if ( arr.length <= 1 ) return arr;
	else {
	    int[] a = new int[arr.length - (arr.length/2)];
	    int[] b = new int[arr.length/2];

	    int ia = 0;
	    int ib = 0;
	    for ( int i = 0 ; i < arr.length ; i++ ) {
		if ( ( i % 2 ) == 0 ) {
		    a[ia] = arr[i];
		    ia++;
		}
		else {
		    b[ib] = arr[i];
		    ib++;
		}
	    }
	    
	    retArr = merge( sort( a ), sort( b ) );
	}
	return retArr;
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {

	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );
	
	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort

