### Bonus Questions: "An assortment of sorting techniques, part deux"

#### Can we use heaps as priority queues? How so? Write an explanation, with the help of pseudocode/diagrams to support your explanation.
We CAN use heaps as priority queues, such as max or min heaps. I will use the max heap as an example, by definition, max heap is a binary tree where the value of each node is less than or equal to the value of its parent, with the maximum-value element at the root. The max heap is often used as a priority queue because it allows for both insertion and removal of the highest  priority element in logarithmic time.

```
MaxHeapPriorityQueue:
    heap = []

    Function insert(data):
        # Insert data at the end of the heap
        heap.append(data)
        # Heapify from the last index to restore max heap property
        heapify(len(heap) - 1)

    Function extractMax():
        if len(heap) == 0:
            return None
        # Replace the root of the heap with the last element
        max_value = heap[0]
        heap[0] = heap.pop()
        # Heapify from the root to restore max heap property
        heapify(0)
        return max_value

    Function getMax():
        if len(heap) > 0:
            return heap[0]
        return None
```

#### Given a max heap, is there a way to use the max heap as a min heap, without writing a whole min heap implementation? Is the opposite also true? Justify your answer with pseudocode, and/or python OR java code, and explain your answer.  

yes we can do this, by negating the values of the max heap we can use it as a min heap. say we have {10,5,20}, the max would be 20
if we negate the values {-10,-5,-20}, the min would be -20
the opposite would also be true, if we had {-10,-5,-20} and negated it, then we would have {10,5,20}
```
function insert_min_heap(max_heap, value):
    insert_into_max_heap(max_heap, -value)

function extract_min_from_max_heap(max_heap):
    return -extract_max_from_max_heap(max_heap)

other way for opposite implementation...
```
