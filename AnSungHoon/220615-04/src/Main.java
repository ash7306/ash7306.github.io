import java.util.Arrays;

class Member implements Comparable<Member>{
	//implements Comparable 
	//대소비교를 할 수 있는 인터페이스
	//꺽새 <>(제네릭) 사이에 비교하고자 하는 대상 type
	//object로 받는거 보다 member로 받는것이 안전함
	
	String name;
	int height;
	int weight;

// 키를 기준으로
//	public ??? 비교(Member member){
//		return "내가더큼"
//				return "쟤가 큼"
//						return "똑같음"
//	}
	
//	<Member>사용전
//	@Override
//	public int compareTo(Object o) {		
//		return 0;
//	}

//	<Member>사용후
// 자바 1.2버전에 만들어 놓은 인터페이스
	@Override
	public int compareTo(Member o) {		
		return this.height - o.height;
	}

	public int compare(Member member) {
//		if (this.height > member.height) {
//			양수
//		} else if (this.height < member.height)
//			음수
		return height - member.height;
	}
	
	public Member(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (height != other.height)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
}

public class Main {
	public static void main(String[] args) {
		Member[] members = {new Member("키큰놈", 190 , 60)
				, new Member("키작은놈", 130, 30)
				, new Member("중간놈", 170, 60)
		};
		System.out.println(members[0].compareTo(members[1]));
		//배열의 오름차순 메소드
		Arrays.sort(members);
		System.out.println(members[0].height);
		System.out.println(members[1].height);
		System.out.println(members[2].height);
	}
}
