package ds;
import java.util.*;  
import java.io.*;  

public class ReadPropertiesFile {
	public static void main(String[] args) {
		 
		// Properties file path.
		//String filePath = "D:/file/config.properties";
		Properties prop = new Properties();
		int a[][]=new int[3][3];
		int row,col=0;
		String arr[];
 
		try  {
	//		InputStream inputStream = new FileInputStream(filePath);
			// Loading the properties.
	//		prop.load(inputStream);
 
			// Getting properties 
			String grid1 = "1,2,3,4,15,6,7,8,9" ;   // prop.getProperty("grid.1");
			        								//  prop.getProperty("grid.2");
			           								//prop.getProperty("grid.3");
			
				
			StringTokenizer st2 = new StringTokenizer(grid1, ",");
			while (st2.hasMoreElements()) {
			for(int i=0;i<3;i++)
				{
			for (int j=0;j<3;j++)
				{
					a[i][j]=Integer.parseInt((String) st2.nextElement());
					
					System.out.print(a[i][j]+ "  ");
				}
			    	System.out.println();
			}
				
			}
				
		} catch (Exception ex) {
			System.out.println("Problem occurs when reading file !");
			ex.printStackTrace();
		} 
		
		sum(a);
	}		
	public static void sum(int arr[][])
	{  int sum[]=new int[9]; 
		int index=arr[0][0],i,j;
		
		for( i=0;i<3;i++)
		{	for (j=0;j<3;j++){
			 sum[j] +=arr[i][j]+arr[i+1][j]+arr[i][j+1];	
			 System.out.println("Largest No"+sum[j]);
		
	} 
		}	
	}
	
	
	
}