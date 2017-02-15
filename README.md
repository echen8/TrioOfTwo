TrioOfTwo - Eric Chen, Aryan Bhatt
APCS2 pd4
HW07 - What Does the Data Say?
2017-02-14

<h1>Methodology and Findings</h1>
  To find the runtime of our program, we made a for loop outside of everything to loop it a set amount of times for our batch.  Inside the loop, we randomly filled int arrays with n amount of ints, which would be our test array.  We used a long to hold the runtime's start nanoTime, and calculated the elapsed time, which was the nanoTime found after running the sort() method subtracted by the start time.  We then added this amount to a sum holder, and divided by the batch size to get an average runtime for a set of n size.
  We found that the runtime was more or less a O(n) runtime, as the results, when graphed, were almost a straight line.  This contradicted our original hypothesis of it being log-linear, which was derived because of the recursive aspect of our code.