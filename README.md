# Bubble Sort Algorithm
Bubble sort algorithm is a sorting algorithm that takes to indexes of an array that are next to each other and compares which one is largest. The largest one gets moved to the right and the smallest one to the left. This gets iterated over the array until the end. 
I used a very simple method that i researched by taking two for loops inside eachother. One iterates over the entire array while the other iterates over -1 of the entire array. This then includes an if statement to check whenever the indexes are bigger and then uses a placeholder variable to store one of the values to then be swapped over. 

```   public int[] bubbleSort(int[] A) {
        int n = A.length;
        for(int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int holder = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = holder;
                }
            }
        }
        return A;
    }
    ```
    
