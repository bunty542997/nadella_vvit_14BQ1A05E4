import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
             if(students.length()==0)
		return null;
             else
                return students;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException{
		// Add your implementation here
          
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException{
		// Add your implementation here
             if(students[index]==0)
		return null;
             else
                return students[index];
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalargumentException{
		// Add your implementation here
             students[index]=student;
	}

	@Override
	public void addFirst(Student student) throws IllegalArgumentException{
		// Add your implementation here
             for(int i=0;i<students.length();i++)
                students[i+1]=students[i];
             students[0]=student;   
          
	}

	@Override
	public void addLast(Student student) throws IllegalArgumentException{
		// Add your implementation here
            students[length+1]=student;
	}

	@Override
	public void add(Student student, int index) throws IllegalArgumentException {
		// Add your implementation here
          if(index=0 || index>students.length());
          else
          {
            for(i=length;i>index;i--)
             students[i+1]=students[i];
            students[++index]=student;
	 }
       }

	@Override
	public void remove(int index) throws IllegalArgumentException {
		// Add your implementation here
            for(int i=index;i<=length;i++)
                students[i+1]=students[i];
	}

	@Override
	public void remove(Student student) throws IllegalArgumentException{
		// Add your implementation here
          try
          {
             if(student==null)
               return;
	   }
          catch{
           System.out.println("Student not exists");
          }
          for(int i=0;i<length;i++)
          {
             if(students[i]==student)
             {
               for(int j=i+1;j<length;j++)
                 students[i]=students[j];
     }

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
                
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) throws IllegalArgumentException{
		// Add your implementation here
        for(int i=index,j=index;i<length,j>=0;i++,j--)
        {
             students[index-j]=students[i];
	}
     }

	@Override
	public void removeToElement(Student student) throws IllegalArgumentException{
		// Add your implementation here
            for(int i=0;i<length;i++)
          {
             if(students[i]==student)
             {
               for(int i=index,j=index;i<length,j>=0;i++,j--)
            {
             students[index-j]=students[i];
	     }
	    }
           }
         }

	@Override
	public void bubbleSort() {
		// Add your implementation here
          for(int i=0;i<students.length();i++)
          {
            for(int j=i+1;j<students.length();i++)
            {
               if(students[i]>students[j])
               {
                 Student temp=students[i];
                 students[i]=students[j];
                 students[j]=temp;         
               }
	}
      }

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
