https://guides.github.com/features/mastering-markdown/
# HackerRank
## DataStructure
> ### Arrays
* Arrays_DS
  * 입력받은 값을 배열에 저장해 역순으로 출력하기.
  * 배열의 N-1부터 0번째 인덱스 까지 출력함으로 시간복잡도 **O(N)**.
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Arrays/src/Arrays_DS.java
* 2DArrays_DS
  * (6,6) 크기의 2차원 배열에서 순차 방문하여 모래시계 형태의 합이 가장 큰 값을 찾아 출력하기.
  * i,j를 0부터 4까지 이중 for문을 돌린다.
  * 큰 값을 저장하기 위한 변수의 초기화를 가장 작은 값으로 초기화 시키기 위해 값의 범위 제약 중 -9부터 시작하기 때문에 -9*7 = -63으로 초기화한다.
  * 이중 for문이라 시간복잡도 **O(N^2)**.
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Arrays/src/Arrays2D_DS.java
* Dynamic_Array
  *  리스트를 N개 생성하여, 2가지 타입의 쿼리형태에 따라 리스트를 동적으로 변화시켜 쿼리문에 따라 요구하는 LastAnswer값을 출력함.
  *  Type 1 x y
    *  ```
       seq = ((x xor lastAnswer) % N ) 
       list[seq].add(y)
       ```
  *  Type 2 x y
    *  ```
       seq = ((x xor lastAnswer) % N)
       lastAnswer = list[seq].get(y%list[seq].size())
       print lastAnswer
       ```  
  *  N개의 리스트를 생성하고 Q개의 쿼리만큼 시행하기 때문에 시간복자바도 **O(N)**
  *  Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Arrays/src/Dynamic_Array.java
> ### Linked Lists
*  Print the Elements of a Linked List
```{.java}
void Print(Node head) {
   if(head != null){
      System.out.println(head.data);
      Print(head.next);
   }
}
```
  
*  Insert a Node at the Tail of a Linked List
```{.java}
  Node Insert(Node head,int data) {
    Node tmp = new Node();
    tmp.data = data;
    if(head == null) {
      head = tmp;
      return head;
    } 

    Node current = head;
    while(current.next != null) {
        current = current.next;
    }
    
    current.next = tmp;
    return head;
}
```
*  Insert a node at the head of a linked list
```{.java}
    Node Insert(Node head,int x) {
    Node node = new Node();
    node.data = x;
    if(head == null){
        head = node;
        return head;
    }
    node.next = head;
    return node;
}
```
> ### Tree
*  Print Tree:Preorder Traversal
```{.java}
void preOrder(Node root) {
    System.out.printf("%d ", root.data);
    if(root.left != null)
        preOrder(root.left);
    if(root.right!=null)
        preOrder(root.right);
}
```
*  Print Tree:Postorder Traversal
```{.java}
void postOrder(Node root) {
    if(root.left != null)
        postOrder(root.left);
    if(root.right != null)
        postOrder(root.right);
    System.out.printf("%d ",root.data);
}
```
*  Print Tree:Inorder Traversal
```{.java}
void inOrder(Node root) {
    if(root.left != null)
        inOrder(root.left);
    System.out.printf("%d ",root.data);
    if(root.right != null)
        inOrder(root.right);
}
```
> ### Stack
* Maximum Element
  * You have an empty sequence, and you will be given  queries. Each query is one of these three types:
    ```
    1 x  -Push the element x into the stack.
    2    -Delete the element present at the top of the stack.
    3    -Print the maximum element in the stack.
    ```
  * Max값을 찾을때 timeOut발생 -> Max값이 있는 index를 따로 저장해둔다 -> Max값이 Pop되는 최악의 경우가 발생할 수 있다.
  * 시간복잡도 : (add일 경우) log(1) + (pop일 경우 최선의 경우) log(1) + (pop일 경우 최악의 경우) log(n) = log(n) 
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Stacks/src/MaximumElement.java

* Balanced Brackets
  * A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
  * 각 기호의 열고 닫고의 매칭이 일치하는지에 대한 여부를 "YES", "NO"로 판명하는 알고리즘 작성.
  * 예외처리 중요!! (Stack이 남아있으면 매칭이 안된거 이므로 Stack의 사이즈를 마지막에 꼭 확인!)
  * 시간복잡도 : log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Stacks/src/BalancedBrackets.java
* Equal Stacks
  * 3개의 Stack이 주어지는데, 각 스택별로 입력되는 값들이 다르다.
  * Stack의 총 합이 같아질때까지 pop을 해가면서 진행하는 알고리즘을 작성.
  * while문의 사용이 헷갈렸으니 유의.
  * 시간복잡도 : (스택 3개의 값 입력) log(n) + (같을때 까지 비교하기 위한 while문) log(n) = log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Stacks/src/EqualStacks.java
> ### Queue
* Queue Using Two Stacks
  * FIFO방식으로 3가지의 쿼리문으로 실행시키는 알고리즘
   ```
   1 x: Enqueue element  into the end of the queue.
   2: Dequeue the element at the front of the queue.
   3: Print the element at the front of the queue.
   ```
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Queues/src/QueueUsingTwoStacks.java
* Castle On The Grid
  * 'X'는 지니갈 수 없는 성, '.'은 지나갈 수 있는 성으로 2차원 배열에서 시작점에서 목표점까지 최소 몇번의 과정으로 갈 수 있는지를 구하는 알고리즘
  * 재귀함수로 돌려서 구하려고 했지만 실패...
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Queues/src/CastleOnTheGrid.java
