package com.db.worker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Worker {
	public static final String TABLE_NAME = "table";
	public static final String COMMAND_TYPE = "commandtype";
	
	protected String command;
	protected Map<String, String> map = new HashMap<>();
	protected Map<String, String> data = new HashMap<>();
	protected Worker(String command){
		this.command = command;
		separate();
	}
	
	//Worker 필수 기능 : execute(실행), separate(명령 분리)
	public abstract void execute();
	public abstract void separate();
}
