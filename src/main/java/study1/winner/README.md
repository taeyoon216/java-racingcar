# 기능목록

---

- ## winner
  - Main.java
  - type / 테스트 불가
    - MoveStrategy.java
      - method
        - Boolean move();
    - RaceMove.java
      - field
        - MAX_NUM
        - STANDARD_NUM
      - method
        - Boolean move();
  - common
    - InputView.java
    - ResultView.java
  - service / 테스트
    - Race.java
      - field
        - Cars cars;
        - Participants participants
      - constructor
        - Race(Participants participants, int round);
      - method
        - List<Cars> start();
        - Cars roundCheck(Cars cars);
        - List<String> winners();
    - Car.java
      - field
        - String name
        - int distance
      - constructor
        - Cars(Name name, int distance);
        - Cars(String name);
        - Cars(String name, int distance);
      - method
        - Car move(MoveStrategy moveStrategy);
        - String driver();
        - int distance();
        - List<ResultData> result();
    - Name.java
      - field
        - String names;
      - constructor
        - Name(String name);
      - method
        - String name();
    - Cars.java
      - field
        - List<Car> cars;
      - constructor
        - Cars();
      - method
        - Cars move();
        - List<String> winners();
        - int maxDistance();
        - boolean isWinner(int maxDistance);