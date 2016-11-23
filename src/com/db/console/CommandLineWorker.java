package com.db.console;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.db.worker.Worker;
import com.db.worker.WorkerFactory;

public class CommandLineWorker{
	private Scanner reader = new Scanner(System.in);
	public static final String CMDSTRING = "(명령)";
	
	public void work(){
		while(true){
			String command = readLine();
			if(CommandChecker.isCorrectCommand(command))
				executeCommand(command);
			else
				error(command);
			Logger.getAnonymousLogger().log(Level.ALL, command);
		}
	}
	
	public void executeCommand(String command){
//		System.out.println("명령 실행 : "+command);
		Worker worker = WorkerFactory.createWorker(command);
//		System.out.println("생성된 worker = "+worker);
		worker.execute();
	}
	
	public void error(String command){
		System.out.println("잘못된 명령 : "+command);
	}
	
	public String readLine(){
		int rowCount = 1;
		int emptyRowCount = 0;
		StringBuffer buffer = new StringBuffer();
		while(true){
			String msg = rowCount>1?rowCount+")":CMDSTRING;
			CommandLogger.prefer(msg+" ");
			String command = reader.nextLine();
			buffer.append(command);
			rowCount++;
			if(CommandChecker.isEndOfCommand(command)) 
				break;
			else if(CommandChecker.isNullString(command)){
				if(++emptyRowCount > 0){
					emptyRowCount = 0;
					rowCount = 1;
					continue;
				}
			}
		}
		return buffer.toString();
	}
	
	
}
