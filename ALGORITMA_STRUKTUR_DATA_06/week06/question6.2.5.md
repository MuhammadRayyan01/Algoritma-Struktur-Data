1. Explain the function of the program code
   answer:
   The function of the sorting program is:
   To arrange data in an array (ascending or descending order)
   Using specific algorithms such as:
   -Bubble Sort, repeatedly swaps adjacent elements
   -Selection Sort, selects the minimum value
   -Insertion Sort, inserts elements into the correct position

2. Show the program code that implements the minimum value search algorithm in selection sort!
   for(int i=0; i<size-1; i++){
   int minIndex = i;
   for(int j=i+1; j<size; j++){
   if(data[j]<data[minIndex]){
   minIndex = j;
   }
   }
   int temp = data[i];
   data[i] = data[minIndex];
   data[minIndex] = temp;
3. n insertion sort, explain the purpose of the condition in the loop.
   Purpose:
   To compare previous elements with key
   If larger ,then shift them to the right
   Stops when correct position is found
4. In insertion sort, what is the purpose of the given command?
   To place the key element into its correct sorted position
