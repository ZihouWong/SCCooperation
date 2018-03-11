package org.sccooperation.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QDeleteSign {
public static void main(String[] args) {
	try { 
//	FileInputStream in = new FileInputStream("D:\\spss\\2016c\\2016.1.11-2016.1.20.txt"); 
//	InputStreamReader inReader = new InputStreamReader(in, "UTF-8");  
//    BufferedReader bufReader = new BufferedReader(inReader);  
//    String line = null;  
//    String neizi = "============================================================以下为内资\n";
//    String waizi = "============================================================以下为外资\n";
//    String geti ="============================================================以下为个体\n";
//    String nongmin ="============================================================以下为农民\n";
//    int i = 0;
//    int sum[]= {0,0,0,0};
//    while((line = bufReader.readLine()) != null){  
//
//    	Pattern p = Pattern.compile("^\\d{6}[0-2].*");
//    	Matcher m = p.matcher(line);
//        if(m.find())
//        {
//        	neizi +=line+"\r\n";
//        	
//        	sum[0]++;
//        }
//        
//        Pattern p1 = Pattern.compile("^\\d{6}3.*");
//    	Matcher m1 = p1.matcher(line);
//        if(m1.find())
//        {
//        	nongmin +=line+"\r\n";
//        	
//        	sum[1]++;
//        }
//        
//        Pattern p2 = Pattern.compile("^\\d{6}[4-5].*");
//    	Matcher m2 = p2.matcher(line);
//        if(m2.find())
//        {
//        	waizi +=line+"\r\n";
//        	
//        	sum[2]++;
//        }
//        
//        Pattern p3 = Pattern.compile("^\\d{6}[6-9].*");
//    	Matcher m3 = p3.matcher(line);
//        if(m3.find())
//        {
//        	geti +=line+"\r\n";
//        	
//        	sum[3]++;
//        }     	
//        i++;  
//    }  
//
//    int ss=sum[0]+sum[1]+sum[2]+sum[3];
//    System.out.println("其中内资为"+sum[0]+"外资为"+sum[2]+"农民为"+sum[3]+"个体为"+sum[3]+"总计为"+ss);
//    bufReader.close();  
//    inReader.close();  
//    in.close();  
//    String h = neizi+waizi+nongmin+geti;
//
//    File dir = new File("D:\\spss\\2016cs\\2016.1.11-2016.1.20.txt");  
//    OutputStreamWriter oStreamWriter = new OutputStreamWriter(new FileOutputStream(dir), "utf-8");
//    oStreamWriter.write(waizi+neizi+nongmin+geti+"\r\n"+"其中内资为"+sum[0]+"外资为"+sum[2]+"农民为"+sum[3]+"个体为"+sum[3]+"总计为"+ss);
//    oStreamWriter.close();
//		int sum=0;
		String zongjie = null;
		for(int moth=1;moth<7;moth++)
		{
			
			int ten = 1;
			for(int s =1;s<4;ten+=10,s++)
			{
				int tennext=ten+10;
				FileInputStream in = new FileInputStream("D:\\spss\\2016c\\2016."+moth+"."+ten+"-2016."+moth+"."+tennext+".txt"); 
				InputStreamReader inReader = new InputStreamReader(in, "UTF-8");  
			    BufferedReader bufReader = new BufferedReader(inReader);  
			    String line = null;  
			    String neizi = "============================================================以下为内资\n";
			    String waizi = "============================================================以下为外资\n";
			    String geti ="============================================================以下为个体\n";
			    String nongmin ="============================================================以下为农民\n";
			    int i = 0;
			    int sum[]= {0,0,0,0};
			    while((line = bufReader.readLine()) != null){  
			
			    	Pattern p = Pattern.compile("^\\d{6}[0-2].*");
			    	Matcher m = p.matcher(line);
			        if(m.find())
			        {
			        	neizi +=line+"\r\n";
			        	
			        	sum[0]++;
			        }
			        
			        Pattern p1 = Pattern.compile("^\\d{6}3.*");
			    	Matcher m1 = p1.matcher(line);
			        if(m1.find())
			        {
			        	nongmin +=line+"\r\n";
			        	
			        	sum[1]++;
			        }
			        
			        Pattern p2 = Pattern.compile("^\\d{6}[4-5].*");
			    	Matcher m2 = p2.matcher(line);
			        if(m2.find())
			        {
			        	waizi +=line+"\r\n";
			        	
			        	sum[2]++;
			        }
			        
			        Pattern p3 = Pattern.compile("^\\d{6}[6-9].*");
			    	Matcher m3 = p3.matcher(line);
			        if(m3.find())
			        {
			        	geti +=line+"\r\n";
			        	
			        	sum[3]++;
			        }     	
			        i++;  
			    }  
			
			    int ss=sum[0]+sum[1]+sum[2]+sum[3];
			    System.out.println("其中内资为"+sum[0]+"外资为"+sum[2]+"农民为"+sum[3]+"个体为"+sum[3]+"总计为"+ss);
			    bufReader.close();  
			    inReader.close();  
			    in.close();  
			    String h = neizi+waizi+nongmin+geti;
			
			    File dir = new File("D:\\spss\\2016cs\\2016."+moth+"."+ten+"-2016."+moth+"."+tennext+".txt");  
			    OutputStreamWriter oStreamWriter = new OutputStreamWriter(new FileOutputStream(dir), "utf-8");
			    oStreamWriter.write(waizi+neizi+nongmin+geti+"\r\n"+"其中内资为"+sum[0]+"外资为"+sum[2]+"农民为"+sum[3]+"个体为"+sum[3]+"总计为"+ss);
			    oStreamWriter.close(); 
			    zongjie+=moth+"."+ten+"-2016."+moth+"."+tennext+"  其中内资为"+sum[0]+"外资为"+sum[2]+"农民为"+sum[3]+"个体为"+sum[3]+"总计为"+ss+"\r\n";
				
//	    File dir = new File("D:\\spss\\2016cs\\2016."+moth+"."+ten+"-2016."+moth+"."+tennext+".txt");  
//	    OutputStreamWriter oStreamWriter = new OutputStreamWriter(new FileOutputStream(dir), "utf-8");
//	    oStreamWriter.write("");
//	    oStreamWriter.close();

			}
			

		}
		File dir = new File("D:\\spss\\2016cs\\2016.zongjie.txt");  
	    OutputStreamWriter oStreamWriter = new OutputStreamWriter(new FileOutputStream(dir), "utf-8");
	    oStreamWriter.write(zongjie);
	    oStreamWriter.close();



} 
catch (Exception e) {  
    e.printStackTrace();  
  
} 
	
}
}
