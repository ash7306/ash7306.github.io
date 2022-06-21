import java.time.LocalDate;

interface LeafletHandler {
	String give();
}

// 위의 인터페이스를 구현하는 클래스를 작성. 추상메소드를 오버라이드 해야합니다.
// 구현 바디는 (전화번호 문자열 반환)
// 일수 광고 전단지 제공자
// 전화번호가 포함되어야함.
class LoanAD implements LeafletHandler {
	private String phone;
	
	public LoanAD(String phone) {
		super();
		this.phone = phone;
	}

	//문자열 하나 반환
	//그떄그때 다르게 주고싶으니까 폰넘버를 필드로 그다음 생성자
	@Override
	public String give() {
		
		return phone;
	}	
}
// 선거 광고 전단지 제공자
// 선거 날짜가 포함되어야함.

class VoteAD implements LeafletHandler {
	private LocalDate voteDate;
	
	public VoteAD(LocalDate voteDate) {
		this.voteDate = voteDate;
	}

	@Override
	public String give() {
		
		return voteDate.toString();
	}
}
// 광고대행사
// 일수광고/선거광고
// 두가지중에 하나의 방법
class Adcompany {
	LeafletHandler ad;
	// 광고 두가지를 하나로 묶은것
	public Adcompany() {
		
	}
	
	public Adcompany(LeafletHandler ad) {
		super();
		this.ad = ad;
	}

	public LeafletHandler getAd() {
		return ad;
	}

	public void setAd(LeafletHandler ad) {
		this.ad = ad;
	}
	
	public void consoleAD() {
		System.out.println(ad.give());
	}
}


public class Main {
	public static void main(String[] args) {
		Adcompany company = new Adcompany();
		
		company.setAd(new LoanAD("010-1111-2222"));
		company.consoleAD();
		
		company.setAd(new VoteAD(LocalDate.now()));
		company.consoleAD();
		//똑같은 광고를 하는데 투표날짜로 바뀜
		//똑같은 행동에 구현은 다르게
		
//		LeafletHandler h1 = new 일수광고();
//		String 전화번호가포함된일수광고 문자열 = h1.give(); 
//
//		LeafletHandler h2 = new 선거광고();
//		String 전화번호가포함된선거광고 문자열 = h2.give();
//		
//		광고대행사 p = new 광고대행사(일수광고);
//		p.광고() <<< 일수광고
//
//		p.set고객(선거광고);
//		p.광고() <<< 일수광고
		
		
	}
}
