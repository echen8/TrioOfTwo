/*======================================
  class MergeSortTester

  ALGORITHM:
  First, it checks if the length of the given array 'arr' is 1, and if so, it return arr.  Otherwise, it splits arr into two different int arrays: a and b.  It then merges the two after they get recursively sorted.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O( n * log(n) )

  Mean execution times for dataset of size n:
  Batch size: 10000
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {

	int[] n1 = new int[1];
	int[] n10 = new int[10];
	int[] n100 = new int [100];

	long[] n1t = new long[10000];
	long[] n10t = new long[10000];
	long[] n100t = new long[10000];

	// Runs 10000 times
	for ( int j = 0 ; j < 10000 ; j++ ) {

	    n1[0] = (int)( Math.random() * 5 );

	    for ( int i = 0 ; i < 10 ; i++ ) {
		n10[i] = (int)( Math.random() * 50 );
	    }

	    for ( int i = 0 ; int i < 100 ; i++ ) {
		n100[i] = (int)( Math.random() * 500 );
	    }



	}

    }//end main

}//end class
