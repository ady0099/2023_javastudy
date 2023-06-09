package Homework;

/* 개인)0605-0609
	디자인패턴에 대해서 리포트 제출
*/
public class Hw0609_DesignPattern {
	/*
	디자인 패턴(Design Pattern)은 소프트웨어 디자인에서 자주 발생하는 문제들을 피하기 위해 만들어졌다. 
	각기 다른 개발환경에서도 공통적으로 발생하는 문제들을 비슷한 것끼리 유형화한 재사용 가능한 해결책이라고 할 수 있다.
	디자인 패턴에 대한 사전 지식이 있을 경우 소통에 드는 시간과 비용을 절약할 수 있고, 개발 속도를 향상 시킬 수 있으며, 처음 보는 소프트웨어도 패턴만 알면 쉽게 파악할 수 있다.   
	다만, 디자인 패턴이 '이미 닦인 쉬운 길'일 수는 있어도 '항상 정답'인 것은 아니므로, 패턴에 매몰되어 모든 문제를 패턴으로 해결하려고 하는 상황은 피해야한다.  
	
	GoF를 통해 널리 알려진 디자인 패턴은 23개로, 크게 생성(Creational) 패턴, 구조(Structural) 패턴, 행위(Behavioral) 패턴 세 가지로 나뉜다.
	 
	 
	1. 생성(Creational) 패턴
	객체의 생성과 조합을 캡슐화해 특정 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 크게 받지 않도록 유연성을 제공한다.
	추상 팩토리(Abstract Factory), 빌더(Builder), 팩토리 메소드(Factory Method), 프로토타입(Prototype), 싱글턴(Singleton)
	
	(1) 추상 팩토리(Abstract Factory)
	- 구체적인 클래스에 의존하지 않고 서로 연관되거나 의존적인 객체들의 조합을 만드는 인터페이스를 제공하는 패턴
	
	(2) 빌더(Builder)
	- 작게 분리된 인스턴스를 건축 하듯이 조합하여 객체를 생성하는 패턴
	
	(3) 팩토리 메소드(Factory Method)
	- 객체 생성 처리를 서브 클래스로 분리해 처리하도록 캡슐화하는 패턴
	
	(4) 프로토타입(Prototype)
	- 원본 객체를 복제하는 방법으로 객체를 생성하는 패턴
	
	(5) 싱글턴(Singleton)
	- 전역 변수를 사용하지 않고 '객체를 하나만 생성'하도록 하며, 생성된 객체를 어디에서든지 참조할 수 있도록 하는 패턴
	
	
	
	2. 구조(Structural) 패턴
	클래스나 객체를 조합해 더 큰 구조를 만드는 패턴으로 서로 다른 인터페이스를 지닌 2개의 객체를 묶어 단일 인터페이스를 제공하거나 객체들을 서로 묶어 새로운 기능을 제공한다.
	어댑터(Adapter), 브리지(Bridge), 컴퍼지트(Composite), 데코레이터(Decorator), 퍼사드(Facade), 플라이웨이트(Flyweight), 프록시(Proxy)
	
	(1) 어댑터(Adapter)
	- 호환성이 없는 클래스들의 인터페이스를 다른 클래스가 이용할 수 있도록 변환해주는 패턴
	
	(2) 브리지(Bridge)
	- 구현부에서 추상층을 분리하여 각자 독립적으로 변형할 수 있게 하는 패턴
	
	(3) 컴퍼지트(Composite)
	- 여러 개의 객체들로 구성된 복합 객체와 단일 객체를 클라이언트에서 구별 없이 다루게 해주는 패턴
	
	(4) 데코레이터(Decorator)
	- 객체의 결합을 통해 기능을 동적으로 유연하게 확장할 수 있게 해주는 패턴
	
	(5) 퍼사드(Facade)
	- 복잡한 서브 클래스들을 피해 더 상위에 인터페이스를 구성함으로써 서브 클래스들의 기능을 간편하게 사용하는 패턴
	
	(6) 플라이웨이트(Flyweight)
	- 인스턴스가 필요할 때마다 매번 생성하는 것이 아니고 가능한 한 공유해서 사용함으로써 메모리 절약하는 패턴
	
	(7) 프록시(Proxy)
	- 접근이 어려운 객체와 여기에 연결하려는 객체 사이에서 인터페이스 역할을 수행하는 패턴
	
	
	
	3. 행위(Behavioral) 패턴
	객체나 클래스 사이의 알고리즘이나 책임 분배에 관련된 패턴으로, 한 객체가 혼자 수행할 수 없는 작업을 여러 개의 객체로 어떻게 분배하는지와 동시에 객체 사이의 결합도를 최소화하는 것에 중점을 둔다.
	책임 연쇄(Chain of Respnsibility), 커맨드(Command), 인터프리터(Interpreter), 이터레이터(Iterator), 미디에이터(Mediator), 메멘토(Memento), 
	옵서버(Observer), 스테이트(State), 스트래티지(Strategy), 템플릿 메서드(Template Method), 비지터(Visitor)
	
	책임 연쇄(Chain of Respnsibility)
	- 요청을 처리할 수 있는 기회를 하나 이상의 객체에게 부여하여 요청을 보내는 객체와 그 요청을 받는 객체 사이의 결합을 피하는 패턴
	
	커맨드(Command)
	- 실행할 기능을 캡슐화 함으로써 여러 기능이 재사용될 수 있도록 클래스를 설계하는 패턴
	
	인터프리터(Interpreter)
	- 언어에 문법 표현을 정의하는 패턴
	 
	이터레이터(Iterator)
	- 자료 구조와 같이 접근이 잦은 객체에 대해 동일한 인터페이스를 사용하도록 하는 패턴
	 
	미디에이터(Mediator)
	- 수많은 객체들 간의 복잡한 상호작용을 캡슐화하여 객체로 정의하는 패턴
	
	메멘토(Memento)
	- 특정 시점에서의 객체 내부 상태를 객체화함으로써 이후 요청에 따라 객체를 해당 시점으로 돌릴 수 있는 패턴
	 
	옵서버(Observer)
	- 한 객체의 상태 변화에 따라 다른 객체의 상태도 연동되도록 일대다 객체 의존 관계를 구성하는 패턴
	
	스테이트(State) 
	- 객체의 상태에 따라 객체의 행위 내용을 변경해주는 패턴
	
	스트래티지(Strategy)
	- 동일 계열의 알고리즘군을 정의하고, 각각의 알고리즘을 캡슐화하며, 이들을 상호교환이 가능하도록 만드는 패턴
	
	템플릿 메서드(Template Method)
	- 상위 클래스에서 골격을 정의하고, 하위 클래스에서 세부 처리를 구체화하는 구조의 패턴
	
	비지터(Visitor)
	- 각 클래스들의 데이터 구조에서 처리 기능을 분리하여 별도의 클래스도 구성하는 패턴	
		
	
	
	
	*/
}
