public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n) {
        if (n <= 1) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */

    public long fibonacciIndex(long n) {
	if(n<0)
	{
		return -1;
	}

    long a = 0 ;
    long b = 1 ;
    long index = 0 ;

    if(n == 0)
    {
        return 0;
    }

    if(n == 1)
    {
        return 1;
    }

    while(b <= n)
    {
        long temp = b;
        b = b + a ;
        a = temp ;
        index++;

        if(b==n)
        {
            return index +1;
        }
    }

        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        if( n <= 0)
        {
            return new char[0][0];
        }

        char[][] triangle = new char[n][];

        for(int i = 0 ; i < n ; i++)
        {
            triangle[i] = new char[i+1];    // dynamically creates the array so it doesnt waste memmory (mige har radif yeki bishtar sootoon dare)

            for(int j = 0 ; j <= i ; j++)
            {
                if( i == j || j == 0 || i == n - 1 )
                {
                    triangle[i][j] = '*';
                }
                else
                {
                    triangle[i][j] = ' ';
                }
            }
        }

        return triangle;
    }

    public static void main(String[] args)
    {
        Exercises exercises = new Exercises();

        // Test isPrime
        System.out.println("Is 7 prime? " + exercises.isPrime(7)); // true
        System.out.println("Is 10 prime? " + exercises.isPrime(10)); // false

        // Test fibonacciIndex
        System.out.println("Index of 3 in Fibonacci: " + exercises.fibonacciIndex(3)); // 4
        System.out.println("Index of 7 in Fibonacci: " + exercises.fibonacciIndex(7)); // -1

        // Test generateTriangle
        char[][] triangle = exercises.generateTriangle(4);
        for (char[] row : triangle) {
            System.out.println(new String(row));
        }
    }
}