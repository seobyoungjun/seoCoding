https://guides.github.com/features/mastering-markdown/
# HackerRank
## DataStructure
> ### Arrays
* **Arrays_DS(Easy 93.80%)**
  * 입력받은 값을 배열에 저장해 역순으로 출력하기.
  * 배열의 N-1부터 0번째 인덱스 까지 출력함으로 시간복잡도 **O(N)**.
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Arrays/src/Arrays_DS.java
* **2DArrays_DS(Easy 89.77%)**
  * (6,6) 크기의 2차원 배열에서 순차 방문하여 모래시계 형태의 합이 가장 큰 값을 찾아 출력하기.
  * i,j를 0부터 4까지 이중 for문을 돌린다.
  * 큰 값을 저장하기 위한 변수의 초기화를 가장 작은 값으로 초기화 시키기 위해 값의 범위 제약 중 -9부터 시작하기 때문에 -9*7 = -63으로 초기화한다.
  * 이중 for문이라 시간복잡도 **O(N^2)**.
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Arrays/src/Arrays2D_DS.java
* **Dynamic_Array(Easy 82.98%)**
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
---
> ### Linked Lists
* **Print the Elements of a Linked List**
```{.java}
void Print(Node head) {
   if(head != null){
      System.out.println(head.data);
      Print(head.next);
   }
}
```
  
* **Insert a Node at the Tail of a Linked List**
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
* **Insert a node at the head of a linked list**
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
---
> ### Tree
* **Print Tree:Preorder Traversal**
```{.java}
void preOrder(Node root) {
    System.out.printf("%d ", root.data);
    if(root.left != null)
        preOrder(root.left);
    if(root.right!=null)
        preOrder(root.right);
}
```
* **Print Tree:Postorder Traversal**
```{.java}
void postOrder(Node root) {
    if(root.left != null)
        postOrder(root.left);
    if(root.right != null)
        postOrder(root.right);
    System.out.printf("%d ",root.data);
}
```
* **Print Tree:Inorder Traversal**
```{.java}
void inOrder(Node root) {
    if(root.left != null)
        inOrder(root.left);
    System.out.printf("%d ",root.data);
    if(root.right != null)
        inOrder(root.right);
}
```
---
> ### Stack
* **Maximum Element(Easy 68.24%)**
  * You have an empty sequence, and you will be given  queries. Each query is one of these three types:
    ```
    1 x  -Push the element x into the stack.
    2    -Delete the element present at the top of the stack.
    3    -Print the maximum element in the stack.
    ```
  * Max값을 찾을때 timeOut발생 -> Max값이 있는 index를 따로 저장해둔다 -> Max값이 Pop되는 최악의 경우가 발생할 수 있다.
  * 시간복잡도 : (add일 경우) log(1) + (pop일 경우 최선의 경우) log(1) + (pop일 경우 최악의 경우) log(n) = log(n) 
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Stacks/src/MaximumElement.java

* **Balanced Brackets(Medium 81.71%)**
  * A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
  * 각 기호의 열고 닫고의 매칭이 일치하는지에 대한 여부를 "YES", "NO"로 판명하는 알고리즘 작성.
  * 예외처리 중요!! (Stack이 남아있으면 매칭이 안된거 이므로 Stack의 사이즈를 마지막에 꼭 확인!)
  * 시간복잡도 : log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Stacks/src/BalancedBrackets.java
* **Equal Stacks(Easy 78.31%)**
  * 3개의 Stack이 주어지는데, 각 스택별로 입력되는 값들이 다르다.
  * Stack의 총 합이 같아질때까지 pop을 해가면서 진행하는 알고리즘을 작성.
  * while문의 사용이 헷갈렸으니 유의.
  * 시간복잡도 : (스택 3개의 값 입력) log(n) + (같을때 까지 비교하기 위한 while문) log(n) = log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Stacks/src/EqualStacks.java
---
> ### Queue
* **Queue Using Two Stacks(Medium 88.29%)**
  * FIFO방식으로 3가지의 쿼리문으로 실행시키는 알고리즘
   ```
   1 x: Enqueue element  into the end of the queue.
   2: Dequeue the element at the front of the queue.
   3: Print the element at the front of the queue.
   ```
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Queues/src/QueueUsingTwoStacks.java
* **Castle On The Grid(Medium 68.66%)** **(미해결)**
  * 'X'는 지니갈 수 없는 성, '.'은 지나갈 수 있는 성으로 2차원 배열에서 시작점에서 목표점까지 최소 몇번의 과정으로 갈 수 있는지를 구하는 알고리즘
  * 재귀함수로 돌려서 구하려고 했지만 실패...
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Queues/src/CastleOnTheGrid.java
---
> ### Heap
* **QHEAP1(Easy 67.30%)**
  ```
  1. "1 v" - v를 heap에 add
  2. "2 v" - v를 heap에서 delete
  3. "3"   - heap안의 최소값을 출력
  ```
  * 범했던 오류 : 삭제 시 삭제할 값과 최소값이 일치했을 때만 삭제하고 최소값을 찾는 알고리즘으로 구현하여, 최소값과 삭제하려는 값이 일치하지 않으면 삭제를 안해줬다.
  * 시간복잡도 : (삭제 연산)log(n) + (최소값 삭제할 시)log(n) = log(n)
* Jesse and Cookies(Easy 68.94%)
  ```
  Sweatness = (1 * 1st cookie) + (2 * 2nd cookie)
  ```
  * N개의 쿠키들의 첫번째와 두번째의 쿠키들을 식을 이용한다음 나온 쿠키를 적절한 위치에 놓은다음 모든 쿠키들이 당도 K보다 모두 클때까지 연산의 수를 구하는 알고리즘
  * 범했던 오류 : 배열을 사용했을 시에 쿠키1과 쿠키2의 식을 이용해 값을 쿠키2에 넣어주고 오름차순 정렬을 한다음 다시 쿠키2와 쿠키3을 식을 이용해 쿠키3에 넣어주고 오름차순 하고... -> 시간 딜레이 및 알고리즘 오류
  * Priority Queue를 사용하여 해결 (Priority Queue는 Queue에 값 삽입시 제일 작은 값들을 poll할 수 있게 정렬해줌.)
  * 시간복잡도 : (enqueue경우)log(n) + (dequeue경우)log(1) = log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Heap/src/JesseAandCookies.java
---
> ### Trie
* **Contacts(Medium 67.24%)**
  ```
   add name, where  is a string denoting a contact name. This must store  as a new contact in the application.
   find partial, where  is a string denoting a partial name to search the application for. 
   It must count the number of contacts starting with  and print the count on a new line.
  ```
  * 시간 오류 발생..(ArrayList로 String.contains(find)로 list전부 찾아서 일치하면 count값 증가)
  * HashMap을 사용하면 ArrayList보다 접근 시간이 훨씬 빨라진다.
  * HashMap<String, Integer>의 Key에다 등록하는 이름의 모든 경우를 다 저장한다. ex) sbj -> s, sb, sbj
  * 그리고 Integer의 값에다가 1로 초기화해준다.
  * 만약 put하는 도중에 똑같은 Key값이 있는 경우에는 그 key값의 Integer값에 +1을 해준다. ex) sbj -> s(1), sb(1), sbj(1) sb -> s(2), sb(2)
  * 시간복잡도는 (연락처 N개 삽입)log(n) * (연락처의 문자길이만큼 삽입)log(n) = log(n^2)

## Algorithm
> ### String
* **Super Reduced String(Easy 87.32%)**
  * 똑같은 문자 2개씩 쌍을 이루는 것을 삭제하는 알고리즘.
  *  **Sample Input 0**
  ```
  aaabccddd
  ```
  * **Sample Output 0**
  ```
  abd
  ```
  * **Sample Input 1**
  ```
  baab
  ```
  * **Sample Output 1**
  ```
  Empty String
  ```
  * Stack을 사용하여 알고리즘 구현
  * String의 character를 순차검색해가면서 push해주다가 peek을 했을때 같으면 pop을 해주고 다르면 push
  * 마지막에 Stack에 남은 것이 결과값. 만약 Stack에 남은것이 없으면 "Empty String"
  * 시간복잡도 : (push할 경우)log(n) + (pop할 경우)log(n) = log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Strings/src/SuperReducedString.java
* **CamelCase(Easy 97.91%)**
  * 한 문장에 몀ㅊ개의 단어가 들어있는지 개수를 세는 알고리즘.
  * 특징 : 첫번째 단어 이후로 단어의 시작 맨처음은 대문자.
  * **Sample Input 0**
  ```
  saveChangesInTheEditor
  ```
  * **Sample Output 0**
  ```
  5
  ``` 
  * 시간복잡도 : (String의 길이만큼 순회하며 검색)log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Strings/src/CamelCase.java
> ### Implementation
* **Grading Students(Easy 96.94%)**
  * 모든 학생들의 성적을 입력받아 5점 단위로 반올림해주는 알고리즘
  * 등급은 5점단위로 환산하는데 실제 점수랑 비교시 첫째자리 수랑 5단위수랑  비교하여 3보다 작으면 반올림해준다.
  * 38점보다 작으면 반올림은 일어나지 않는다.
  * **Sample Input 0**
  ```
  4
  73
  67
  38
  33
  ```
  * **Sample Output 0**
  ```
  75
  67
  40
  33
  ```
  * 등급의 기준: 5*((score/5)+1)
  * 시간복잡도: (성적을 입력받은 배열을 N번 수행)log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Implementation/src/GradingStudents.java
* **Apple And Orange(Easy 95.35%)**
  * 사과나무 왼쪽 위치(a) 오렌지나무 오른쪽 위치(b) 시작점(s) 끝점(e) 기준점(a,b)으로부터 거리(d)
  * d의값이 마이너스인 것은 나무에서 왼쪽으로 이동. 플러스값인 것은 나무에서 오른쪽으로 이동.
  * [s,t]사이에 얼마나 많은 오렌지(m)와 사과(n)가 떨어져있는지 개수를 세는 알고리즘
  * s, t, a, b, m, n 순으로 입력값을 받음. 
  * m과 n의 개수만큼 사과의 x 위치를 입력받음.
  * **Smaple Input0**
  ```
   7 11
   5 15
   3 2
   -2 2 1
   5 6
   ```
  * **Sample Output0**
  ```
   1
   1
  ```
  * 시간복잡도: (사과와 오렌지 입력받은 개수 N)log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Implementation/src/AppleAndOrange.java
* **Kangaroo(Easy 87.93%)**
  * 두 마리의 캥거루가 x1, x2를 기준으로 v1, v2넓이만큼 점프한다. 같은 시간 같은 장소에 위치하는지에 대한 여부
  * **Sample Input0**
  ```
  0 3 4 2
  ```
  * **Sample Output0**
  ```
  YES
  ```
  * **Sample Input1**
  ```
  0 2 5 3
  ```
  * **Sample Output1**
  ```
  NO
  ```

  * **Sample Input0**
  ```
  0 3 4 2
  ```
  * **Sample Output0**
  ```
  YES
  ```
  * v1,v2 중 높은 비율을 가진 애가 낮은 애를 앞지르면 "NO"를 출력.
  * x1+=v1 , x2+=v2를 해가면서 같을때까지 while문 돌림
  * 시간복잡도: (x1, x2를 N번만큼 더한다)log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Implementation/src/Kangaroo.java
> ### Sorting
* **Big Sorting(Easy 63.73%)**
  * 숫자가 Integer값의 범위를 넘어가는 숫자를 포함한 배열의 정렬을 하는 알고리즘
  * 해결법 :
  ```
   1. Arrays.sort를 이용한다.
   2. Comparator의 인터페이스 선언을 통해 compare함수를 재정의한다.
   3. 기준 a, 비교 b 일때 a가 크면 1반환, b가 크면 -1반환, a==b이면 0반환
   4. Stirng a, String b를 비교할때 a와 b의 String의 길이로 먼저 판별.
   5. String의 길이가 같다면 for문을 돌아 0인덱스부터 (int)charAt(i)를 통해 크면 1, 작으면 -1 반환.
   6. for문을 빠져나온다면 같다는 의미로 return 0을 반환.
  ```
  * 시간복잡도 : (정렬)log(n) * (String비교)log(n) = log(n^2)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Sorting/src/BigSorting.java

* **Insertion Sort - Part1, Part2(Easy 86.71%)(Easy 96.84%) && Correctness and the Loop Invariant(Easy 98.59%) && Running Time of Algorithms(Easy 96.73%)**
  * 삽입정렬 알고리즘 구현하기.
   ![Image of Insertion Algorithm](Insertion-sort-example-300px.gif) 
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Sorting/src/InsertionSort1.java
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Sorting/src/InsertionSort2.java
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Sorting/src/CorrectnessAndTheLoopInvariant.java
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Sorting/src/RunningTimeOfAlgorithms.java
> ### Search
* **Ice Cream Parlor(Easy 91.62%)**
  * n개의 배열을 가지는 n개의 아이스크림이 있다.
  * 가격 m값에 맞춰 지는 2개의 아이스크림의 작은 Index값과 큰 Index값을 출력해라.
  * 해결책 : x -> 1~N-1까지 for문. y -> x+1 ~ N까지 sub for문.
  * 시간복잡도 : log(n^2)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Search/src/IceCreamParlor.java
* **Missing Number(Easy 83.95%)**
  * 숫자배열 2개를 입력받는다.
  * 나중에 입력받는 숫자배열이 더 길이가 길다.
  * 2개의 배열을 비교하여 잃어버린 숫자를 출력하는 알고리즘.
  * Hint : 1 <= x <= 10^4 , Xmax - Xmin <= 100
  * 즉, count라는 10001배열을 선언하여 arr과 brr 두개의 배열에 각 값에 count를 --,++ 해준다.
  * arr[i] 값에 해당하는 count[arr[i]]-- 해주면 해당되는 값의 인덱스에 --가 될 것이다.
  * brr[i] 값에 해당하는 count[brr[i]]++ 해주면 잃어버린 숫자들만 0보다 큰 값으로 존재할 것이므로 이부분만 출력해주면됨.
  * 시간복잡도 : (arr 값에 해당하는 count Index증가)log(n) + (brr 값에 해당하는 count Index증가)log(n) + (count 검색)log(n) = log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Search/src/MissingNumbers.java
* **Sherlock and Array(Easy 78.28%)**
  * Index i를 기점으로 왼쪽과 오른쪽의 값들의 합이 같으면 "YES" 아니면 "NO"를 출력.
  * 해결책
  ```
   1. 왼쪽기준 인덱스 : i  / 오른쪽기준 인덱스 : j
   2. sum변수 선언 및 0으로 초기화
   3. sum이 0보다 크거나 같으면 sum+=a[i]; i++;
   4. sum이 0보다 작으면 sum-=[aj]; j--;
   5. 이 과정을 while문으로 i와 j가 같을때까지 진행한다.
  ```
  * 시간복잡도 : log(n)
  * Link: https://github.com/seobyoungjun/seoCoding/blob/master/Algorithm/Search/src/SherlockAndArray.java
> ### Graph Theory
* **Breadth First Search : Shortest Reach(Medium 77.02%)**
  * BFS를 이용하여 시작점을 기준으로 전체 노드를 몇번만에 통해 갈 수 있는 구하는 알고리즘.
  * 노드의 개수만큼 N*N의 2차원 배열을 생성하여 두 개의 노드간에 이어주는 점을 서로 x, y라고 한다면 a[x][y]=1, a[y][x]=1로 표시를 해준다.
  * 주의해야할 것
  ```
  1. 새로 연결한 것이 다른 것들과 연결되어 있는 경우를 고려하여야 한다.
  2. 경로를 새로 추가해 줄때 그로 인해 바뀌는 다른 노드들의 가중치를 고려하여 수정해줘야한다.
  3. 기존에 x, y로 이어준다고 했을때 x를 기준으로 그에 연결되어 있는것의 노드를 조사하여 경로값을 수정해 줬지만, y값도 고려하여 경로값을 수정해줘야한다. ex) (3,1) (10,1)로 되었을때, 3이 10으로 가기위해서는 1을 거쳐야하지만, x값을 고려 안해주면 경로가 연결이 안되있는걸로 확인된다.
  ```
  * 미해결 문제... 마지막 테스트 케이스에서 막혔는데 이유를 모르겠음..

