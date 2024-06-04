# Board-Server

# 사용기술
* Java 17, Spring Boot 3.3, MyBatis, MySQL, Redis


# 성능테스트 툴
* Python 3.9, Locust

# ERD(Entity Relationship Diagram)
<img width="723" alt="erd" src="https://github.com/sapzilking/boardserver/assets/93430103/29f63628-1645-4657-9233-a4ea9ebaba96">


# 시퀀스
* 게시글 등록 시퀀스
<img width="948" alt="image" src="https://github.com/sapzilking/boardserver/assets/93430103/94863b7b-b6c8-4144-a003-378ca6608c38">

* 게시글 검색 시퀀스
<img width="960" alt="image" src="https://github.com/sapzilking/boardserver/assets/93430103/75a8c00d-5a96-4a66-bec0-4b3828a25387">


# 프로그램 주요 기능
* 회원
  * 가입, 탈퇴
  * 아이디 및 닉네임 중복체크
  * 비밀번호 암호화
  * 로그인, 로그아웃
* 게시판
  * 카테고리 관리
    * 추가, 삭제, 수정
  * 게시글 관리
    * 게시글 & 파일 추가, 삭제, 수정, 조회
    * 유저 정보, 게시글 제목, 게시글 내용 등
  * 게시글 검색 기능
    * 작성 유저 아이디
    * 게시글 제목, 게시글 내용 등을 통해 검색
    * 태그 작성 및 조회 기능
  * 댓글 작성 기능
* 어드민
  * 공지글 추가 기능
