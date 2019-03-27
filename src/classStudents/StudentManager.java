package classStudents;
import java.util.ArrayList;
public class StudentManager {

	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.addStudent("홍길동", 22, 20123487, "영극영화");
		studentManager.addStudent("홍길순", 24, 20106428, "수학과");
		studentManager.addStudent("이은경", 21, 20135788, "국문과");
		studentManager.addStudent("김철수", 23, 20114221, "체육과");
		studentManager.addStudent("김순희", 26, 20089883, "무용과");
		
		System.out.println(studentManager.students.get(0).getName());
		
}
	private void addStudent(String name, int age, int studentNum, String major) {
		// TODO Auto-generated method stub
		//students.add(new Student(name, age, studentNum, major));
		Student student =new Student(name,age,studentNum,major);
		students.add(student);
		System.out.println(name + " 학생 정보 입력 성공!!");
	}}