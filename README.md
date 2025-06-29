# DSA
This repository serves as my personal collection of code and notes related to Data Structures and Algorithms (DSA). It includes solutions, implementations, and examples that I’ve written while learning and practicing DSA concepts. The purpose of this private repo is to help me revise and refer back to important topics whenever needed.
HashMap is ideal for fast lookups. Eg. retreiving student data by their id
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
## TreeMap: Maintains the natural order 
