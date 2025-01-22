<!-- About Array being continous or not -->

In other languqages the blocks of memory is stored continously
But in JAVA it is not continous(Because there is not concept of pointers)
It depends on JVM whether it is going to be continous or not
1. Array objects are in heap
2. Heap objects are not continous
3. DMA (dynamic memory allocation)
Hence, Array objects in java may not be continous -> depends on JVM