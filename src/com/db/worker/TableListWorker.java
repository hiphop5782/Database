package com.db.worker;

import java.io.File;

import com.db.console.CommandLogger;
import com.db.file.FileInfo;

public class TableListWorker extends Worker{
	protected TableListWorker(String command) {
		super(command);
	}

	@Override
	public void execute() {
		File rootFolder = new File(FileInfo.TABLE_ROOT);
		if(!rootFolder.exists()){
			CommandLogger.error("������ �������� �ʽ��ϴ�.");
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
