package com.db.worker;

import com.db.worker.data.DataDeleteWorker;
import com.db.worker.data.DataInsertWorker;
import com.db.worker.data.DataListWorker;
import com.db.worker.data.DataSearchWorker;
import com.db.worker.data.DataUpdateWorker;
import com.db.worker.table.TableCreateWorker;
import com.db.worker.table.TableListWorker;
import com.db.worker.table.TableRemoveWorker;
import com.db.worker.table.TableSearchWorker;

public class WorkerFactory {
	public static Worker createWorker(String command){
		command = command.trim();
		
		if(command.startsWith("���̺����")){
			return new TableCreateWorker(command);
		}else if(command.startsWith("���̺���")){
			return new TableListWorker(command);
		}else if(command.startsWith("���̺�˻�")){
			return new TableSearchWorker(command);
		}else if(command.startsWith("���̺����")){
			return new TableRemoveWorker(command);
		}else if(command.startsWith("�߰�")){
			return new DataInsertWorker(command);
		}else if(command.startsWith("���")){
			return new DataListWorker(command);
		}else if(command.startsWith("�˻�")){
			return new DataSearchWorker(command);
		}else if(command.startsWith("����")){
			return new DataDeleteWorker(command);
		}else if(command.startsWith("����")){
			return new DataUpdateWorker(command);
		}
		return null;
	}
}
