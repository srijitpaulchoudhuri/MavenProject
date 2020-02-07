package com.srijit.maven.NewProject;

/**
 * Hello world!
 *
 */
import java.util.*;
abstract class chocolate
{
  public double weight,price;
  
    
  chocolate(double weight,double price)
  {
      this.weight=weight;
      this.price=price;
  }
  abstract double get_weight();
  
  abstract double get_price();
  
 
  
    
}
abstract class candy
{
  public double weight,price;
  
    
    
  candy(double weight,double price)
  {
      this.weight=weight;
      this.price=price;
  }
  abstract double get_weight();
  
  abstract double get_price();
}

class kitkat extends chocolate
{
   
   
   kitkat()
   {
     super(12.5,17);
   }
   
   double get_weight()
   {
     return weight;
   }
   double get_price()
   {
     return price;
   }
  
   
   
}
class munch extends chocolate
{
   
    
   munch()
   {
     super(13.6,15);
   }
   
   double get_weight()
   {
     return weight;
   }
   double get_price()
   {
     return price;
   }
}
class dairymilk extends chocolate
{
   
    
   dairymilk()
   {
     super(25,20);
   }
   
   double get_weight()
   {
     return weight;
   }
   double get_price()
   {
     return price;
   }
}
class silk extends chocolate
{
   
    
   silk()
   {
     super(25,30);
   }
   
   double get_weight()
   {
     return weight;
   }
   double get_price()
   {
     return price;
   }
}
class candyman extends candy
{
   candyman()
   {
     super(0.5,2);
   }
   
   double get_weight()
   {
     return weight;
   }
   double get_price()
   {
     return price;
   }
}
class mangobite extends candy
{
   mangobite()
   {
     super(0.5,1);
   }
   
   double get_weight()
   {
     return weight;
   }
   double get_price()
   {
     return price;
   }
}
class alphenlibe extends candy
{
   alphenlibe()
   {
     super(0.5,1);
   }
   
   double get_weight()
   {
     return weight;
   }
   double get_price()
   {
     return price;
   }
}

public class App 
{
    public static void main( String[] args )
    {
      Scanner n=new Scanner(System.in);
        
        chocolate c;
        candy ca;
        
        System.out.println("Press 1 for chocolate only ");
        System.out.println("Press 2 for candy only ");
        System.out.println("Press 3 for both ");
        int c1=n.nextInt();
        switch(c1)
        {
            case 1:
                System.out.println("Enter your price upper limit");
                double u=n.nextDouble();
                System.out.println("Enter your price lower limit");
                double l=n.nextDouble();
                
                c=new kitkat();
                double p=c.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("Kitkat : " +p);
                }
                c=new munch();
                p=c.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("Munch : " + p);
                }
                c=new dairymilk();
                p=c.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("DairyMilk : " + p);
                }
                c=new silk();
                p=c.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("silk : " + p);
                }
                break;
            case 2:
                System.out.println("Enter your price upper limit");
                  u=n.nextDouble();
                System.out.println("Enter your price lower limit");
                  l=n.nextDouble();
                
                ca=new candyman();
                p=ca.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("Candyman : " +p);
                }
                ca=new mangobite();
                p=ca.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("Mangobite : " + p);
                }
                ca=new alphenlibe();
                p=ca.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("Alphenlibe : " + p);
                }
               
                break;
            case 3:
                System.out.println("Enter your price upper limit");
                   u=n.nextDouble();
                System.out.println("Enter your price lower limit");
                   l=n.nextDouble();
                
                c=new kitkat();
                p=c.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("Kitkat : " +p);
                }
                c=new munch();
                p=c.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("Munch : " + p);
                }
                c=new dairymilk();
                p=c.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("DairyMilk : " + p);
                }
                c=new silk();
                p=c.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("silk : " + p);
                }
                
                ca=new candyman();
                p=ca.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("Candyman : " +p);
                }
                ca=new mangobite();
                p=ca.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("Mangobite : " + p);
                }
                ca=new alphenlibe();
                p=ca.get_price();
                if(l<=p && p<=u)
                {
                    System.out.println("Alphenlibe : " + p);
                }
                break;
           }
              
                
                
                double total_price=0.0,total_weight=0.0;
                while(true)
                {
                    
                System.out.println("Enter the name of product you want to add");
                System.out.println("Press 0 when done");
                    
                String s=n.nextLine();
                switch(s)    
                {
                    case "kitkat":
                      c=new kitkat();
                      total_weight+=c.get_weight();
                      total_price+=c.get_price();
                      break;
                    case "munch":
                       c=new munch();
                        total_weight +=c.get_weight();
                        total_price +=c.get_price();
                        break;
                    case "dairymilk":
                       c=new dairymilk();
                       total_weight +=c.get_weight();
                       total_price +=c.get_price();
                        break;
                    case "silk":
                      c=new silk();
                      total_weight+=c.get_weight();
                      total_price+=c.get_price();
                      break;
                    case "candyman":
                        ca=new candyman();
                        total_weight +=ca.get_weight();
                        total_price+=ca.get_price();
                    break;
                    case "mangobite":
                        ca=new mangobite();
                        total_weight +=ca.get_weight();
                        total_price+=ca.get_price();
                    break;
                    case "alphenlibe":
                        ca=new alphenlibe();
                        total_weight +=ca.get_weight();
                        total_price+=ca.get_price();
                    break;
                    case "0":
                        System.out.println("Total Price of the giftbox = " + total_price);
                        System.out.println("Total Weight of the giftbox = " + total_weight);
  
                        System.exit(0);
                        break;
                    default:
                      System.out.println("Wrong Input");
                    break;
                    
                    }
                    
                    
                    
                      
                }
        
                         
                

    }
}
