### 11. Collections Framework

- 데이터 군(data group)을 저장하는 클래스들을 표준화한 설계를 뜻한다
- Collections : 다수의 데이터, Framework : 표준화된 프로그래밍 방식을 의미한다.

**컬렉션 프레임워크의 핵심 인터페이스**

- 컬렉션 프레임워크에서는 컬렉션 데이터 그룹을 3가지 타입이 존재한다고 인식하고 각 컬렉션을 다루는데 필요한 기능을 가진 3개의 인터페이스를 정의하였다.

    <img src="/src/me/study/collection_framework/img/1.jpeg" width="500px;">

- List와 Set은 서로 공통되는 부분이 있어서 공통된 부분을 다시 뽑아 Collection 인터페이스를 정의할 수 있었지만, Map 인터페이스는 이들과는 전혀 다른 형태로 컬렉션을 다루기 때문에 같은 상속계층에도 포함되지 못했다.

    <img src="/src/me/study/collection_framework/img/2.jpeg" width="500px;">

**Collection 인터페이스**

- 컬렉션 클래스에 저장된 데이터를 읽고, 추가하고 삭제하는 등 컬렉션을 다루는데 가장 기본적인 메서드들을 정의

**List 인터페이스**

- 중복을 허용하면서 저장순서가 유지되는 컬렉션을 구현하는데 사용

    <img src="/src/me/study/collection_framework/img/3.jpeg" width="500px;">

**Set 인터페이스**

- 중복을 허용하지 않고 저장순서가 유지되지 않는 컬렉션을 구현하는데 사용(List와 반대)

    <img src="/src/me/study/collection_framework/img/4.jpeg" width="500px;">

**Map 인터페이스**

- Key와 Value을 하나의 쌍으로 묶어서 저장하는 컬렉션 클래스를 구현하는데 사용
- Key는 중복될 수 없지만 Value는 중복을 허용한다.

    <img src="/src/me/study/collection_framework/img/5.jpeg" width="500px;">

**Map.Entry 인터페이스**

- Map 인터페이스의 내부 인터페이스
- Map에 저장되는 key-value 쌍을 다루기 위해 내부적으로 Entry 인터페이스를 정의 → 이는 보다 객체지향적으로 설계하도록 유도하기 위한 것으로 Map 인터페이스를 구현할 때는 Map.Entry 인터페이스도 구현하여야 한다.

**ArrayList**

- List 인터페이스를 구현하기 때문에 저장순서가 유지되고 중복을 허용
- Vector를 개선한 것으로 Vector와 구현원리와 기능적인 측면은 동일하다. (Vector는 기존에 작성된 소스와의 호환성을 위해 계속 남겨 두고 있을 뿐이기 때문에 가능하면 Vector보다 ArrayList을 사용하는 것을 권장한다.)
- Obejct[]을 이용하여 데이터를 순차적으로 저장하고 배열에 더이상 저장할 공간이 없으면 보다 큰 새로운 오브젝트 배열을 생성하고 Copy & Write 방식으로 배열을 복사하게 된다.
- **ArrayList 와 Vector 는 Copy & Write 방식을 사용하기 때문에 저장할 공간이 없게되면 굉장히 비효율적이게 된다. 그러므로 미리 배열 공간을 넉넉히 잡는 것이 중요하다.**

**LinkedList**

- Array는 가장 기본적인 자료구조로 구조가 단순하여 사용하기 쉽고 데이터를 읽어오는데 걸리는 시간(access time, 접근시간)이 가장 빠르다는 장점이 있다. 하지만 다음과 같은 단점이 있다.
    - 크기를 변경할 수 없다.
        - 새로운 배열을 생성해서 데이터를 복사해야 함.
    - 비순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸린다.
        - 배열의 중간에 데이터를 추가하게 되면 빈자리를 만들기 위해 다른 데이터를 복사해서 이동시켜야 함
- 위와 같은 Array의 단점을 보완하기 위해 Linked List(연결리스트) 자료구조가 고안되었다.
- LinkedList는 불연속적으로 존재하는 데이터를 서로 연결(link)한 형태로 구성되어 있다.
- 데이터를 삭제하거나 추가할 때 데이터를 복사하는 과정이 없으므로 처리속도가 빠르다.
- LinkedList는 단방향이므로 다음 요소에 접근은 쉽지만 이전요소에 대한 접근은 어렵다. 이를 보완하기 위해 양방향으로 접근 가능한 Doubly Linked List 자료구조가 있으며 Linked List보다 더 많이 이용된다.
- 또, Doubly Circular Linked List(이중 원형 연결리스트) 자료구조가 있다. 이는 Doubly Linked 의 첫번째 요소와 마지막 요소를 서로 연결시킨 것으로 Doubly Linked의 단점을 보완시킨 자료구조이다.

**ArrayList와 LinkedList 비교**
<table>
    <tr>
        <td>컬렉션</td>
        <td>읽기(접근시간)</td>
        <td>추가 / 삭제</td>
        <td>비고</td>
    </tr>
    <tr>
        <td>ArrayList</td>
        <td>빠르다</td>
        <td>느리다</td>
        <td>순차적인 추가삭제는 더 빠르다.<br>비효율적인 메모리 사용</td>
    </tr>
    <tr>
        <td>LinkedList</td>
        <td>느리다</td>
        <td>빠르다</td>
        <td>데이터가 많을수록 접근성이 떨어진다.</td>
    </tr>
</table>

- 다루고자 하는 데이터의 개수가 변하지 않는 경우라면, ArrayList가 최상의 선택이 될수 있다.
- 하지만, 데이터 개수의 변경이 잦다면 LinkedList를 사용하는 것이 더 나은 선택이 될 것이다.
- 두 클래스의 장점을 이용하여 조합해서 사용하는 방법도 생각해 볼 수 있다. 컬렉션 프레임워크에서는 대부분 변환이 가능한 생성자를 제공하고 있다.

**Stack과 Queue**

- Stack : List In First Out
    - ArrayList 가 적합
- Queue : First In First Out
    - LinkedList 가 적합하다. (Array는 매번 빈공간을 채우기 위해 데이터 복사가 발생하므로 비효율적)

**Priority Queue**

- Queue 인터페이스의 구현체 중 하나로, 저장된 순서와 관계없이 우선순위(priority)가 높은 것부터 꺼내게되는 특징이 있다.
- 저장공간을 배열을 사용하고, Heap이라는 자료구조의 형태로 저장한다.

**Deque(Double-Ended Queue)**

- Queue의 변형으로, 한 쪽 끝으로만 추가/삭제할 수 있는 Queue와 달리 양쪽 끝에 추가/삭제가 가능
- Deque의 조상은 Queue이고, 구현체는 ArrayDeque와 LinkedList 등이 있다.

    <img src="/src/me/study/collection_framework/img/6.jpeg" width="500px;">
