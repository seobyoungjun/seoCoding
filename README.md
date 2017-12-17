https://guides.github.com/features/mastering-markdown/
# HackerRank
## DataStructure
> ### Arrays
* Arrays_DS
  * 입력받은 값을 배열에 저장해 역순으로 출력하기.
  * 배열의 N-1부터 0번째 인덱스 까지 출력함으로 시간복잡도 **O(N)**.
  * https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Arrays/src/Arrays_DS.java
* 2DArrays_DS
  * (6,6) 크기의 2차원 배열에서 순차 방문하여 모래시계 형태의 합이 가장 큰 값을 찾아 출력하기.
  * i,j를 0부터 4까지 이중 for문을 돌린다.
  * 큰 값을 저장하기 위한 변수의 초기화를 가장 작은 값으로 초기화 시키기 위해 값의 범위 제약 중 -9부터 시작하기 때문에 -9*7 = -63으로 초기화한다.
  * 이중 for문이라 시간복잡도 **O(N^2)**.
  * https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Arrays/src/Arrays2D_DS.java
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
  *  https://github.com/seobyoungjun/seoCoding/blob/master/DataStructures/Arrays/src/Dynamic_Array.java

