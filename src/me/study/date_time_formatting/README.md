## 날짜와 시간 & 형식화

### 형식화 클래스

- java.text 패키지에 포함되어 있으며 숫자, 날짜, 텍스트 데이터를 일정한 형식에 맞게 표현할 수 있는 방법을 객체지향적으로 설계하여 표준화 클래스 이다.

**DecimalFormat**

- 숫자를 형식화 하는데 사용
- 숫자 데이터를 정수, 부동소수점, 금액 등의 다양한 형식으로 표현할 수 있으며, 반대로 일정한 형식의 텍스트 데이터를 숫자로 쉽게 변환하는 것도 가능하다.

<img src="/src/me/study/date_time_formatting/img/decimalformat_img_1.jpeg" width="500px;">

**SimpleDateFormat**

- Date와 Calendar만으로 날짜 데이터를 원하는 형태로 다양하게 출력하는 것은 불편하고 복잡하다. 그러나  SimpleDateFormat을 사용하면 이러한 문제들을 간단하게 해결 가능하다.

**ChoiceFormat**

- 특정 범위에 속하는 값을 문자열로 변환해준다.
- 연속적 또는 불연속적인 범위의 값들을 처리하는데 있어서 if문이나 switch문은 적절하지 못한 경우가 많다. 이 때 ChoiceFormat을 사용하면 간단하고 직관적으로 사용할 수 있다.

**MessageFormat**

- 데이터를 정해진 양식에 맞게 출력할 수 있도록 도와준다.
- 데이터가 들어갈 자리를 미리 정의하고 프로그램을 이용해서 다수의 데이터를 같은 양식으로 출력할 때 사용하면 좋다.

### **java.time package**

<img src="/src/me/study/date_time_formatting/img/java_time_package_img_1.jpeg" width="500px;">

**java.time 패키지의 핵심 클래스**

- LocalDate(날짜) + LocalTime(시간) → LocalDateTime(날짜 + 시간)
- LocalDateTime + 시간대 → ZonedDateTime
- 날짜를 세부적으로 다룰 수 있는 Year, YearMonth, MonthDay와 같은 클래스도 있다.
