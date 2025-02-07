. Insertion Sort
Algorithm:

Start with the second element (assume the first element is sorted).

Compare the current element with the previous elements.

Shift the previous elements to the right until the correct position is found.

Insert the current element in its correct position.

Repeat for all elements.

Simple Steps:

Copy
For i from 1 to n-1:
    key = arr[i]
    j = i - 1
    While j >= 0 and arr[j] > key:
        arr[j + 1] = arr[j]
        j--
    arr[j + 1] = key