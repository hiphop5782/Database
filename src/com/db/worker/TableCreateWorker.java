package com.db.worker;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.db.console.CommandLogger;
import com.db.file.FileInfo;

public class TableCreateWorker extends Worker{
	public TableCreateWorker(String command){
		super(command);
	}
	@Override
	public void execute() {
		String filename = map.get(TABLE_NAME)+FileInfo.SUFFIX;
		
		File table = new File(FileInfo.TABLE_ROOT, filename);
		try{
			if(table.createNewFile())
				CommandLogger.result("���̺� ���� �Ϸ�");
			else
				CommandLogger.error("�̹� �����ϴ� ���̺�");
		}catch(Exception e){
			CommandLogger.error(e.getMessage());
		}
	}

	@Override
	public void separate() {
		String regex = "^(���̺����)\\((\\w+)\\)";
		Matcher m = Pattern.compile(regex).matcher(command);
		if(m.find()){
			map.put(COMMAND_TYPE, m.group(1));
			map.put(TABLE_NAME, m.group(2));
		}
	}
}
