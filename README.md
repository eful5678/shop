# Meeting#2 2021.01.20

## 1. Sub Project

---
- 기간 : ~금까지
- 오늘까지 진행하던 shop 프로젝트 내일 조별활동시간부터 시작!
- 파트 분배
    - 기존과 같이
    - 깃헙 Issue 게시판에 **파트업로드**하면 좋을듯!
        - ex) 김현진 - 멤버 로그인파트(login.jsp / logincontroller ...)
- 프로젝트 합쳤을 때 오류 생기면 다같이 모여서 해결
- session 관련
    - 다른 조원 파트의session으로부터 받아와야할 정보가 있지만, 다른 조원 파트가 안끝났을 때, 다음과 같이 이용하기
```html
<head>
<%
   session = request.getSession();
   session.setAttribute("id", "id");
%> 
</head>
<body>
    <% String id = (String) session.getAttribute("id"); %>
</body>
```
- UploadPath 관련
    - 업로드 경로 통일하기(이미지 등 업로드시 저장되는 공간)
        - C:\shop2\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\webapps\img

## 2. Github
___
- 깃허브 커밋할 때 오류날 시 오류내용 공유하기
- master branch
    - master를 기본으로 각자 자신의 이름을 딴 branch에만 커밋!
    - master branch 내일 업로드 예정
- 깃허브 관련 문제나 건의 사항 Issue에 업로드! -> <u>가장 중요!</u>
___
___

## 3. Main Project
- 주말간 메인 프로젝트 관련 회의!

___
이외의 반영되지 않은 추가 사항은 카톡으로 공유 부탁드립니다^^ 감사합니다.



___

## 김평기 commit 내용:
1. seller package의 DetailController, ProdDelController, EditController 처리
2. 위와 관련된 DAOImpl, ServiceImpl 메소드 작성
3. Detail.jsp, list.jsp 작성

___
