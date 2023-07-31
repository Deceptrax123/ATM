import java.io.*;
import java.util.*;
class ATM
{
    double withdraw;
    int pin;double balance=0,balance1=0;int found=0;double total1=0.0,total2=0.0;double transfer;
    double z=Math.random();
    double m=z*10000;
    int deposited=(int)m;
    
    double k=Math.random();
    double n=k*100000;
    int deposited1=(int)n;

    public  void identification()
    {
        System.out.println("                                                   ATM                                                                              ");
        
        System.out.println();
        System.out.println("Insert FIREBREATHERS Debit/Credit  Card");
        
        System.out.println();
        int x;
        Scanner ob=new Scanner(System.in);
        
        do
        {
        System.out.println("Enter Personal Identification Code");
         x=ob.nextInt();
        if(x<1000||x>9999)
        {
            System.out.println("Invalid PIN entered");
            System.out.println();
        }
        else
        {
            System.out.println();
        }
        
    }while(x<1000||x>9999);
        System.out.println();
        System.out.println("                 Current Balance                    ");
        System.out.println("Basic Checkings account- "+deposited1);
        System.out.println("Savings Account        - "+deposited);
        System.out.println("PIN code               - XXXX");
        System.out.println();
    }
    
    public void Action()throws IOException
    {
        Scanner ob=new Scanner(System.in);
        int opt;
        
       do
       {
        System.out.println("Select an option from the main menu screen");
        System.out.println();
        System.out.println("    Option no                  Action"                       );
        System.out.println("        1                   Withdrawal");
        System.out.println("        2                   Account balance");
        System.out.println("        3                   Account tranfer");
        System.out.println("        4                       Exit       ");
        opt=ob.nextInt();
        System.out.println("\f");
       switch(opt)
       {
           case 1:System.out.println("Choose an account that you would like to withdraw from");           
                  System.out.println("1- Basic_Checkings_Account");
                  System.out.println("2- Savings_Account");
                  
                  System.out.println();
                  System.out.println("Enter account type(Not case sensitive)");
                  String opt1=ob.next();
                  if(opt1.equalsIgnoreCase("Basic_Checkings_Account")||opt1.equalsIgnoreCase("Savings_Account"))
                  {
                  System.out.println();
                  System.out.println("You have chosen to withdraw from "+opt1);
                  System.out.println();
                  System.out.println("Choose either of the 2 options to withdraw cash");
                  System.out.println();
                  System.out.println("Option no             Action");
                  System.out.println("   1                 Enter desired amount");
                  System.out.println("   2                 Select the amount from the menu");
                  System.out.println();
                  System.out.println("Enter either 1 or 2");
                  System.out.println();
                  int method=ob.nextInt();
                  
                  int standard=0;
                  
                  switch(method)
                  {
                      case 1:    if(opt1.equalsIgnoreCase("Basic_Checkings_Account"))
                                 {
                                      standard=deposited1;
                                                 }
                                         else if(opt1.equalsIgnoreCase("Savings_Account"))
                                               {
                                                 standard=deposited;
                                              }
                              System.out.println("Withdrawal of more than 1200 is not possible");
                              System.out.println("Withdrawl amount must be divisible by 20");
                              System.out.println();
                              System.out.println("Enter the withdrawal amount");
                              
                              
                              withdraw=ob.nextDouble();
                              
                              System.out.println();
                              if(withdraw%20==0&&withdraw<=standard&&withdraw<=1200)
                              {
                                
                                 if(balance==0)
                                 {
                                    if(transfer<withdraw)
                                    {
                                        balance=standard+(transfer-withdraw);
                                    }
                                    else if(transfer>withdraw)
                                    {
                                        balance=standard-(withdraw-transfer);
                                    }
                                    System.out.println("Balance- "+balance);
                                }
                                else if(balance>0)
                                {
                                    if(transfer<withdraw)
                                    {
                                        balance=standard+(transfer-withdraw);
                                    }
                                    else if(transfer>withdraw)
                                    {
                                        balance=standard-(withdraw-transfer);
                                    }
                                    System.out.println("Balance- "+balance);
                                }
                                
                            
                              
                                
                                
                              System.out.println("Enter Yes if you want a reciept,if not then enter No");
                              System.out.println();
                              String rec=ob.next();
                              System.out.println();
                              if(rec.equalsIgnoreCase("yes"))
                              {
                                  System.out.println("        Receipt            ");
                                  System.out.println("Account type number - "+opt1);
                                  System.out.println("Amount withdrawn    - "+withdraw);
                                  System.out.println("Balance             - "+balance);
                                  System.out.println();
                                }
                                else
                                {
                                    System.out.println();     
                                }
                            }
                            else
                            {
                                System.out.println("Invalid entry");
                                System.out.println();
                                System.out.println("Reasons for invalid entry could be:-");
                                System.out.println("1-Withdraw amount is not divisible by 20");
                                System.out.println("2-Withdraw amount is greater than balance amount");
                                System.out.println("3-Withdraw amount is greater than 1200");
                                System.out.println();
                            }
                        
                        
                              break;
                                
                      case 2: int standard1=0;
                               if(opt1.equalsIgnoreCase("Savings_Account"))
                               {
                                   standard1=deposited;
                                }
                                else if(opt1.equalsIgnoreCase("Basic_Checkings_Account"))
                                {
                                    standard1=deposited1;
                                }
                              int ar[]={20,40,60,80,100,200,300,400,500};
                              
                              int l=ar.length;
                              for( int x=0;x<l;x++)
                              {
                                  System.out.print(ar[x]+" , ");
                              }
                              System.out.println();
                              System.out.println("Enter a value from the above option");
                              withdraw=ob.nextDouble();
                              System.out.println();
                              if(withdraw<=standard1)
                              {
                              for(int x=0;x<l;x++)
                              {
                                  if(withdraw==ar[x])
                                  {
                                      found=1;
                                      break;
                                  }
                               }
                              if(found==1)
                              {
                                  
                                  if(opt1.equalsIgnoreCase("Savings_Account"))
                                  {
                                      balance=standard1+(transfer-withdraw);
                                      System.out.println("Balance- "+balance);
                                      System.out.println();
                                    }
                                    else if(opt1.equalsIgnoreCase("Basic_Checkings_Account"))
                                    {
                                        balance1=standard1+(transfer-withdraw);
                                        System.out.println("Balance- "+balance1);
                                        System.out.println();
                                    }
                                  System.out.println("Enter Yes if you want a reciept,if not then enter No");
                              
                              String rec1=ob.next();
                              System.out.println("\f");
                              if(rec1.equalsIgnoreCase("yes"))
                              {
                                  System.out.println("         Receipt             ");
                                  System.out.println("Account type number - "+opt1);
                                  System.out.println("Amount withdrawn    - "+withdraw);
                                  System.out.println();
                                  
                                }
                                else
                                {
                                    System.out.println();     
                                }
                              }
                              else if(found!=1)
                              {
                                  System.out.println();
                                  System.out.println("Invalid entry");
                                  System.out.println();
                              
                            }
                            
                        }
                        
                        break;
                    }
                }
                 else
                 {
                     System.out.println("Invalid entry-Enter the correct account type/name");
                }
                break;
                
           case 2:  System.out.println("Choose an account that you would like to check balance of ");
                    System.out.println();
                    System.out.println(" Option                Account type");
                    System.out.println("   1                  Basic_Checkings_Account");                    
                    System.out.println("   2                  Savings_Account");
                    System.out.println();
                    System.out.println("Enter type of account(Not case sensitive)");
                    String acc_type=ob.next();
                    System.out.println();
                    System.out.println("You have chosen account - "+acc_type);
                    System.out.println();
                    if(acc_type.equalsIgnoreCase("Savings_Account")||acc_type.equalsIgnoreCase("Basic_Checkings_Account"))
                    {
                    if(acc_type.equalsIgnoreCase("Savings_Account"))
                     {
                        if(balance==0)
                        {
                            if(transfer<withdraw)
                            {
                            balance=deposited+(transfer-withdraw);
                            }
                            else if(withdraw<transfer)
                            {
                                balance=deposited-(withdraw-transfer);
                            }
                            else if(withdraw==0||transfer==0)
                            {
                                balance=deposited;
                            }
                            System.out.println("Balance- "+balance);
                        }
                        else if(balance>0)
                        {
                            if(transfer<withdraw)
                            {
                            balance=balance+(transfer-withdraw);
                            }
                            else if(transfer>withdraw)
                            {
                                balance=balance-(withdraw-transfer);
                            }
                            else if(withdraw==0||transfer==0)
                            {
                                balance=deposited;
                            }
                            System.out.println("Balance-"+balance);
                        }
                    }
                        else if(acc_type.equalsIgnoreCase("Basic_Checkings_Account"))
                        {
                            if(balance==0)
                            {
                                if(transfer<withdraw)
                                {
                                    balance=deposited1+(transfer-withdraw);
                                }
                                else if(transfer>withdraw)
                                {
                                    balance=deposited1-(withdraw-transfer); 
                                }
                                else if(transfer==0||withdraw==0)
                                {
                                    balance=deposited1;
                                }
                                System.out.println("Balance- "+balance);
                            }
                            else if(balance>0)
                            {
                                if(transfer<withdraw)
                                {
                                    balance=balance+(transfer-withdraw);
                                }
                                else if(transfer>withdraw)
                                {
                                    balance=balance-(withdraw-transfer);
                                }
                                else if(transfer==0||withdraw==0)
                                {
                                    balance=deposited1;
                                    }
                                System.out.println("Balance amount- "+balance);
                            }
                        
                        
                            
                            
                        }
                        else
                        {
                            System.out.println("Invalid entry");                            
                            System.out.println("Account type must be appropiate");
                        }
                    System.out.println();
                    System.out.println("Enter Yes if you want a receipt or enter No");
                    
                    String receipt1=ob.next();
                    
                    System.out.println("\f");
                    if(receipt1.equalsIgnoreCase("yes"))
                    {
                        System.out.println("           Receipt       ");
                        System.out.println("Account type - " +acc_type);
                        System.out.println("Balance      - "+balance);
                        System.out.println();
                    }
                    else
                    {
                        System.out.println();
                    }
                }
                else
                {
                    System.out.println("Invalid entry-Enter appropiate account type/name");
                    System.out.println();
                }
                break;
                
           case 3: System.out.println("Choose an account that you would like to tranfer money from");
                   System.out.println();
                   System.out.println(" Option                Account type");
                   System.out.println("   1                  Basic_Checkings_Account");                    
                   System.out.println("   2                  Savings_Account");
                   System.out.println();
                   System.out.println("Enter type of account(Not case sensitive)");
                   
                   String acc_type1=ob.next();
                   System.out.println();
                   if(acc_type1.equalsIgnoreCase("Savings_Account")||acc_type1.equalsIgnoreCase("Basic_Checkings_Account"))
                   {
                   if(acc_type1.equalsIgnoreCase("Basic_Checkings_Account"))
                   { 
                       System.out.println("You are transferring money to Savings account");
                       
                   }
                   else if(acc_type1.equalsIgnoreCase("Savings_Account"))
                   {
                       System.out.println("You are transferring money to Basic Checkings Account");
                   }
                   
                   System.out.println();
                   System.out.println("Enter the amount to be transferred");
                   transfer=ob.nextDouble();
                   System.out.println();
                   
                   if(acc_type1.equalsIgnoreCase("Basic_Checkings_Account")&&transfer<=deposited1||transfer<=balance)
                   {
                     
                     if(balance==0)
                     {
                         total1=transfer+deposited;
                     }
                     else
                     {
                         total1=transfer+balance;
                        }
                     System.out.println("Total amount in Savings account- "+total1);
                    }
                    else if(acc_type1.equalsIgnoreCase("Savings_Account")&&transfer<=deposited||transfer<=balance)
                    {
                        if(balance==0)
                        {
                            total2=transfer+deposited1;
                        }
                        else
                        {
                            total2=transfer+balance;
                        }
                        System.out.println("Total amount in Basic_Checkings_Account- "+total2);
                    }
                    else
                    {
                        System.out.println("Invalid entry");
                        System.out.println("Not enough money in account");
                        transfer=0;
                    }
                   System.out.println();
                   System.out.println("Enter Yes if you want a receipt ,if not enter No");
                   String rec3=ob.next();
                   System.out.println("\f");
                   if(rec3.equalsIgnoreCase("yes"))
                   {
                       System.out.println("          Receipt       ");
                       System.out.println("Account type- "+acc_type1);
                       System.out.println("Money Tranfered- "+transfer);
                       System.out.println();
                    }
                    else
                    {
                        System.out.println();
                    }
                }
                else
                {
                    System.out.println("Invalid entry-Enter appropiate account name/type");
                    System.out.println();
                }
                break;
           
           case 4:System.out.println("                                Thank You for using FIREBREATHERS ATM                                ");
                  System.out.println("                                    Please Visit Again!!!                                     ");
                  break;
                  
           default :System.out.println("Invalid entry"); 
                    System.out.println();
                    System.out.println("\f");
        }
    }while(opt!=4);
    }
}

class project
{
    public static void main(String args[])throws IOException
    {
        ATM obj=new ATM();
        obj.identification();
        obj.Action();   
    }
}