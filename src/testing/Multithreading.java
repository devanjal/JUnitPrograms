package testing;
public class Multithreading {
public static void main(String[] args) 
		{
			 Thread th1 = new Thread ( new CheckThread("Rocket 1")); 
			 Thread th2 = new Thread ( new CheckThread("Rocket 2"));
			 
		     
		      th1.start();
		      th2.start();
		      }}
class CheckThread implements Runnable 
	{
		   String tName;
		   public int count = 0;
		  
		    CheckThread( String name)
		   {
		       tName = name;
		       System.out.println("Ignition of " +  tName );
		   }
public void run() 
		   {
		      System.out.println("Launching State of " +  tName );
		      try
		      {
		            System.out.println("Rocket " + tName + " in execution");
		            count++;
		            
		            Thread.sleep(10);      
		      }
		      catch (Exception e) 
		      {
		         System.out.println("Rocket " +  tName + "exception caught");
		      }
		     System.out.println("Rocket " +  tName + " Launched");
		   }

		}