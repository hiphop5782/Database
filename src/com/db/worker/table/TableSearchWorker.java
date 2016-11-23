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
			CommandLogger.result("테이블이 존재합니다.");
			CommandLogger.info("테이블 데이터는 ? 건입니다.");
		}else{
			CommandLogger.error("테이블이 존재하지 않습니다.");
		}
	}

	@Override
	public void separate() {
		String regex = "^(테이블검색)\\((\\w+)\\)";
		Matcher m = Pattern.compile(regex).matcher(command);
		if(m.find()){
			map.put(COMMAND_TYPE, m.group(1));
			map.put(TABLE_NAME, m.group(2));
		}
	}

}
