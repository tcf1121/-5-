# -5-
객체지향 설계 5원칙에 대한 예제입니다.

1. 단일 책임 원칙은
SuperMarket 클래스에 Payment와 MonetCharge까지 넣기 보다는
셋으로 나누는 것을 의미합니다.
https://github.com/tcf1121/-5-/blob/main/srp.png

2. 개방 폐쇄 원칙
HelloAnimal 클래스는 폐쇄되어 있고, Animal 클래스는 개방되어있다.
Animal 클래스를 Dog와 Cat으로 확장하였다.
https://github.com/tcf1121/-5-/blob/main/ocp.png

3. 리스코프 교체 원칙
Lecturer 클래스의 객체가 자신의 하위 클래스인
LecturerNomal, LecturerNight, LecturerAtGS, LecturerWithWork의 객체로 교체할 수 있음을 볼 수 있다.
https://github.com/tcf1121/-5-/blob/main/lsp.png

4. 의존 관계 역전 원칙
GameServer클래스를 GameServer와 Games 클래스로 나누어 Games라는 추상 클래스에 의존하도록 설계를 한다.
https://github.com/tcf1121/-5-/blob/main/dip.png

5. 인터페이스 분리 원칙
S23 인터페이스를 만들어서 따로따로 IPhone, Biometricable, WirelessChargable, ARable 인터페이스에
필요한 객체를 주면 낭비하게 되는 객체가 많이 생기기 때문에 그렇게 하는 것이 아닌,
IPhone, Biometricable, WirelessChargable, ARable 인터페이스를 먼저 만들어 각자 필요한 객체를 생성한 후
S23 인터페이스에 넣었다.
https://github.com/tcf1121/-5-/blob/main/isp.png
