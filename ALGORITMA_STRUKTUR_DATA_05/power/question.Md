    1. Explain the differences between the two methods created powerBF() dan powerDC()!

Answer: brute force using iteration for to calculate the exponential operation, the visual is like : 2^4 = 2x2x2x2
While the Divide and Conquer, is dividing the operation so it make the calculation more easy to count
example: 2^4 = 2^2 _ 2^2 = 4 _ 4 = 16

    2. Does the combine stage exist in the provided code? Show the relevant part!

Answer: yes, in divide n conquer we use combine, after separating the operation, we combine it (multiplying it again)
here is the line:
if (e==1){
return n;
}else{
if(e%2==1){
return (powerDC(n,e/2)*powerDC(n,e/2)*n);
}else{
return(powerDC(n,e/2)\*powerDC(n,e/2));
}
}

    3. In the powerBF() method, parameters are used to pass the base number and its exponent, even though the Power class already contains attributes for these values (baseNumber and exponent atribute). Do you think it is still relevant for the method to have parameters? Could the method be implemented without parameters instead? If so, how would the powerBF() method be structured without parameters?\

Answer: we can use a fnction without parameter if we want it, by replacing the "n" and "e" variable with baseNum and Exponent in the return value function

    4. Summarize how the powerBF() and powerDC() methods work!

Answer: Bf= iteration, the best visual is using for loop
Dc=dividing the process into another calculation that makes the process more easy to count
