public class EmpWageUC9 {

	public static final int IS_FULL_TIME=1;
   public static final int IS_PART_TIME=2;

	private final String CompanyName;
	private final int EmpRate;
	private final int NumberOfWorkingDays;
	private final int NumberOfWorkingHours;

		public EmpWageUC9(String CompanyName,int EmpRate,int NumberOfWorkingDays,int NumberOfWorkingHours) {
			this.CompanyName=CompanyName;
			this.EmpRate=EmpRate;
			this.NumberOfWorkingDays=NumberOfWorkingDays;
			this.NumberOfWorkingHours=NumberOfWorkingHours;
		}
		public void computeWages(){
			int EmpHours=0;
			int Salary=0;
			int TotalWage=0;
			int TotalHours=0;
			int TotalDays=0;

			while(TotalDays<=NumberOfWorkingDays || TotalHours<=NumberOfWorkingHours) {
				TotalDays++;
      		int EmpCheck= (int)( Math.random()*2+1);

				if(EmpCheck==IS_FULL_TIME) {
					EmpHours=8;
					}
				else if(EmpCheck==IS_PART_TIME) {
					EmpHours=4;
					}
				else {
					EmpHours=0;
					}

				TotalHours+=EmpHours;
				Salary=EmpRate*EmpHours;
				TotalWage+=Salary;
			}
      	System.out.println("Employe is in : "+CompanyName+",Total Salary : "+TotalWage);
      }

		public static void main(String[] args) {
			System.out.println("Welcome Employee "+ "\n");
			EmpWageUC9 companyA=new EmpWageUC9("Company-A", 20,5,10);
			EmpWageUC9 companyB=new EmpWageUC9("Company-B", 25,10,20);
			companyA.computeWages();
			companyB.computeWages();
	}
}
