
## Binary Search Tree (BST)

A Binary Search Tree (BST) is a type of binary tree where each node has at most two children referred to as the left child and the right child. The key property of a BST is that for any given node, the value of all the nodes in the left subtree is less than the value of the node, and the value of all the nodes in the right subtree is greater than the value of the node.

### Key Operations

1. **Insertion**: Adding a new node to the BST while maintaining its properties.
2. **Deletion**: Removing a node from the BST and ensuring the tree remains a BST.
3. **Search**: Finding a node with a specific value in the BST.
4. **Traversal**: Visiting all the nodes in the BST in a specific order (e.g., in-order, pre-order, post-order).

### Advantages

- **Efficient Searching**: Average time complexity for search operations is O(log n).
- **Dynamic**: Can grow and shrink dynamically with insertions and deletions.

### Use Cases

- **Databases**: Used in database indexing to allow quick retrieval of records.
- **File Systems**: Used in file systems to manage files and directories efficiently.
- **Network Routing**: Helps in routing algorithms to find the shortest path.

### Example

Here is a simple example of a BST:

```
    8
     / \
    3   10
   / \    \
  1   6    14
     / \   /
    4   7 13
```

In this example, for each node, the left subtree contains values less than the node's value, and the right subtree contains values greater than the node's value.

### Conclusion

Binary Search Trees are a fundamental data structure that provide efficient means of storing and retrieving data. Understanding BSTs is crucial for solving many computational problems efficiently.