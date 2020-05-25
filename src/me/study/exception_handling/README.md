### 08. 예외처리(Exception Handling)
- 에러 or 오류
    - Compile-time error - 컴파일 할 때 발생하는 에러
    - Runtime error - 실행 도중에 발생하는 에러
        - Error - 발생하면 복구할 수 없는 심각한 오류
            - Ex. OutOfMemoryError, StackOverflowError
        - Exception - 프로그램 코드에 의해 수습될 수 있는 미약한 오류
            - 계층 구조
                <div>
                <img src="/src/me/study/exception_handling/img/08_1.png" width="500px;">
                <img src="/src/me/study/exception_handling/img/08_2.png" width="500px;"><br>
                </div>
                - Exception Class - **사용자의 실수**와 같은 **외적인 요인**에 의해 발생하는 예외
                - RuntimeException Class - **개발자의 실수**로 발생하는 예외
                    - 컴파일러가 예외 처리를 확인하지 않으므로 예외가 필요하다면 예외 발생 경우를 모두 고려하여 모든 곳에 예외 처리가 필요하다.
    - Logical error - 실행은 되지만, 의도한 것과 다르게 동작하는 것
- 예외처리, try-catch문
    - 정의 : 프로그램 실행 시 발생할 수 있는 예외에 대비한 코드를 작성하는 것
    - 목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행 상태를 유지하는 것
    - 발생한 예외를 처리하지 못한다면, 프로그램은 비정상적으로 종료되며, 처리 되지 못한 예외(uncaught exception)은 JVM의 예외처리기(UncaughtExceptionHandler)가 받아서 예외의 원인을 화면에 출력하게 된다.
    - 모든 예외 클래스는 Exception Calss의 자손이다.
        - 즉, catch(Exception e) 클래스 타입의 참조 변수를 선언해 놓으면 어떤 종류의 예외가 발생하더라도 이 catch블럭에 의해서 처리된다.
        - Tip : 예외가 발생할 것으로 예상되는 곳에 작성 해놓는다면 어떤 처리든 할 수 있다.
- 예외 발생시키기
    - 키워드 throw를 사용해서 개발자가 고의로 예외를 발생할 수 있다.
- 메소드에 예외 선언하기
    - try-catch문을 사용하는 것 외에, 예외를 메소드에 선언하는 방법도 있다.
    - 메소드를 작성할 때, 메소드 내에서 발생할 가능성이 있는 예외를 메소드 선언부에 명시하여 이 메소드를 사용하는 쪽에서 이에 대한 처리를 하도록 강요할 수 있다.
    - Java API 문서를 통해 사용하고자 하는 메소드의 선언부와 "Throws:"을 보고 이 메소드에서 어떤 예외가 발생하며 반드시 처리해줘야하는 예외가 어떤 것들이 있는지 확인하는 습관을 가지면 좋다.
- 자동 자원 반환, try-with-resources
    - 주로 입출력에 사용되는 클래스 중에서 사용한 후에 close하여 자원들 반환받아야 되는 것들이 있다. 이 때 사용 된다.
- 사용자 정의 예외
    - 보통 Exception, RuntimeException 클래스로 부터 상속받아서 만들 수 있지만 필요에 따라서 알맞은 예외 클래스를 선택할 수 있다.
    - * 가능하면 새로운 예외 클래스를 만들기보다 기존의 예외클래스를 활용하는 것이 좋다.
- 예외 던지기(exception re-throwing)
    - 한 메소드에서 예외가 여럿일 경우, 몇개는 try-catch문을 통해서 자체적으로 처리하고, 나머지는 선언부에 지정하여 호출한 메소드에서 처리하도록 함으로써, **양쪽으로 나눠서 처리되도록 할 수 있다.**
    - 단 하나의 예외에 대해서도 예외가 발생한 메소드, 호출한 메소드 양쪽에서 처리하도록 할 수도 있다.
- 연결된 예외(chained exception)
    - 한 예외가 다른 예외를 발생시킬 수도 있다.
    예를 들어, A 가 B 를 발생시켰다면, A를 B의 "원인 예외(cause exception)"라고 한다.
