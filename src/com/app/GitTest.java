package com.app;

public class GitTest {

	private int gid;
	private String hubName;
	private String hubLoc;
	private int size;
	private int capacity;
	
	public GitTest() {
		super();
	}


	public int getGid() {
		return gid;
	}


	public void setGid(int gid) {
		this.gid = gid;
	}


	public String getHubName() {
		return hubName;
	}


	public void setHubName(String hubName) {
		this.hubName = hubName;
	}


	public String getHubLoc() {
		return hubLoc;
	}


	public void setHubLoc(String hubLoc) {
		this.hubLoc = hubLoc;
	}


	@Override
	public String toString() {
		return "GitTest [gid=" + gid + ", hubName=" + hubName + ", hubLoc=" + hubLoc + "]";
	}
	
	
	
	
	
}
