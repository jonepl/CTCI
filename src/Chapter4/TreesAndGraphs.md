# Trees and Graphs

* Vocabulary:
	* Node
	* Edge
	* Adjacency 

## Graphs

* Graph - collection of nodes with edges between them.
    
    * Properties:
		* Edges can be directed or undirected
		* Can be a connected graph or can be a collection of isolated sub graphs
		* Graph can have cyclic
	
	* Application:
	
	* Vocabulary:
	
	* Traversal:
		* Breadth First Search: The algorithm starts at the root node and explores the highest-depth nodes first before being forced to backtrack and expand shallower nodes.
		* Depth First Search:  The algorithm starts at the root node (selecting some arbitrary node as the root node in the case of a graph) and explores as far as possible along each branch before backtracking.

## Tree
* Tree - is a recursive data structure Directed Acyclic Graphs with the restriction that a child can only have one parent.
    * Properties:
	    * Can have unlimited children
	    * Tree with N nodes have N - 1 edges
	    * Valid tree - Each Node has only 1 incoming edge, NO CYCLES
	    * Root Node is zero
    * Application: 
        * Storing Naturally Hierarchical Data
        * Organizing data for quick search, insertion and deletion
        * Trie used for dictionary
        * Network routing algorithms
        * Manipulate sorted lists of data
        * Router Algorithms
        * Multi-stage decision making
    * Vocabulary
        * root: 
        * Parent: a node that possesses child(ren)
        * Child: a node that is a descendant of it's parent
        * Sibling: nodes that have the same parent node
        * Leaf: an node with no children
        * Internal Node - a node who has a parent and children
        * Ancestor - a node that is connected to lower nodes is an ancestor of lower nodes
        * Decedent - Node d is a descendant of node a if a is an ancestor of d
        * Cousin - nodes that shares the same grand parent are called cousins 
        * Height - number of edges in longest path from node x to leaf
        * Depth - length of the path from root to node x

	* Types of Tree
		* Binary Tree: 
			* Properties (Same rules for tree except):
                * Has at most 2 children
                
		* Binary Search Tree: 
			* Properties (Same rules for Binary Tree except): Left children are less than or equal parent and right or greater than or equal.
			
		* AVL Tree or height Balanced -
			* Properties:
			
		* Red-Black Tree:
			* Properties:
			
		* Splay Tree:
		    * Properties:
