package lsp;

public class LecturerWithWork extends Lecturer{
	public LecturerWithWork() {
		lecturer = "야간 강사";
	}
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("강사료 :" + charge*1/2 + "원\n");
	} 
}
