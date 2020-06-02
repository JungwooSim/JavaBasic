## Java.lang 패키지와 유용한 클래스

### Object Class

**clone()**

- 자신을 복제하여 새로운 인스턴스를 생성하는 일을 한다.
- 원래의 인스턴스는 보존하고 clone메서드를 이용해서 새로운 인스턴스를 생성하여 작업을 하면 작업이전의 값이 보존되므로 작업에 실패해서 원래의 상태로 되돌리거나 변경되기 전의 값을 참고하는데 도움이 된다.
- Object Class에 정의된 clone()는 단순히 인스턴스변수의 값만을 복사하기 때문에 참조 타입의 인스턴스 변수가 있는 클래스는 완전한 인스턴스 복제가 이루어지지 않는다.
    - 예를 들어, 배열의 경우 복제된 인스턴스도 같은 배열의 주소를 갖기 때문에 복제된 인스턴스의 작업이 원래의 인스턴스에 영향을 미치게 된다.
    → 이런 경우 clone()를 오버라이딩해서 새로운 배열을 생성하고 배열의 내용을 복사하도록 해야 한다.

**getClass()**

- 자신이 속한 클래스의 Class 객체를 반환하는 메소드이며 Class객체는 이름이 'Class'인 클래스의 객체이다.
- Class객체는 클래스의 모든 정보를 담고 있으며, 클래스당 1개만 존재한다.
- 클래스 파일이 'ClassLoader'에 의해서 메모리에 올라갈 때, 자동으로 생성된다.
    - ClassLoader는 실행 시에 필요한 클래스를 동적으로 메모리에 로드하는 역할을 한다.

### String Class

- 기존의 다른 언어에서는 문자열을 char형의 배열로 다루었으나 자바에서는 문자열을 위한 클래스를 제공한다. 이것이 String Class인데, String Class는 문자열을 저장하고 이를 다루는데 필요한 메소드를 함께 제공한다.

**변경 불가능한(immutable) 클래스**

- String 클래스는 문자열을 저장하기 위해서 문자열 배열 참조변수(char[]) value를 인스턴스 변수로 정의해놓고 있다. 인스턴스 생성 시 생성자의 매게변수로 입력받는 문자열은 인스턴스 변수에 char[]로 저장되는 것이다.
- 덧셈연산자 "+"를 사용해서 문자열을 결합하는 것은 매 연산 시 마다 새로운 문자열을 가진 String 인스턴스가 생성되어 메모리 공간을 차지하게 되므로 가능한 결합 횟수를 줄이는 것이 좋다.

**문자열 비교**

- String Class의 생성자를 이용한 경우에는 new연산자에 의해서 메모리 할당이 이루어지기 때문에 항상 새로운 String  인스턴스가 생성된다. 그러나 문자열 리터럴은 이미 존재하는 것을 재사용하는 것이다.

### StringBuffer 클래스와 StringBuilder 클래스

- String는 인스턴스 생성할 때 지정된 문자열을 변경할 수 없다. 하지만 **StringBuffer 클래스는 내부적으로 편집을 위한 buffer을 가지고 있어서 변경이 가능하고, 인스턴스 생성할 때 크기를 지정할 수 있다.**
    - 크기를 지정할 때는 편집을 생각하여 충분히 잡는 것이 좋다. 만약 편집 중인 문자열이 지정한 크기를 넘게 되면 buffer의 길이를 늘려주는 작업이 추가로 수행된다.(Copy On  Write 방식이며 작업 효율 감소)
- thread safe 가 된다.(멀티스레드 환경에서 동기화)

**StringBuilder**

- StringBuffer 에서 thread safe가 빠진 것.
    - thread safe가 빠짐으로 인해 StrinfBuffer보다 성능이 우수하다.

**Math Class**

- 기본적인 수학계산에 유용한 메소드로 구성

**StringMath Class**

- Math Class는 최대한의 성능을 얻기 위해 JVM에 설치된 OS의 메소드를 호출해서 사용한다. (OS에 의존적인 계산)
- OS마다 다를 수 있는 문제점을 개선하기위해 성능을 다소 포기하는 대신에 만들어진 클래스

**Wrapper Class**

- 기본형(primitive type) 변수를 객체로 다뤄야 할 때 기본형 값들을 객체로 변환할 때 사용되는 것
    - 기본형(primitive type) 변수를 객체로 다뤄야 할 때는 매개변수로 객체를 요구하거나, 기본형 값이 아닌 객체로 저장해야 할 때, 객체 간의 비교가 필요할 때, 등..

        <div>
            <img src="/src/me/study/java_lang/img/wrapper.jpeg" width="500px;">
        </div>

**Number Class**

- 추상클래스로 내부적으로 숫자를 멤버변수로 갖는 wrapper class들의 조상이다.

<img src="/src/me/study/java_lang/img/number.jpeg" width="500px;">

**문자열을 숫자로 변환하기**

<img src="/src/me/study/java_lang/img/number_02.jpeg" width="500px;">

JDK1.5부터는 autuboxing 기능으로 인해 반환값이 기본형일 때와 래퍼클래스일 때의 차이가 없어졌다. 그래서 그냥 구별 없이 valueOf()를 쓰는 것도 괜찮은 방법이다.(단 성능은 valufOf()가 조금 더 느리다.)

**AutoBoxing & UnBoxing**

- AutoBoxsing : 기본형 값 → 래퍼 클래스 로 자동 변환
- UnBoxing : 래퍼 클래스 → 기본형 값 으로 자동 변환

### 유용한 클래스

**java.utill.Objects Class**

- Object class의 보조 클래스, Math Class 처럼 모든 메소드가 'static' 이다
- 객체의 비교, null check에 유용하다
- compare() : 두 비교대상이 같으면 0, 크면 양수, 적으면 음수 를 리턴

**java.util.regex Package**

<img src="/src/me/study/java_lang/img/regex.jpeg" width="700px;">

**java.util.Scanner Class**

- 화면, 파일, 문자열과 같은 입력소스로부터 문자데이터를 읽어오는데 도움을 주는 목적으로 JDK1.5부터 추가

**java.math.BigInteger Class**

- 가장 큰 정수형 타입인 long은 표현할 수 있는 값은 10진수로 19자리 정도 이다. 상당히 큰 값이지만 과학적 계산에서는 더 큰 값을 다뤄야 할 때가 있다.
- BigInteger는 내부적으로 int배열을 사용해서 값을 다룬다. 그래서 long타입보다 훨씬 큰 값을 다룰 수 있다.
