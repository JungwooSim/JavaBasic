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

**Period, Duration**

- Period : 두 날짜간의 차이를 표현 (날짜 - 날짜)
- Duration : 두 시간의 차이를 표현 (시간 - 시간)

### LocalDate, LocalTime

<img src="/src/me/study/date_time_formatting/img/localdatetime_img_1.jpeg">

### Instant

- 에포크 타임(EPOCH TIME, 1970-01-01 00:00:00 UTC)부터 경과된 시간을 나노초 단위로 표현
- 사람에겐 불편하지만 단일 진법으로만 다루기 때문에 계산이 간편
- UTC(Coordinated Unversal Time)가 기준이 되기 때문에 '국제 표준시' 가 필요할 때 사용하면 된다.

### TemporalAdjusters

- plus(), minus()와 같은 메소드로 날짜와 시간을 계산할 수 있지만 "지난주 토요일이 며칠인지", "이번 달의 3번째 금요일은 무슨 요일 인지" 와 같은 날짜계산을 할때 용이하다

    <img src="/src/me/study/date_time_formatting/img/temporaladjusters_img_1.jpeg">

### 파싱과 포멧

- 형식화(formating)와 관련된 클래스들은 java.time.format 패키지에 들어있는데, 이 중에서 DateTimeFormatter가 날짜와 시간을 원하는 형식으로 출력하고 해석 할때 자주 사용된다.

    <img src="/src/me/study/date_time_formatting/img/formating_img_1.jpeg">

    <img src="/src/me/study/date_time_formatting/img/formating_img_2.jpeg">

    **문자열을 날짜와 시간으로 파싱하기**

    - 문자열을 날짜 또는 시간으로 변환하려면 static Method의 parse()를 사용하면 된다. 날짜와 시간을 표현하는 class 에는 parse() method가 거의 다 포함되어 있다.
