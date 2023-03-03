import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Locker {
	public void filecreation(String name) throws IOException 
	       {
	    	  File fo =new File("/Users/prakashmeena/Documents/Locker/",name);
	    		 if(fo.createNewFile()) {
	            	 System.out.println("The file named " +name+ " has been created ");
	             }
	             else {
	            	 System.out.println("the file already exist"+fo.getName());
	             }
	       }
	public void filedel(String name) 
	       {
		      File fo =new File("/Users/prakashmeena/Documents/Locker/"+name);
		      if(fo.exists()) {
		    	  fo.delete();
		    	  System.out.println("The File has been deleted");
		      }
		      else
		    	  System.out.println("The file does not exist");
	       }
	public void filelist()
	      {
		   File fo= new File("/Users/prakashmeena/Documents/Locker/");
		   File filelist[]=fo.listFiles();
		   Arrays.sort(filelist);
		   System.out.println("list of all the files in the directory");
		   for(File f:filelist) 
		     {
			   System.out.println(f.getName());
		     }
		  }
	public void filesearch() 
	      {
		          Scanner sc= new Scanner(System.in);
  	              System.out.println("Enter the name of the file you want to search ");
  	              String fn=sc.next();
  	              File fo= new File("/Users/prakashmeena/Documents/Locker/",fn);
                  if(fo.exists()) {
		        	  System.out.println("The file exist ");
		          }
                  else
		              System.out.println("The file does not exist");
		  }
	public static void main(String[] args) throws IOException {
		System.out.println("Locker application by Prakash Meena");
		System.out.println("-----------------------------------------------");
		while(true) {
		          Locker l=new Locker();
		          System.out.println("Choose any option number ");
		          System.out.println("1.  Retrive All Files\n"+ "2.  Operations\n"+ "3.  Exit");
		          Scanner sc= new Scanner(System.in);
		  while (!sc.hasNextInt()) 
		           {
		              System.out.println("Input is not a number please enter a valid number.");
		              sc.nextLine();
		            }
		          int n=sc.nextInt();
		  if(n>=1&&n<=3) {
		      if(n==1) 
		      {
			    l.filelist();
		      }
		  if(n==2) {boolean option=true;
			  do {
			System.out.println("Choose any option ");
			System.out.println("1.  Create File\n"+ "2.  Delete File\n"+ "3.  Search File\n"+ "4.  Back to Main Menu");
			while (!sc.hasNextInt()) 
	           {
	              System.out.println("Input is not a number please enter a valid number.");
	              sc.next();
	            }
			int a=sc.nextInt();
			switch (a) 
			{
				case 1:
				System.out.println("Enter the name of the file you want to create ");
				String c=sc.next();
				l.filecreation(c);
				option=false;
				break;
			    case 2:
				System.out.println("Enter the name of the file you want to delete ");
				String d=sc.next();
				l.filedel(d);
				option=false;
				break;
			     case 3:
				l.filesearch();
				option=false;
				break;
			    case 4:
			    	option=false;
				break;
			    default:
			    	System.out.println("Enter an option between 1 to 4");break;
			    	
			}
			}
			while(option);
		  }
			if(n==3) {
			System.out.println("Exiting the app");
			System.exit(0);
		}
		  }
		else
			System.out.println("Enter a valid input");
		}
	}
}

	

