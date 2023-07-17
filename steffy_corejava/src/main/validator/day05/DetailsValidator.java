package day05;


public class DetailsValidator {

	public static boolean validate(Details details) throws IllegalArgumentException {

		if (details == null) {
			throw new IllegalArgumentException("Argument is " + "NULL");
		}
		   validatedeptName(details.getDeptName());
	        validatedeptId(details.getDeptId());

		
		return true;

	}

   public static boolean validatedeptName(String deptName) throws IllegalArgumentException{
	   if(deptName==null || deptName.isEmpty() || deptName.length() <= 2) {
		   throw new IllegalArgumentException("Department name cannot be null and it should have a length greater than 2");
		} else {
			return true;
		}
	   }
   

   public static boolean validatedeptId(int deptId) throws IllegalArgumentException{
	   if (deptId <= 0) {
		    throw new IllegalArgumentException("Department ID should be a positive value");
       }
        return true;
   }
} 
	   

