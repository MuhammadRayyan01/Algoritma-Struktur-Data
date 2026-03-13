    1. In the base case of the Divide and Conquer algorithm for calculating factorial, explain the differences in the code structure between the if and else conditions!

Answer: in factorial file, there is recursive function, that act as a program that can process and calculate the factorial formula. if "n" the number we input is one, then we just return the value itself because the factorial of 1 is 1 itself, but if its not 1, then we make the recursive program

    2. Is it possible to modify the loop in the factorialBF() method to use an alternative to the for loop? Please explain and give example if needed!

Answer: Beside for loop, we can use while loop or do-while loop, with the same concept, but different form of writing the program 3. Please explain the differences between facto = facto*i; and int facto = n * factorialDC(n-1); !
Answer: i'll explain the visual of first method and second method, lets say we input 5 for the n.
first method: because we use for loop with the limit of the number (5):
initiate the i = 1 and multiply it with the iteration. the result will be the new value
1 _ 1 = 1
1 _ 2 = 2
2 _ 3 = 6
6 _ 4 = 24
24 \* 5 = 120

While the second method:
doing recursively, starting from the number we input
5 _ (5-1) _ (4-1) _ (3-1) _ (2-1)
5 _ 4 _ 3 _ 2 _ 1 = 120

    4. Make a conclusion about the differences in how each method works. factorialBF()  and factorialDC()!

Answer: brute force means straight forward method where we only try to find the value the manual way, while the divide and conquer is separating the process become two or more step that can reduce the difficult when calculating the value
