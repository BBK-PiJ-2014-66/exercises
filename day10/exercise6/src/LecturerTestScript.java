/**
 * simple script to test lecturer
 */
public class LecturerTestScript {

	public static void main(String[] args) {
		Lecturer wilt = new Lecturer("Henry Wilt");
		System.out.println("Created a new lecturer: " + wilt.getName());
		wilt.teach("English literature");
		wilt.doResearch("not a lot at Fenland College!");
	}

}
