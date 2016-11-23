package com.db.worker;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.db.console.CommandLogger;
import com.db.file.FileInfo;

public class TableRemoveWorker extends Worker{

	protected TableRemoveWorker(String command) {
		super(command);
	}

	@Override
	public void execute() {
		String filename = map.get(TABLE_NAME)+FileInfo.SUFFIX;
		
		File table = new File(FileInfo.TABLE_ROOT, filename);
		if(table.exists()){
			if(table.delete()){
				CommandLogger.result("���̺� ���� ����");
			}else{
				CommandLogger.error("���̺� ���� ����");
			}
		}else{
			CommandLogger.error("�������� �ʴ� ���̺��Դϴ�.");
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
