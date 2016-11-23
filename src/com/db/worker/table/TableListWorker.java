package com.db.worker.table;

import java.io.File;

import com.db.console.CommandLogger;
import com.db.file.FileInfo;
import com.db.worker.Worker;

public class TableListWorker extends Worker{
	public TableListWorker(String command) {
		super(command);
	}

	@Override
	public void execute() {
		File rootFolder = new File(FileInfo.TABLE_ROOT);
		if(!rootFolder.exists()){
			CommandLogger.error("폴더가 존재하지 않습니다.");
			return;
		}
		File[] filelist = rootFolder.listFiles();
		for(File file : filelist){
			CommandLogger.result(file.getName().substring(0, file.getName().indexOf(".")));
		}
	}

	@Override
	public void separate() {
		
	}
}
