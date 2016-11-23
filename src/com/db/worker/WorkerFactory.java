package com.db.worker;

public class WorkerFactory {
	public static Worker createWorker(String command){
		command = command.trim();
		if(command.startsWith("테이블생성")){
			return new TableCreateWorker(command);
		}else if(command.startsWith("테이블목록")){
			return new TableListWorker(command);
		}else if(command.startsWith("테이블검색")){
			//return new TableSearchWorker(command);
		}else if(command.startsWith("테이블삭제")){
			return new TableRemoveWorker(command);
		}else if(command.startsWith("추가")){
			//return new DataInsertWorker(command);
		}else if(command.startsWith("목록")){
			//return new DataListWorker(command);
		}else if(command.startsWith("검색")){
			//return new DataSearchWorker(command);
		}else if(command.startsWith("삭제")){
			//return new DataDeleteWorker(command);
		}else if(command.startsWith("수정")){
			//return new DataUpdateWorker(command);
		}
		return null;
	}
}
