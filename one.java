//import Scanner
import java.util.Scanner;

public class WorkerBioData{
    String FirstName;
    String LastName;
    String NextOfKin;
    String YearOfBirth;
    String ResidentialAddress;

    private int GrossPay=100000;
    //Caculate Percent
    private calculcatePercent(int percent){
            return (percent/10);
    }
    //calculate Tax
     private int calculcateTax(){
         int percent=calculcatePercent(25);
        return(percent/100 * this.GrossPay);
    }
    //Caculate Pension Contribution
    private int CalculatePensionContribution(){
            int percent calculcatePercent(75);
            return (percent/100 * this.GrossPay);
    }
    //Caculate Health INsurance
        private int CalculateHealthInsurance(){
        int percent=calculcatePercent(5);
        return (percent*this.GrossPay);
    }
    //Caculate Housing Contribution
    private int CalculateHousingContribution(){
        int percent=calculcatePercent(5);
        return (percent*this.GrossPay);
    }
    //Caculate Net PAy
    public int CaculateNetPay(){
        int tax=calculcateTax();
        int HousingContribution=CalculateHousingContribution();
        int PensionDistribution=CalculatePensionContribution();
        int HealthInsurance=CalculateHealthInsurance();
        int netpay=GrossPay-(tax+HousingContribution+HealthInsurance+PensionDistribution);
        return netpay;
    }
    //CaCulate Retirement Year
    public int CaculateYearOfRetirement(){
        //convert string in date to integer by extracting the year only
        String[] parts = YearOfBirth.split("/");
        int foo = Integer.parseInt(parts[2]);
        return(65+foo) ;
    }

}
public class GetUserData{

    public static void main(String[] args) {
        //instantiate Class by creating new Object
        WorkerBioData NewEmployee=new WorkerBioData();

        // Create scanner object/variable
        Scanner sc = new Scanner(System.in);
        //get First Name
        System.out.println("Enter First Name: ");
        NewEmployee.FirstName = sc.nextString();
        //get Last Name
        System.out.println("Enter Last Name: ");
        NewEmployee.LastName = sc.nextString();

        //get DOB
        System.out.println("Enter year of Birth (dd/mm/yy): ");
        NewEmployee.LastName = sc.nextString();
        //get next of Kin
        System.out.println("Enter Next Of Kin: ");
        NewEmployee.NextOfKin = sc.nextString();
            //get Residential Address
        System.out.println("Enter Residential Address ");
        NewEmployee.ResidentialAddress = sc.nextString();

            //print Out Save Data
        System.out.println("FullName:"+ NewEmployee.FirstName+" " NewEmployee.LastName);
        System.out.println("DOB:"+ NewEmployee.YearOfBirth);
        System.out.println("NextOfkin:"+ NewEmployee.NextOfKin);
        System.out.println("Residential Address:"+ NewEmployee.ResidentialAddress);
        System.out.println("YOur Retirement Age:"+ NewEmployee.CaculateYearOfRetirement());
        System.out.println("Your Net Pay is:"+ NewEmployee.CaculateNetPay());

        
    }


}