# DataStructureJava
## Description

 Data Structure in Java: Stack, Queue, PriorityQueue, List, LinkedList.

## Code Snippets

1. Basic struture for all data structures
```java
public class StaticStructure<T> {

    protected T[] elements;
    protected int size;
    
    ...

//Adding element at certain position
    protected boolean add(int position, T element) throws Exception {
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Invalid position");
        }

        this.increaseCapacity();

        //move all elements
        for (int i = this.size - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[position] = element;
        this.size++;

        return true;

    }

  ...

// Increase the capacity
    protected void increaseCapacity() {
        if (this.size == this.elements.length) {
            T[] elementsNew = (T[]) new Object[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                elementsNew[i] = this.elements[i];
            }
            this.elements = elementsNew;
        }

    }
 ...

```

   2. Stack: getting the peek
```java
  ...
    protected T peek() {

        if (this.isEmpty()) {
            return null;
        }

        return this.elements[this.size - 1];

    }
 ...

```
3. Queue: dequeue...
```java
...
    public T dequeue(){
        
        if(this.isEmpty()){
            return null;
        }
        
        T element = this.elements[0];
        this.remove(0);
        return element;
    }
...   
```

## Install and Run

### 1. Requiriments

- [Eclipse](https://www.eclipse.org/downloads/)(or any Java IDE/Code Editor)
- [JDK](https://www.oracle.com/br/java/technologies/javase/) 

