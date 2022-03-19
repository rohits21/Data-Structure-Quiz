package com.example.datastructurequiz

object Constants {

    const val topicSelected: String = "arrays"
    var name: String = "Rohit Sahu"
    var correctAnswer: Int = 0

    fun getArrayQuiz(): ArrayList<questions> {
        val arrayQuiz = ArrayList<questions>()

        val que1 = questions(
            1,
            "How can we describe an array in the best possible way?",
            "The Array shows a hierarchical structure.",
            "Arrays are immutable.",
            "Container that stores the elements of similar types",
            "The Array is not a data structure",
            3,
            "The answer is c because array stores the elements in a contiguous block of memory of similar types." +
                    " Therefore, we can say that array is a container that stores the elements of similar types."
        )

        arrayQuiz.add(que1)

        val que2 = questions(
            2,
            "Which of the following is the correct way of declaring an array?",
            "int javatpoint[10];",
            "int javatpoint;",
            "javatpoint{20};",
            "array javatpoint[10];",
            1,
            "The answer is a because int specifies the type of the array, javatpoint is the name of the array," +
                    " and 10 is the size of the array enclosed within the square brackets."
        )

        arrayQuiz.add(que2)

        val que3 = questions(
            3,
            "Which of the following is the advantage of the array data structure?",
            "Elements of mixed data types can be stored.",
            "Easier to access the elements in an array",
            "Index of the first element starts from 1.",
            "Elements of an array cannot be sorted",
            2,
            "The answer is b because the elements in an array are stored in a contiguous block of memory, " +
                    "so it is easier to access the elements of an array through indexing."
        )

        arrayQuiz.add(que3)

        val que4 = questions(
            4,
            "Which of the following highly uses the concept of an array?",
            "Binary Search tree",
            "Caching",
            "Spatial locality",
            "Scheduling of Processes",
            3,
            "The answer is c, i.e., Spatial locality. Here, spatial locality means that the instruction accessed recently, then the nearby memory location would be accessed in the next iteration. As we know that in an array," +
                    " all the elements are stored in a contiguous block of memory, so spatial locality is accessed quickly."
        )
        arrayQuiz.add(que4)

        val que5 = questions(
            5,
            "How can we initialize an array in C language?",
            "int arr[2]=(10, 20)",
            "int arr(2)={10, 20}",
            "int arr[2] = {10, 20}",
            "int arr(2) = (10, 20)",
            3,
            "The answer is c because the values assigned to the array " +
                    "must be enclosed within a curly bracket."
        )

        arrayQuiz.add(que5)

        return arrayQuiz
    }

    fun getStringQuiz(): ArrayList<questions> {
        val stringQuiz = ArrayList<questions>()

        val que1 = questions(
            1,
            "Which among the following is Copying function?",
            "memcpy()",
            "strcopy()",
            "memcopy()",
            "strxcpy()",
            1,
            "The memcpy() function is used to copy n characters from the object.\n" +
                    "The code is void *memcpy(void *s1,const void *s2, size_t n)."
        )
        stringQuiz.add(que1)

        val que2 = questions(
            2,
            "The ______ function appends not more than n characters.",
            "strcat()",
            "strcon()",
            "strncat()",
            "memcat()",
            3,
            "The strncat() function appends not more than n characters from the array(s2) to the end of the string(s1).char *strncat(char *s1, const char *s2,size_t n);"
        )
        stringQuiz.add(que2)

        val que3 = questions(
            3,
            "What will strcmp() function do?",
            "compares the first n characters of the object",
            "compares the string",
            "undefined function",
            "copies the string",
            2,
            "The strcmp() function compares the string s1 to the string s2.\n" +
                    "int strcmp(const char *s1,const char *s2);"
        )
        stringQuiz.add(que3)

        val que4 = questions(
            4,
            "What is the prototype of strcoll() function?",
            "int strcoll(const char *s1,const char *s2)",
            " int strcoll(const char *s1)",
            "int strcoll(const *s1,const *s2)",
            "int strcoll(const *s1)",
            1,
            "The prototype of strcoll() function is int strcoll(const char *s1,const char *s2)."
        )
        stringQuiz.add(que4)

        val que5 = questions(
            5,
            "Which of the following is the variable type defined in header string. h?",
            "sizet",
            "size",
            "size_t",
            "size-t",
            3,
            "This is the unsigned integral type and is the result of the sizeof keyword."
        )

        stringQuiz.add(que5)
        return stringQuiz
    }

    fun getLinkedListQuiz(): ArrayList<questions> {
        val linkedListQuiz = ArrayList<questions>()

        val que1 = questions(
            1,
            "A linear collection of data elements where the linear node is given by means of pointer is called?",
            "Linked list",
            "Node list",
            "Primitive list",
            " Unordered list",
            1,
            "In Linked list each node has its own data and the address of next node. These nodes are linked by using pointers. " +
                    "Node list is an object that consists of a list of all nodes in a document with in a particular selected set of nodes."
        )

        linkedListQuiz.add(que1)

        val que2 = questions(
            2,
            "In linked list each node contains a minimum of two fields. One field is data field to store the data second field is?",
            "Pointer to character",
            "Pointer to integer",
            "Pointer to node",
            "Node",
            3,
            "Each node in a linked list contains data and a pointer (reference) to the next node. " +
                    "Second field contains pointer to node."

        )
        linkedListQuiz.add(que2)

        val que3 = questions(
            3,
            "What would be the asymptotic time complexity to add a node at the end of singly linked list, if the pointer is initially pointing to the head of the list?",
            "O(1)",
            "O(n)",
            "θ(n)",
            "θ(1)",
            3,
            "In case of a linked list having n elements, we need to travel through every node of the list " +
                    "to add the element at the end of the list. Thus asymptotic time complexity is θ(n)."

        )

        linkedListQuiz.add(que3)

        val que4 = questions(
            4,
            "What would be the asymptotic time complexity to find an element in the linked list?",
            "O(1)",
            "O(n)",
            "O(n2)",
            "O(n4)",
            2,
            " If the required element is in the last position, we need to traverse the entire linked list. This will take O (n) time to search the element."

        )
        linkedListQuiz.add(que4)

        val que5 = questions(
            5,
            "The concatenation of two lists can be performed in O(1) time. Which of the following variation of the linked list can be used?",
            "Singly linked list",
            "Doubly linked list",
            "Circular doubly linked list",
            "Array implementation of list",
            3,
            "We can easily concatenate two lists in O (1) time using singly or doubly linked list, provided that we have a pointer to the last node at least one of the lists. " +
                    "But in case of circular doubly linked lists, we will break the link in both the lists and hook them together." +
                    " Thus circular doubly linked list concatenates two lists in O (1) time."
        )

        linkedListQuiz.add(que5)
        return linkedListQuiz
    }

    fun getStackQuiz(): ArrayList<questions> {
        val stackQuiz = ArrayList<questions>()

        val que1 = questions(
            1,
            "Process of inserting an element in stack is called ____________",
            "Create",
            "Push",
            "Evaluation",
            "Pop",
            2,
            "Push operation allows users to insert elements in the stack. If the stack is filled completely and trying to perform push operation stack – overflow can happen."
        )

        stackQuiz.add(que1)
        val que2 = questions(
            2,
            "In a stack, if a user tries to remove an element from an empty stack it is called _________",
            "Underflow",
            "Empty collection",
            "Overflow",
            "Garbage Collection",
            1,
            " Underflow occurs when the user performs a pop operation on an empty stack. Overflow occurs when the stack is full and the user performs a push operation. " +
                    "Garbage Collection is used to recover the memory occupied by objects that are no longer used."
        )
        stackQuiz.add(que2)

        val que3 = questions(
            3,
            "Pushing an element into stack already having five elements and stack size of 5, then stack becomes ___________",
            "Overflow",
            "Crash",
            "Underflow",
            "User flow",
            1,
            "The stack is filled with 5 elements and pushing one more element causes a stack overflow. " +
                    "This results in overwriting memory, code and loss of unsaved work on the computer."
        )

        stackQuiz.add(que3)

        val que4 = questions(
            4,
            "Entries in a stack are “ordered”. What is the meaning of this statement?",
            "A collection of stacks is sortable",
            "Stack entries may be compared with the ‘<‘ operation",
            "The entries are stored in a linked list",
            "There is a Sequential entry that is one by one",
            4,
            " In stack data structure, elements are added one by one using push operation. Stack follows LIFO Principle i.e. Last In First Out(LIFO)."
        )

        stackQuiz.add(que4)

        val que5 = questions(
            5,
            "Which of the following is not the application of stack?",
            "A parentheses balancing program",
            "Tracking of local variables at run time",
            "Compiler Syntax Analyzer",
            "Data Transfer between two asynchronous process",
            4,
            " Data transfer between the two asynchronous process uses the queue data structure for synchronisation. The rest are all stack applications."
        )

        stackQuiz.add(que5)
        return stackQuiz
    }

    fun getQueueQuiz(): ArrayList<questions> {
        val queueQuiz = ArrayList<questions>()

        val que1 = questions(
            1,
            "A linear list of elements in which deletion can be done from one end (front) and insertion can take place only at the other end (rear) is known as _____________",
            "Queue",
            "Stack",
            "Tree",
            "Linked list",
            1,
            "Linear list of elements in which deletion is done at front side and insertion at " +
                    "rear side is called Queue. In stack we will delete the last entered element first."

        )
        queueQuiz.add(que1)

        val que2 = questions(
            2,
            "The data structure required for Breadth First Traversal on a graph is?",
            "Stack",
            "Array",
            "Queue",
            "Tree",
            3,
            "In Breadth First Search Traversal, BFS, starting vertex is first taken and adjacent vertices which are unvisited are also taken. " +
                    "Again, the first vertex which was added as an unvisited adjacent vertex list will be considered to add further unvisited vertices of the graph. " +
                    "To get the first unvisited vertex we need to follows First In First Out principle. Queue uses FIFO principle."

        )
        queueQuiz.add(que2)

        val que3 = questions(
            3,
            "Circular Queue is also known as ________",
            "Ring Buffer",
            "Square Buffer",
            "Rectangle Buffer",
            "Curve Buffer",
            1,
            "Circular Queue is also called as Ring Buffer. " +
                    "Circular Queue is a linear data structure in which last position is connected back to the first position to make a circle. It forms a ring structure."

        )
        queueQuiz.add(que3)

        val que4 = questions(
            3,
            "A data structure in which elements can be inserted or deleted at/from both ends but not in the middle is?",
            "Queue",
            "Circular queue",
            "Dequeue",
            "Priority queue",
            3,
            " In dequeuer, we can insert or delete elements from both the ends. In queue, we will follow first in first out principle for insertion and deletion of elements. " +
                    "Element with least priority will be deleted in a priority queue."

        )
        queueQuiz.add(que4)

        val que5 = questions(
            5,

            "Queues serve major role in ______________",
            " Simulation of recursion",
            "Simulation of arbitrary linked list",
            "Simulation of limited resource allocation",
            "Simulation of heap sort",
            3,
            "Simulation of recursion uses stack data structure. Simulation of arbitrary linked lists uses linked lists. Simulation of resource " +
                    "allocation uses queue as first entered data needs to be given first priority during resource allocation. Simulation of heap sort uses heap data structure."
        )
        queueQuiz.add(que5)
        return queueQuiz
    }

    fun getTreeQuiz(): ArrayList<questions> {
        val treeQuiz = ArrayList<questions>()

        val que1 = questions(
            1,
            "How many child nodes does each node of Ternary Tree contain?",
            "4",
            "6",
            "5",
            "3",
            4,
            "Each node of Ternary tree contains at most 3 nodes. So Ternary tree can have 1, 2 or 3 child nodes but not more than that."

        )
        treeQuiz.add(que1)

        val que2 = questions(
            2,
            "Which of the following is the name of the node having child nodes?",
            "Brother",
            "Sister",
            "Mother",
            "Parent",
            4,
            "Parent node is the node having child nodes and child nodes may contain references to their parents." +
                    " Parent node is a node connected by a directed edge to its child."

        )
        treeQuiz.add(que2)

        val que3 = questions(
            3,
            "What is the depth of the root node of the ternary tree?",
            "2",
            "1",
            "0",
            "3",
            3,
            "Depth is defined as the length of the path from root to the node. So the depth of root node in ternary tree is 0."
        )
        treeQuiz.add(que3)

        val que4 = questions(

            4,
            " What is the Height of the root node of ternary tree?",
            "1",
            "2",
            "3",
            "0",
            4,
            "Height of ternary tree is defined as the length of path from root to deepest node in tree. Therefore, height off root node in ternary tree is 0."
        )

        treeQuiz.add(que4)

        val que5 = questions(
            5,
            "Disadvantages of linked list representation of binary trees over arrays?",
            "Randomly accessing is not possible",
            "Extra memory for a pointer is needed with every element in the list",
            "Difficulty in deletion",
            "Random access is not possible and extra memory with every element",
            4,
            "Random access is not possible with linked lists."
        )

        treeQuiz.add(que5)
        return treeQuiz
    }

    fun getGraphQuiz(): ArrayList<questions> {
        val graphQuiz = ArrayList<questions>()

        val que1 = questions(
            1,

            "Which of the following statements for a simple graph is correct?",
            "Every path is a trail",
            "Every trail is a path",
            "Every trail is a path as well as every path is a trail",
            "Path and trail have no relation",
            1,
            "In a walk if the vertices are distinct it is called a path, whereas if the edges are distinct it is called a trail."
        )
        graphQuiz.add(que1)

        val que2 = questions(
            2,
            "What is the number of edges present in a complete graph having n vertices?",
            "(n*(n+1))/2",
            "(n*(n-1))/2",
            "n",
            "Information given is insufficient",
            2,
            " Number of ways in which every vertex can be connected to each other is nC2."

        )
        graphQuiz.add(que2)

        val que3 = questions(
            3,
            "A connected planar graph having 6 vertices, 7 edges contains _____________ regions.",
            "15",
            "3",
            "1",
            "11",
            2,
            " By euler’s formula the relation between vertices(n), edges(q) and regions(r) is given by n-q+r=2."

        )

        graphQuiz.add(que3)

        val que4 = questions(
            4,
            "If a simple graph G, contains n vertices and m edges, the number of edges in the Graph G'(Complement of G) is ___________",
            "(n*n-n-2*m)/2",
            "(n*n+n+2*m)/2",
            "(n*n-n-2*m)/2",
            "(n*n-n+2*m)/2",
            1,
            "The union of G and G’ would be a complete graph so, the number of edges in G’= number of edges in the complete form of G(nC2)-edges in G(m)."

        )
        graphQuiz.add(que4)

        val que5 = questions(
            5,
            "Which of the following properties does a simple graph not hold?",
            "Must be connected",
            "Must be unweighted",
            "Must have no loops or multiple edges",
            "Must have no multiple edges",
            1,
            "A simple graph maybe connected or disconnected."
        )
        graphQuiz.add(que5)

        return graphQuiz
    }
}