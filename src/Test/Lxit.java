package Test;

import java.util.*;
import java.io.*;
public class Lxit
{
	static Scanner sc = new Scanner(System.in);
	/**
	   �Ӽ��̻������
	*/
	public static int getInt(){
		String strTempValue = sc.next();
		int intTempValue=0;
		try{
			intTempValue = Integer.parseInt(strTempValue);
		}catch(Exception e){
			System.out.println("����Ƿ�����");
		}
		return intTempValue;
	}
	/**
	   �Ӽ��̻���ַ���
	 */
	public static String getString(){
		return sc.next();
	}
	/**
	    �Ӽ��̻��һ���ַ�
	*/
	public static char getChar(){
		String var =sc.next();
		var = var.trim();
		char [] array = var.toCharArray();
		if(array.length==0)
			return ' ';
         else 
	  	    return array[0];
		
	}/**
	    �Ӽ��̻�ó�����
	*/
	public static long getLong()
	{
		String strTempValue = sc.next();
		long longTempValue=0L;
		try{
			longTempValue =Long.parseLong(strTempValue);
		}catch(Exception e){
			System.out.println("����Ƿ�����");
		}
		return longTempValue;
	}/**
	    �Ӽ��̻�õ�����
	*/
	public static float getFloat()
	{
		String strTempValue = sc.next();
		float floatTempValue=0.0F;
		try{
			floatTempValue =Float.parseFloat(strTempValue);
		}catch(Exception e){
			System.out.println("����Ƿ�����");
		}
		return floatTempValue;
	}
	public static void saveInfo(Object obj,String savePath){
		  try{
			  File file = new File(savePath);
			  FileOutputStream fOut = new FileOutputStream(file);
			  ObjectOutputStream wObj = new ObjectOutputStream(fOut);
			  wObj.writeObject(obj) ;
		  }catch(FileNotFoundException e){
			  System.out.println("����·������");
		  }catch(IOException e){
			  System.out.println("��ȡ�ļ�����");
		  }
	}
	public static Object readInfo(String savePath){
		 try{
			  File file = new File(savePath);
			  if(file.length()==0)
				  return null;
			  FileInputStream fOut = new FileInputStream(file);
			  ObjectInputStream wObj = new ObjectInputStream(fOut);
		      return wObj.readObject() ;
		  }catch(FileNotFoundException e){
			  System.out.println("����·������");
		  }catch(IOException e){
			  e.printStackTrace();
			  System.out.println("��ȡ�ļ�����");
		  }catch(ClassNotFoundException e){
			  System.out.println("�಻����");
		  }
		  return null;
	}
	/**
	    �Ӽ��̻��˫����
	*/
	public static double getDouble()
	{
		String strTempValue = sc.next();
		double doubleTempValue=0.0F;
		try{
			doubleTempValue =Double.parseDouble(strTempValue);
		}catch(Exception e){
			System.out.println("����Ƿ�����");
		}
		return doubleTempValue;
	}
	public static void main(String []args){
		ArrayList test = (ArrayList)Lxit.readInfo("c:\\T\\saveInf.lxit");
		System.out.println(test);
	}
};