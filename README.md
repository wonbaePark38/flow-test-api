# 📁 파일 확장자 차단 프로젝트

HTML/CSS/JavaScript 프론트엔드와 Spring Boot 백엔드로 구성된 확장자 차단 관리 시스템입니다.  
사용자는 고정 확장자와 커스텀 확장자를 구분하여 설정하고, 이를 API 서버를 통해 DB에 저장/삭제할 수 있습니다.

---

## 🛠 개발 환경

### 💻 Frontend
- HTML
- CSS
- JavaScript (Vanilla JS)

### 🔧 Backend
- Java 17
- Spring Boot 3.x
- Spring Web, Mybatis

### 🗃 Database
- PostgreSQL

### 🌐 Web Server
- Nginx

---

## 🎯 개발 요구사항

1. ✅ **고정 확장자와 커스텀 확장자**를 구분하여 저장
2. ✅ 체크/추가 시 API 호출을 통해 **DB 저장**
3. ✅ 체크 해제/삭제 시 API 호출을 통해 **DB 삭제**
4. ✅ 커스텀 확장자 **최대 입력 길이: 20자**
5. ✅ 추가 버튼 클릭 시 **UI에 즉시 표현**
6. ✅ 커스텀 확장자 최대 **200개까지 추가 가능**

---

## ⚠️ 고려사항

- 📦 **프론트와 API 서버 분리 운영**
    - 프론트는 Nginx에서 정적 파일로 서비스
    - API 서버는 별도 Spring Boot 서버 (포트 분리)
- 🚫 커스텀 확장자 **중복 추가 시 경고창** 표시
- 🔄 API 통신 실패 시 **UI 상태 롤백** (선택 상태 복원)
- 📡 API 서버 응답은 **공통 응답 객체(Response DTO)** 사용
- 🔐 **DB 접속정보 등 민감정보는 암호화 처리**
    - 예: Jasypt 사용하여 application.yml에서 암호화 값 관리
