# README: Multi-threading with Assignment8.java

## Overview
In this assignment, you will implement asynchronous code to fetch data using the provided `Assignment8.java` class. The goal is to enhance the performance of data retrieval and process the results by counting occurrences of unique numbers from a dataset.

## Learning Objectives
- Understand and implement **multi-threading** in Java.
- Learn to write asynchronous code to optimize performance.
- Use data structures like `ArrayList` and `Map` to organize and process large datasets.
- Practice counting and displaying occurrences of unique numbers.

---

## Steps to Complete

### Step 1: Asynchronous Data Fetching
Your task is to call the `getNumbers()` method asynchronously. 
- The existing synchronous code fetches data correctly but is slow. Replace this with **multi-threaded** logic to improve speed.
- Use tools like `ExecutorService`, `CompletableFuture`, or plain threads to implement asynchronous fetching.

#### Key Tools You’ll Use:
- `ExecutorService`
- `Future`
- `CompletableFuture`
- Thread synchronization (if necessary)

---

### Step 2: Count Unique Number Occurrences
Once the data is fetched:
- Count how many times each number appears in the dataset.
- Use a `Map<Integer, Integer>` to store the results, where the key is the number, and the value is the count of occurrences.

#### Example Input:
```
1, 5, 10, 3, 1, 2, 9, 4, 6, 1, 9, 10, 5
```

#### Desired Output:
```
1=3, 2=1, 3=1, 4=1, 5=2, 6=1, 7=0, 8=0, 9=2, 10=2
```

---

## Constraints
- **Do not modify any of the provided code** from the GitHub repository.
- You may add new methods and classes if needed, but ensure the existing logic remains intact.

---

## Skills Gained
1. **Multi-threading Concepts**:
   - Writing asynchronous code for efficient data processing.
   - Managing threads and ensuring thread safety.

2. **Data Structures**:
   - Using `Map` to efficiently count and store data.

3. **Performance Optimization**:
   - Transitioning from slow synchronous processing to fast asynchronous operations.

4. **Code Integration**:
   - Extending functionality without altering provided base code.

---

## Setup Instructions
1. Clone the starter code from the GitHub repository:
   [Assignment8 Starter Code](https://github.com/CodersCampus/Assignment8starter)
   
2. Ensure the `output.txt` file is present in the project directory for data processing.

3. Compile and run your solution using your preferred Java IDE or terminal.

---

## Sample Output
### Use Case 1: Data Fetch and Counting
**Console Output**:
```
Fetching data asynchronously...
Number occurrences:
1=3, 2=1, 3=1, 4=1, 5=2, 6=1, 7=0, 8=0, 9=2, 10=2
```

### Use Case 2: Performance Improvement
The asynchronous implementation should demonstrate a significant reduction in data-fetching time compared to the synchronous example.

---

## Advanced Challenge
- Use `CompletableFuture` to chain asynchronous tasks, such as fetching data and processing it.
- Experiment with different thread pool sizes and measure the impact on performance.

---

Happy Coding! 🚀
 
