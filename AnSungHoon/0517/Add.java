//60p Add.java 타이핑

public class Add {
    public static void main(String args[]) {
			//변수 이름은 영소문자로 시작, 숫자도 올수 있다
	int x;		//첫 번째 정수를 저장할 변수를 선언(variable declare)
	int y;		//두 번째 정수를 저장할 변수를 선언(variable declare)
	int sum;	//두 정수의 합을 저장하는 변수

			// 초기화 (initialize) 
	x = 100;	//= 대입연산자 (assignment):오른쪽에 있는것을 왼쪽에 대입(복사하듯이 집어넣음,잘라내기x)
	y = 200;	
	sum = x + y;	//+ 연산자가 먼저 일어나고 x박스의 값을 가져오고 y값도 가져와서 오른쪽에 연산값 300이 일어나고
			//sum 박스에 집어 넣게 된다.
	System.out.println(sum);//출력 메소드
	//return; 메인 메소드의 종료를 뜻함 ,}중괄호를 만나도 똑같이 종료를 뜻함
        //System.out.println(sum)?? : return 밑에다 적으면 에러가 남, 이미 종료가 되어서 출력안됨
	
	System.out.println(x - y);
	//한번 계산하고 다시 쓰지 않을경우는 굳이 통에 담지 않고 쓸 때

	int minus;
	minus = x - y;

	System.out.println(minus);
	//내가 두고두고 놔두다가 보고싶다면 변수를 선언하고 결과값을 저장해서 사용
    }
}