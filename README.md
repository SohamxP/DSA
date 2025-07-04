# DSA
This repository serves as my personal collection of code and notes related to Data Structures and Algorithms (DSA). It includes solutions, implementations, and examples that I’ve written while learning and practicing DSA concepts. The purpose of this repo is to help me revise and refer back to important topics whenever needed.
HashMap is ideal for fast lookups. Eg. retreiving student data by their id
## Stacks
_Last in, first out (LIFO)_
```
import java.util.Stack;
```
```
Stack<Integer> stack = new Stack<>();
Stack<String> stringStack = new Stack<>();
Stack<Double> doubleStack = new Stack<>();
```
```
To check if stack is full

```
```
To check if stack is empty
```
```
Functions:
1. .push(value); //Add a value to stack
2. .pop(); //Delete the last added value
3. .peek(); //Peeks at the topmost element
```
## Queues
_First in First Out (FIFO)_

## LinkedHashMap
Maintains the insertion order (can be used in our university class registration sysstem)
```
Functions:
  1. .put(key, value) [Adds the pair to the Map]
  2. .get(key) [retrieves value]
  3. .remove(key) [Removes the pair from the Map]
```
```
Special Functions: 
  1. .firstEntry() [Retrieves the key of the first pair]
  2. .lastEntry() [Retrieves the key of the last pair]
  3. .putFirst(key, value) [Adds the pair to the start of the Map]
  4. .putLast(key, value) [Adds the pair to the last of the Map]
  5. .containsKey(key) [returns boolean]
  6. .entrySet()
  7. .putIfAbsent(key, value) [Adds the pair if not present earlier]
```
## TreeMap: 
Maintains the natural order
HashMap is faster than a TreeMap as TreeMaps have linked entries
Automatically sorts key-value pairs
Logarithmic Time Complexity --- O(log n)
```
TreeMap<String,String> treeMap =new TreeMap<>();
```
```
Functions:
1. .put(key, value); 
2. .remove(key, value);
3. .get(key); //gives null if not present
4. .firstKey(); 
5. .lastKey();
6. .higherKey(key); //Returns the next higher key 
7. .lowerKey(key); //Returns the next lower key
The higherKey and lowerKey do not necessarily require a key present in the TreeMap
```

## Linear Search
The compiler walks through the dataset through iterating over a loop and checks if any value matches our target value.  
Time Complexity: O(n) [n is the number of elements]  
Drawbacks: Inefficient with large lists, Not suitable for sorted data

## Binary Search
Time Complexity : O(log n) [Order of log n]
```
int left = 0;
int right = array.length - 1;

while (left <= right)
{
  int mid = left + (right - left) / 2;
  if (array[mid] == target)
    return mid; // Target found, return index
  if (array[mid] > target)
    right = mid - 1;
  else
    left = mid + 1;
}

```
## Bubble Sort
## Insertion Sort
## Selection Sort 
Finds a value in the dataset smaller than the first value and swaps. Next, it finds the smaller value than the second value and swaps.
## Time Complexity 
Bubble Sort: Best Case - O(n)
             Worst Case and Average Case - O(n²)
Insertion Sort: Best Case - O(n)
                Worst Case and Average Case - O(n²)
Selection Sort: All Cases - O(n²)
