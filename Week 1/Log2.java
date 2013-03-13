/*
 *  Write a static method lg() that takes an int value N as argument and returns 
    the largest int not larger than the base-2 logarithm of N. Do not use Math.
    na x je n
    log_a (x) = log_b (x) / log_b (a)
 */ 

public class Log2
{
    public static int lg(int N)
    {
        //check simple base cases for N = 0, 1 or 2
        if (N == 0)
            return -1;
        if (N == 1)
            return 0;
        if (N == 2)
            return 1;
        //if N is greater than simple base cases
        //not needed 
        //int difference = N - 2;
        
        // (log base 2 of 10 (N)) = x  -> can be written like this:
        // (2 to the power of x) = 10 (N)  -> here x is number of times we have to multiply the base by itself to 
        //get to the number (N) given by the user
        //so in a simple loop we keep track i.e. check if the track has overcome N
        //when it has, we simply return counter which is our largest integer not larger than the base2 log.
        int track = 2;
        int counter = 1;
        for (int i = 0; i < N; i++)
        {
            track *= 2;
            //if ((N - track) < difference)
              //  difference = N - track;
            
            if (track > N)
                return counter;
            counter++;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        //take number as an argument to main
        // and call lg static method
        int x = StdIn.readInt();
        System.out.println(lg(x));
    }
}
