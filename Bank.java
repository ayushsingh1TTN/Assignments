public class Bank {
    private String  Name, headofficeAddress, chairmanName;
    private int branchCount;
    private double fdInterestRate, personalLoanInterestRate, homeLoanInterestRate;

    Bank(String Name, String headofficeAddress, String chairmanName, int branchCount, double fdInterestRate,
                double personalLoanInterestRate, double homeLoanInterestRate){
        this.Name=Name;
        this.headofficeAddress=headofficeAddress;
        this.chairmanName=chairmanName;
        this.branchCount=branchCount;
        this.fdInterestRate=fdInterestRate;
        this.personalLoanInterestRate=personalLoanInterestRate;
        this.headofficeAddress=headofficeAddress;
    }
    public String toString(){
        return "Name: "+Name+"  Head Office Address: "+headofficeAddress+"  Chairman Name: "+chairmanName+"  Branch Count: "
                +branchCount+"  FD Interest Rate: "+fdInterestRate+"  Person Loan Interest Rate: "+personalLoanInterestRate
                +"  Home Loan Interest Rate: "+homeLoanInterestRate;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHeadofficeAddress() {
        return headofficeAddress;
    }

    public void setHeadofficeAddress(String headofficeAddress) {
        this.headofficeAddress = headofficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    public static void main(String arg[]){
        SBI sbi = new SBI("Arjun", "Noida", "Suresh", 2,
                5.8, 8.1, 6.2);
        System.out.println(sbi.toString());
        BOI boi = new BOI("Rohit", "Delhi", "Arjun", 2,
                5.8, 8.1, 6.2);
        System.out.println(boi.toString());
        ICICI icici = new ICICI("Ujjwal", "Dwarka", "Rohit", 2,
                5.8, 8.1, 6.2);
        System.out.println(icici.toString());
    }


}

class SBI extends Bank{

    public SBI(String Name, String headofficeAddress, String chairmanName, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }
}

class BOI extends Bank{

    public BOI(String Name, String headofficeAddress, String chairmanName, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }
}

class ICICI extends Bank{


    public ICICI(String Name, String headofficeAddress, String chairmanName, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }
}

