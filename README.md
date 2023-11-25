# initial-quiz

초성 퀴즈 게임

## 기술 스택

프로그래밍 언어: `Java` <br>
GUI: `SWING` <br>
DATABASE: `MySQL` <br>
IDE: Apache Netbeans 14 <br>
의존성 파일: mysql-connecto.jar

## 프로젝트 구조
<details>
  <summary>src/com/initialquiz</summary>

- frame
  - LoginFrame.java
  - SignupFrame.java
  - InGameFrame.java
- controller
  - LoginController.java
  - SignupController.java
  - InitGameController.java
  - UserPointController.java
- service
  - UserService.java
  - QuizService.java
- dao
  - UserDAO.java
  - QuizDAO.java
- dto
  - UserDTO
  - QuizDTO
- db
  - DBConnect.java
  - initial_quiz_schema.sql
  - insertQuery.sql
</details>

## 프로젝트 화면

login/ signup <br>
<img src="./screenshots/LoginFrame.png" width="40%" height="auto">
<img src="./screenshots/SignupFrame.png" width="40%" height="auto"> <br>
ingame <br>
<img src="./screenshots/InGameFrame.png" width="40%" height="auto">
<img src="./screenshots/InGameFrame_play.png" width="40%" height="auto"> <br>
