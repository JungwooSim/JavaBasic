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
        <th>컬렉션</th>
        <th>읽기(접근시간)</th>
        <th>추가 / 삭제</th>
        <th>비고</th>
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

- Stack : Last In First Out
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
    
**Iterator**

- 컬렉션에 저장된 각 요소에 접근하는 기능을 가진 Iterator 인터페이스를 정의하고, Collection 인터페이스에는 'Iterator'를 반환하는 iterator()를 정의하고 있다.
- iterator()는 Collection 인터페이스에 정의된 메서드이므로 List와 Set에도 포함되어 있다.
- 컬렉션 클래스에 대해 iterator()를 호출하여 Iterator을 얻은 후 반복문, 주로 while문을 사용해서 컬렉션의 요소를 읽어 올 수 있다.
- Map인터페이스를 구현한 컬렉션 클래스는 키(key)와 값(value)을 쌍(pair)으로 저장하고 있기 때문에 Iterator()를 직접 호출할 수 없고, 그 대신 keySet()이나 entrySet()과 같은 메서드를 통해서 키와 값을 각각 따로 Set의 형태로 얻어 온 후에 다시 iterator()를 호출해야 Iterator을 얻을 수 있다.

**ListIterator와 Enumeration**

- Enumeration은 컬렉션 프레임워크가 만들어지기 이전에 사용하던 것으로 Itertor의 구버전이라고 생각하면된다. 현재는 이전 버전으로 작성된 호환성 문제로 남겨 두고 있을 뿐이므로 Itertor을 사용하는 것을 권장한다.
- ListIterator은 Iterator을 상속받아서 추가한 것으로, 컬렉션 요소에 접근할 때 양방향으로 가능하다.(Iterator는 단방향으로 가능), 다만 ArrayList나 LinkedList와 같이 List 인터페이스를 구현한 컬렉션에서만 사용가능하다.

**Arrays**

- 배열을 다루는데 유용한 메서드가 정의되어 있다.

**배열을 List로 변환 - asList(Object... a)**

- 주의할점은 asList()가 반환한 List의 크기를 변경할 수 없다는 점. 즉, 추가 및 삭제가 불가능하다. (저장된 내용은 변경 가능)

**Comparator, Comparable**

- 인터페이스로 컬렉션을 정렬하는데 필요한 메서드를 정의하고 있으며, Comparable을 구현하고 있는 클래스들은 같은 타입의 인스턴스끼리 서로 비교할 수 있는 클래스들, 주로 Integer와 같은 wrapper클래스와 String, Date, File과 같은 것들이다. 기본적으로 오름차순이 되도록 구현되어 있다.

**HashSet**

- Set인터페이스를 구현한 가장 대표적인 컬렉션이며, Set인터페이스의 특징대로 HashSet은 중복된 요소를 저장하지 않음.
- 저장순서를 유지하지 않으므로 저장순서를 유지하고자 한다면 LinkedHashSet을 사용하면 된다.
- HashSet은 내부적으로 HashMap을 이용해서 만들어졌다.
- HashSet의 add 메서드는 새로운 요소를 추가하기 전에 기존에 저장된 요소와 같은 것인지 판별하기 위해 추가하려는 요소(객체가 될 수 있음)의 equlas()와 hashCode()를 호출하기 때문에 목적에 맞게 오버라이딩 해야 한다.(<a href="https://github.com/JungwooSim/JavaBasic/tree/master/src/me/study/collection_framework/HashSetEx4.java" target="_blank">링크</a>)

**TreeSet**

- binary search tree 자료구조의 형태로 데이터를 저장하는 컬렉션 클래스이다.
- 정렬, 검색, 범위검색(range search)에 높은 성능을 보이는 자료구조이며 이진 검색 트리의 성능을 향상시킨 '레드 - 블랙 트리(Rad - Black tree)'로 구현되어 있다.
    - 정렬된 상태를 유지하며 Node를 추가하기 때문에 검색이 매우 빠르다.
- Set 인터페이스를 구현했으므로 중복된 데이터의 저장을 허용하지 않으며 정렬된 위치에 저장하므로 저장된 순서를 유지하지도 않는다.
- Linked List처럼 여러 개의 Node가 서로 연결된 구조로, 각 노드에 최대 2개의 노드를 연결할 수 있으며 'root'라고 불리는 하나의 노드에서부터 시작해서 계속 확장해 나갈 수 있다.
- 데이터를 순차적으로 저장하는 것이 아니라 저장위치를 찾아서 저장해야하고, 삭제하는 경우 트리의 일부를 재구성해야 하므로 Linked List보다 데이터의 추가/삭제 시간이 더 걸린다. 대신 배열이나 링크드 리스트에 비해 검색과 정렬기능이 더 뛰어난다.

<img src="/src/me/study/collection_framework/img/7.jpeg" width="500px;">

**HashMap과 Hashtable**

- Hashtable과 HashMap의 관계는 Vector와 ArrayList의 관계와 같아서 Hashtable보다는 새로운 버전인 HashMap을 사용할 것을 권한다.
- HashMap는 Map을 구현한 것이므로 Key와 Value을 묶어서 하나의 데이터(entry)로 저장한다는 특징을 갖는다. 그리고 hashing을 사용하기 때문에 많은 양의 데이터를 검색하는데 있어서 뛰어난 성능을 보인다.
- HashMap은 키와 값을 Object 타입으로 저장한다. 즉, (Object, Object)의 형태로 저장하기 때문에 어떠한 객체도 저장할 수 없지만 주로 String을 대문자 또는 소문자로 통일해서 사용하곤 한다.

**해싱과 해시함수**

- 해싱이란 해시함수(hash function)을 이용해서 데이터를 hash table에 저장하고 검색하는 기법을 말한다.
- 해시함수는 데이터가 저장된 위치를 알려주기 때문에 다량의 데이터 중에서도 원하는 데이터를 빠르게 찾을 수 있다.
- 해싱에서 사용하는 자료구조는 다음과 같이 배열과 링크드 리스트의 조합으로 되어 있다.

<img src="/src/me/study/collection_framework/img/8.jpeg" width="500px;">

- 저장할 데이터의 키를 해시함수에 넣으면 배열의 한 요소를 얻게 되고, 다시 그 곳에 연결되어 있는 링크드 리스트에 저장하게 된다.
