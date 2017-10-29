package at.atjontv.minecraft.aaab;

/*
 * This software is licensed under OSPL (Open Source Project License Version 1.1 by ATVG-Studios)
 * [ License: http://atvg-studios.at/OSPLv1.1 ]
 * 
 * 
 * 	Copyright 2015-2017 ATVG-Studios/AtjonTV (Thomas Obernosterer)
 * 
 */

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
		
	public static String FILE_ROOT = "plugins/AAAB/";
	public static String TEMP_ROOT = FILE_ROOT+"tmp/";
	public static String DB_ROOT = FILE_ROOT+"db/";
	public static String DBS_ROOT = DB_ROOT+"dbs/";
	public static String DB_VERSION = DB_ROOT+"version.json";
	public static String DB_FILE = DBS_ROOT+"database.json";
	
	@Override
	public void onEnable() {
		new Checker();
	}
	
}