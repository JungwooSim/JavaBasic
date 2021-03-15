### 12. Generics, Enumeration, Annotation
**Generics**
- 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시 타입 체크(compile-time type check)를 해주는 기능
    - 객체의 타입을 컴파일 시에 체크하기 때문에 객체의 타입 안정성을 높이고 형변환의 번거로움이 줄어든다.
    - 객체 타입의 안정성을 높인다는 것은 의도하지 않은 타입의 객체가 저장되는 것을 막고, 저장된 객체를 꺼내올 때 원래의 타입으로 잘못 형변환되어 발생할 수 있는 오류를 줄여 줄 수 있다.

```java
class Box<T> {
    T item;

    void setItem(T item) { this.item = item; }
    T getItem() { return item; }
}
```
Box<T>에서 T 는 타입 변수(type variable) 라고 한다.(T가 아닌 다른 것을 사용해도 된다.)
필요에 따라 Box<T, K, V> 와 같 나열햇 사용할 수 있다.
    
와일드 카드
```java
<? extends T> 와일드 카드의 상한 제한. T와 그 자손들만 가능
<? super T> 와일드 카드의 하한 제한. T와 그 조상들만 가능
<?> 제한 없음. 모드 타입이 가능. <? extends Object> 와 동일
```

**enums(열거형)**

- 서로 관련된 상수를 편리하게 선언하기 위한 것으로 여러 상수를 정의할 때 사용하면 유용하다.
- 자바의 열거형은 'typesafe enum'이라서 실제 값이 같아도 타입이 다르면 컴파일 에러가 발생한다.
