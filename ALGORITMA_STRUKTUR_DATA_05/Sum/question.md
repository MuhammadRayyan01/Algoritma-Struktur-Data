    1. Why is mid variable needed in totalDC()method?

answer: mid act to divide the array into 2 part

    2. Explain the following statements in totalDC()method?

answer: lsum is the result of first calculation (1 to mid), while the rsum is the result of second calculation (mid+1 to r)

    3. Why is it necessary to sum the results of lsum and rsum as shown below??

answer: well this part is actually the concept of combine, after separating the calculation into small part, we sum it again to make the final result

    4. What is the base case of totalDC()method?

answer: when the array only have 1 element

    5. Draw a conclusion about how totalDC() works!

answer: divide: array separated into 2 part (using mid)
conquer: calculating using recursive in the first and second part
combine: sum the calculation
