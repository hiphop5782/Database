package com.db.console;

public class CommandLogger {
	public static void info(String message){
		System.out.println("정보 : "+message);
	}
	public static void prefer(String message){
		System.out.print(message);
	}
	public static void error(String message){
		System.out.println("오류 : "+message);
	}
	public static void result(String message){
		System.out.println("결과 : "+message);
	}
	public static void help(String message){
		
	}
}
