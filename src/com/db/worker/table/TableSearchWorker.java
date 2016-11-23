package com.db.worker.table;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.db.console.CommandLogger;
import com.db.file.FileInfo;
import com.db.worker.Worker;

public class TableSearchWorker extends Worker{

	public TableSearchWorker(String command) {
		super(command);
	}

	@Override
	public void execute() {
		String filename = map.get(TABLE_NAME)+FileInfo.SUFFIX;
		File table = new File(FileInfo.TABLE_ROOT, filename);
		if(table.exists()){
			CommandLogger.result("���̺��� �����մϴ�.");
			CommandLogger.info("���̺� �����ʹ� ? ���Դϴ�.");
		}else{
			CommandLogger.error("���̺��� �������� �ʽ��ϴ�.");
		}
	}

	@Override
	public void separate() {
		String regex = "^(���̺�˻�)\\((\\w+)\\)";
		Matcher m = Pattern.compile(regex).matcher(command);
		if(m.find()){
			map.put(COMMAND_TYPE, m.group(1));
			map.put(TABLE_NAME, m.group(2));
		}
	}

}
