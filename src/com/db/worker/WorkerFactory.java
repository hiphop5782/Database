package com.db.worker;

public class WorkerFactory {
	public static Worker createWorker(String command){
		command = command.trim();
		if(command.startsWith("���̺����")){
			return new TableCreateWorker(command);
		}else if(command.startsWith("���̺���")){
			return new TableListWorker(command);
		}else if(command.startsWith("���̺�˻�")){
			//return new TableSearchWorker(command);
		}else if(command.startsWith("���̺����")){
			return new TableRemoveWorker(command);
		}else if(command.startsWith("�߰�")){
			//return new DataInsertWorker(command);
		}else if(command.startsWith("���")){
			//return new DataListWorker(command);
		}else if(command.startsWith("�˻�")){
			//return new DataSearchWorker(command);
		}else if(command.startsWith("����")){
			//return new DataDeleteWorker(command);
		}else if(command.startsWith("����")){
			//return new DataUpdateWorker(command);
		}
		return null;
	}
}
