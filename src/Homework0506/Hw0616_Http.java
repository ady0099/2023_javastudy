package Homework0506;

public class Hw0616_Http {
	/*
		HTTP(HyperText Transfer Protocol)는 클라이언트와 서버간 통신을 위한 프로토콜이다.
		요청(Request)와 응답(Response)로 구성되어 있으며 80번 포트를 사용한다.
		HTTP는 헤더(Header)와 본문(Body)으로 나눌 수 있다.
		
		HTTP Header
		: HTTP 헤더는 HTTP전송에 필요한 모든 부가정보를 담고 있으며, 키 : 값으로 이루어져있다.
		개발자 도구(크롬 기준 F12)에서 Network -> Name -> 선택 -> Headers를 선택해 HTTP 헤더의 내용을 확인할 수도 있다.
		HTTP 헤더는 크게 General Header, Request Header, Response Header, Entity(Representation) Header의 네 가지로 다시 나눌 수 있다.
		
		1. General Header : 요청과 응답이 이루어지는 날짜와 시간 등에 대한 일반적인 정보가 포함되는 곳으로 Body 데이터와의 직접적인 관련성은 적다.
		ex) Date, Connection, Content-Length 등
		
		2. Request Header : HTTP 요청에서 사용되는 헤더로, 클라리언트 자체에 대한 자세한 정보를 포함하는 헤더이다.
		ex) Host, Accept, Cookie 등
		
		3. Response Header : 특정 유형의 HTTP 요청이나 특정 HTTP 헤더를 수신했을 때 응답하는 헤더로 위치 또는 서버 자체에 대한 정보 등을 포함하고 있다.
		ex) Server, Allow, Location 등
		
		4. Entity(Representation) Header : 컨텐츠의 길이이나 타입 등 엔티티 바디에 대한 자세한 정보를 포함하는 헤더이나, 기존 Entity Header가 Representation Header로 변경되었다.
		Representation 은 표현 메타데이터(Representation Metadata)와 표현 데이터(Representation Data)로 이루어져있다.
		ex) Content-Type, Content-Length, Content-Language 등
	
	
		HTTP Body
		: HTTP 본문은 실제 메세지가 작성되는 부분이다. HTML, JS, 이미지 등 다양한 데이터를 전송하는데에 사용된다.
	

	
	*/
}
