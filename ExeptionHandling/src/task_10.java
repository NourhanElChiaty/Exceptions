import javax.swing.JOptionPane;

public class task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean complete=true;
		while(complete) {
			complete=false;
			
       String userCountString = JOptionPane.showInputDialog(null, "How many Students?");
       try {
		int userCount=Integer.parseInt(userCountString);
		Student [] students=new Student[userCount];
		for(int i=0;i<students.length;i++) {
			String name =JOptionPane.showInputDialog(null, "Enter name");
			String email=JOptionPane.showInputDialog(null, "Enter Email");
			String mobile=JOptionPane.showInputDialog(null, "Enter phoneNumber");
			String gradesCountString=JOptionPane.showInputDialog(null, "How many grades?");
			
			Student student =new Student(name, email, mobile);
			
		  
			int gradesCount = Integer.parseInt(gradesCountString);
			Grades []grades = new Grades[5];
			for(int j=0;j<5;i++) {
				
				String subject =JOptionPane.showInputDialog(null, "Enter subject name");
				String markString =JOptionPane.showInputDialog(null, "Enter grade");
				double mark = Double.parseDouble(markString);
				Grades grade = new Grades(mark, subject);
				grades[j]=grade;
				
				
			}
			
		student.setGrades(grades);
		students[i]=student;
		
       }
		}
		
       catch (NumberFormatException e ) {
    	
    	   JOptionPane.showMessageDialog(null, "please enter a numeric valid value");
    	 //  System.exit(0);
    	   complete=true;
    	   
       }
       catch (NullPointerException e ) {
       	
    	   JOptionPane.showMessageDialog(null, "please enter a value");
    	 //  System.exit(0);
    	   
       }
	
	}

	
}
}

