package advance.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student std1 = new Student("Tín", 20, "Huế", "1234567890", 8.5);

	        try {
	            Student std2 = (Student) std1.clone();
	            System.out.println("std1: " + std1);
	            System.out.println("std2: " + std2);
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	    }

}
