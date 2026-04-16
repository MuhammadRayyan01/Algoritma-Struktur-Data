1. Show the program code in which runs the divide process!\*\*

The _divide_ process in Binary Search occurs when the algorithm splits the data into two parts by determining the middle index.

mid = (left + right) / 2;

In this step, the algorithm calculates the middle position of the current search range. This middle value is used to divide the dataset into two halves, which helps reduce the search space efficiently.

2. Show the program code in which runs the conquer process!\*\*

The conquer process happens when the algorithm decides which part of the data should be searched next.

if(search == listStd[mid].NIM){
return mid;
}else if(search > listStd[mid].NIM){
left = mid + 1;
}else{
right = mid - 1;
}

Narrative:
At this stage, the algorithm compares the target value with the middle element. If they are equal, the data is found. If the target value is greater, the search continues in the right half. Otherwise, it continues in the left half.

---

3. If inserted NIM data is not sorted, will the program give the correct result? Why?\*\*

Answer:
No, the program will not give the correct result.

Narrative:
Binary Search requires the data to be sorted in advance. If the data is not sorted, the division into left and right parts becomes invalid. As a result, the algorithm may skip the correct data and produce incorrect results.

---

4. If data is sorted descending, does it return correct result? If not, fix the code\*\*

Answer:
No, it will not return the correct result.

Narrative:
The standard Binary Search algorithm assumes that the data is sorted in ascending order. If the data is sorted in descending order, the comparison logic becomes incorrect, leading to wrong results.

Fixed code for descending order:

```java
if(search == listStd[mid].NIM){
    return mid;
}else if(search < listStd[mid].NIM){
    left = mid + 1;
}else{
    right = mid - 1;
}
```

Narrative:
By reversing the comparison conditions, the algorithm correctly adjusts the search direction for descending data order.

---

5. Modify program so that the students amount inserted is matched with user input\*\*

Answer + Narrative:
The program can be modified to make the number of students dynamic based on user input, instead of using a fixed-size array.

Example:

```java
Scanner sc = new Scanner(System.in);
System.out.print("Input number of students: ");
int n = sc.nextInt();

SearchStudent data = new SearchStudent(n);
```

In the class:

```java
Student[] listStd;

public SearchStudent(int size){
    listStd = new Student[size];
}

With this modification, the program becomes more flexible because the number of students is determined by user input. This allows the system to handle different data sizes dynamically.
```
