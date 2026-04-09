1. Why is the condition i < idx - 1?
   Because: In Bubble Sort, the outer loop runs n - 1 times, and After each iteration, the largest element is already placed in its correct position

2. Why is the condition j < idx - i - 1?
   Because:
   After each iteration of i, the largest element is already at the end
   The sorted part at the end does not need to be checked again

3. If the number of data in listStudents is 50, how many times will the i loop execute? How many stages of Bubble Sort will be performed?
   answer: 50 - 1 = 49 iteration
