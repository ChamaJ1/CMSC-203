
public class PatientDriverApp {

	static double totalCharges =0;
	public static void main(String [] args)
	{
		displayPatient();
		displayProcedure();
		calculateTotalCharges();
		System.out.println("Student: Chama Jagodige");
		System.out.println("M#: 21165139");
		System.out.println("Due Date: 9/30/24");
		
	}
	public static void displayPatient() //displays patients info
	{
		System.out.println("Patient Info: ");
		//created two objects since I cant put a constructor into one object without deleting the memory of some of the info
		Patient patientName = new Patient("Steve", "Earl", "Roberts");
		Patient patientInfo = new Patient("1234 Woodfield Dr", "Rockville", "MD", 20877, "Lisa Roberts", "2401235678") ;
		System.out.println(patientName.toString('y', 'n')); //prints certain info, used to get around having two objects
		System.out.println(patientInfo.toString('n', 'y'));//prints certain info, used to get around having two objects
		
	}
	public static void displayProcedure()
	{
		
		System.out.println();
		Procedure procedureName1 = new Procedure("Physical Exam", "9/27/24");
		Procedure procedureInfo1 = new Procedure("Dr. Jenkins", 1052.62);
		
		totalCharges += procedureInfo1.getCharges();
		System.out.println(procedureName1.toString('y','n'));//prints certain info, used to get around having two objects
		System.out.println(procedureInfo1.toString('n','y'));
		System.out.println();
		Procedure procedureName2 = new Procedure("Surgery", "9/15/24");
		Procedure procedureInfo2 = new Procedure("Dr. Hopper", 6782.72);
		totalCharges += procedureInfo2.getCharges();
		System.out.println(procedureName2.toString('y','n'));//prints certain info, used to get around having two objects
		System.out.println(procedureInfo2.toString('n','y'));
		System.out.println();
		Procedure procedureName3 = new Procedure("X-Ray", "9/14/24");
		Procedure procedureInfo3 = new Procedure("Dr. Hopper",4372.82 );
		totalCharges += procedureInfo3.getCharges();
		System.out.println(procedureName3.toString('y','n'));//prints certain info, used to get around having two objects
		System.out.println(procedureInfo3.toString('n','y'));

	}
	
	public static void calculateTotalCharges()
	{
		System.out.println();
		System.out.print("Total Charges: " + String.format("%,.2f", totalCharges)); //formated to have comma and 2 decimals
	}
}
