package Test;

import java.util.*;
import java.io.*;
public class Lxit
{
	static Scanner sc = new Scanner(System.in);
	/**
	   从键盘获得数字
	*/
	public static int getInt(){
		String strTempValue = sc.next();
		int intTempValue=0;
		try{
			intTempValue = Integer.parseInt(strTempValue);
		}catch(Exception e){
			System.out.println("输入非法数字");
		}
		return intTempValue;
	}
	/**
	   从键盘获得字符串
	 */
	public static String getString(){
		return sc.next();
	}
	/**
	    从键盘获得一个字符
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
	    从键盘获得长整型
	*/
	public static long getLong()
	{
		String strTempValue = sc.next();
		long longTempValue=0L;
		try{
			longTempValue =Long.parseLong(strTempValue);
		}catch(Exception e){
			System.out.println("输入非法数字");
		}
		return longTempValue;
	}/**
	    从键盘获得单精度
	*/
	public static float getFloat()
	{
		String strTempValue = sc.next();
		float floatTempValue=0.0F;
		try{
			floatTempValue =Float.parseFloat(strTempValue);
		}catch(Exception e){
			System.out.println("输入非法数字");
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
			  System.out.println("保存路不存在");
		  }catch(IOException e){
			  System.out.println("读取文件错误");
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
			  System.out.println("保存路不存在");
		  }catch(IOException e){
			  e.printStackTrace();
			  System.out.println("读取文件错误");
		  }catch(ClassNotFoundException e){
			  System.out.println("类不存在");
		  }
		  return null;
	}
	/**
	    从键盘获得双精度
	*/
	public static double getDouble()
	{
		String strTempValue = sc.next();
		double doubleTempValue=0.0F;
		try{
			doubleTempValue =Double.parseDouble(strTempValue);
		}catch(Exception e){
			System.out.println("输入非法数字");
		}
		return doubleTempValue;
	}
	public static void main(String []args){
		ArrayList test = (ArrayList)Lxit.readInfo("c:\\T\\saveInf.lxit");
		System.out.println(test);
	}
};