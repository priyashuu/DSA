### Algorithm for Linear Search (Simple Steps)

1. **Input the number of elements (n)**: Ask the user for the number of elements in the array.
2. **Create an array (a) of size n**: Allocate space for `n` elements.
3. **Input array elements**: Loop through and take input for each element.
4. **Input the search item (item)**: Ask the user for the item they want to search for.
5. **Search through the array**: 
   - Loop through each element of the array.
   - If the current element matches `item`, set a flag (c) to 1 and stop searching.
6. **Check the result**:
   - If the flag is set (c > 0), print "Item exists".
   - Otherwise, print "Item doesn't exist".

---


#### **Linear Search Program in Java**

This program demonstrates the linear search algorithm, which is a simple method for finding a specific item in a list or array by checking each element one by one.

---

#### **How It Works**

1. Prompts the user for the number of elements in the array.
2. Allows the user to input the elements of the array.
3. Prompts the user for the item they wish to search for in the array.
4. Uses a simple loop to compare each array element with the item.
5. Displays whether the item exists in the array.

---

#### **Prerequisites**
- A basic understanding of Java.
- A Java compiler or IDE (e.g., IntelliJ, Eclipse, or Command Line).

---

#### **How to Run**

1. Copy the code into a file named `LinearSearch.java`.
2. Compile the file using:
   ```bash
   javac LinearSearch.java
   ```
3. Run the program using:
   ```bash
   java LinearSearch
   ```
4. Follow the prompts to input:
   - The number of elements.
   - The elements of the array.
   - The item to search for.

---

#### **Sample Input/Output**

**Input:**
```
How many elements do you need
5
Enter elements
12 34 54 2 3
Enter the item that you want to find
54
```

**Output:**
```
Item exists
```

**Input:**
```
How many elements do you need
4
Enter elements
10 20 30 40
Enter the item that you want to find
25
```

**Output:**
```
Item doesn't exist
```

---

#### **Key Concepts**
- **Time Complexity**: O(n), where n is the number of elements in the array.
- **Space Complexity**: O(1), as no additional space is used for storage beyond the input.

---

Feel free to contribute or modify the code as needed! 🎉