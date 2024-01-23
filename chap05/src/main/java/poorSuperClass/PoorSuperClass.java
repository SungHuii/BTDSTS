package poorSuperClass;

import java.util.Date;

public class PoorSuperClass {
	public static void main(String[] args) {
		
		Human student = new Student("김학생", new Date(2000, 01, 01),
				"20000101-1234567", "20190001");
		Human soldier = new Soldier("이군인", new Date(1998,12,31),
				"19981231-1234567","19-12345678");
		
		System.out.println(student.name);
		System.out.println(soldier.name);
		
//		System.out.println(student.birth);
//		System.out.println(soldier.birth); 사용 불가
		
		System.out.println(((Student)student).birth); // 캐스팅 필요
		System.out.println(((Soldier)soldier).birth); // 캐스팅 필요
		

	}

}
