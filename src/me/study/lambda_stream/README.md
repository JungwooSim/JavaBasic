## 람다와 스트림

**람다식이란?**

람다식(Lambda expression)은 메서드를 하나의 '식(expression)'으로 표현한 것이다.</br>
함수를 간략하면서도 명확한 식으로 표현할 수 있게 해준다.

<img src="/src/me/study/lambda_stream/img/img-1.png" width="500px;">

**함수형 인터페이스(Funcitional Interface)**

람다식은 익명 클래스의 객체와 동일하다. (자바에서 모든 메서드는 클래스 내에 포함되어야 한다.)

**스트림(stream)**
기존의 자바에서는 많은 데이터를 다룰 때, 컬렉션이나 배열에 데이터를 담고 원하는 결과를 얻기 위해 for 또는 Iterator 를 이용해서 코드를 작성해왔다.</br>
이의 단점은 각 컬렉션 클래스마다 같은 기능의 메서드들이 중복해서 정의되어 있다. (Ex. Collections.sort(), Arrays.sort())</br>
이를 해결하기 위해 나온 것이 "stream" 이다.</br>
스트림은 데이터 소스를 추상화하고, 데이터를 다루는데 자주 사용되는 메서드들을 정의해놓았다.</br>
데이터를 추상화 한다는 것은 데이터의 자료형이 무엇이든간에 같은 방식으로 처리가 가능하다는 것인데(다형성) 이것은 코드의 재사용성이 높아진다는 것을 의미한다.

스트림의 연산

- 스트림이 제공하는 다양한 연산을 이용해서 복잡한 작업들을 간단히 처리할 수 있다.
  select 문으로 query 하는 것과 비슷한 느낌이다.

지연된 연산

- 최종 연산에 모든 연산이 이루어 진다.(중간 연산이 있어도 최종 연산때 이루어짐)

병렬 스트림

- 병렬처리가 쉽다. parallel() 메서드를 호출해서 병렬로 연산을 수행하도록 지시하면 된다.

**스트림 만들기**

- Collection 에 stream() 이 정의되어 있다. 그래서 List, Set 을 구현한 클래스에서는 stream() 메서드를 통해 생성 가능하다.
- 배열에서는 Arrays.stream() 을 통해 사용 가능하다.
- IntStream, LongStream, DoubleStream
- Stream 클래스의 iterate(), generate() 는 람다식을 매개변수로 받아서 사용 가능하다.

**스트림의 변환 정리**
<img src="/src/me/study/lambda_stream/img/img-2.png" width="500px;">

<img src="/src/me/study/lambda_stream/img/img-3.png" width="500px;">
