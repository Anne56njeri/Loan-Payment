

		class Calculator{
			  // this is a basic calculator
			  // this is a constructor that is called when the instance of the class is created 
			  public Calculator(){
			    
			  }
			  //the first method which is add 
			  public int add(int a,int b){
			     
			     int sum = 0;
			    sum=a+b;
			    return sum;
			  }
			  // a method called subtract that takes in two arguements
			  public int subtract(int a,int b){
			   
			    int sub=0;
			    sub=a-b;
			    return sub;
			  }
			  
			  public int multiply(int a, int b){
			  
			    int mult=0;
			    mult=a*b;
			    return mult;
			  }
			  public int divide(int a, int b){
			    
			    int div=0;
			    if (b==0){
			      System.out.println("Error dividing by zero is not allowed");
			      return 0;
			    }
			    else{
			      
			    
			    div= a/b;
			      return div;
			    }
			  }
			    public int modulo(int a,int b){
			     
			      int modulo=0;
			      if(b==0){
			        System.out.println("Error!Dividing by zero is not allowed ");
			        return 0;
			      }
			      else{
			        modulo=a%b;
			        return modulo;
			      }
			    }
			  
			  public static void main(String[] args){
			    Calculator myCalculator=new Calculator();
			 
			    System.out.println(myCalculator.add(5,7));
			    System.out.println(myCalculator.subtract(45,11));
			  }
			}
	


