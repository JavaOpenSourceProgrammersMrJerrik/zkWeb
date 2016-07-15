package com.mangocity.zk.util;

public class ZkCfgFactory {
	
	private static ZkCfgManager _instance = new ZkCfgManagerImpl();
	
	public static ZkCfgManager getZkCfgManager(){
		return _instance;
	}

}
