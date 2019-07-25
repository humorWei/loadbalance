package com.example.parent.service;

import java.util.List;

public class EAS {
	private int serverID;
	private float availableMemory;
	private int availableCPU;
	private int healthyScore;
	private List<AppEnging> AppEngine;
	private String serverStatus;
	
	public boolean onHeartBeat() {
		return true;
	}
	public boolean makeServerDown() {
		return true;
	}
}
