public class CarLoan {
	public static void main(String[] args) {
    // we create variables to store the data 
    int carLoan=10000;
    int loanLength=3;
    double intersetRate=0.05;
    int downPayment=2000;
    if (loanLength <=0 && intersetRate <=0){
      System.out.println("Error!You must take out a valid car loan");
    }
   else if (downPayment >= carLoan){
     System.out.println("The car can be paid in full");
   }
    else {
      int remainingBalance=carLoan - downPayment;
       int months=loanLength*12;
      int monthlyBalance=remainingBalance/months;
      double interset=monthlyBalance*intersetRate;
      double monthlyPayment=monthlyBalance + interset;
      System.out.println(monthlyPayment);
      
    }
	}
}
