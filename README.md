# Project_ThreeB
### 에어비앤비를 모티브로 만든 숙박업소 플랫폼 팀 프로젝트입니다.
* 기간 : 2020.10.22 ~ 2020.11.13
* 개발 환경 : Eclipse(4.14.0)
* 사용 스택 : Java, JavaScript, jQuery, Ajax, Spring, Bootstrap, mybatis, Oracle DB

## java/com/threeb
>## /common
>프로젝트 내에서 공통 적으로 사용되는 기능들(이미지 파일과 관련 기능과 ViewNameInterceptor)을 제어 
>## /house
>숙소와 관련된 전반적인 기능 제어
>> info 
>* /info.do
>> payment
>* /payment.do
>* /payment/addNewBooking.do 
>> search
>* /search.do
>## /member
> 회원가입과 로그인의 관련된 기능 제어
>* /addMember.do
>* /login.do
>* /logout.do
>## /mypage
> 사용자의 예약과 리뷰, 숙소를 등록한 경우 등록한 숙소의 전반적인 관리 기능 제어
>> guest
>* /viewBooking.do
>* /cancelBooking.do
>* /reviewForm.do
>* /writeReview.do
>* /viewReview.do
>* /modReview.do
>* /deleteReview.do
>> host
>* /uploadForm.do
>* /addNewHouse.do
>* /deleteHouse.do
>* /cancelBooking.do
