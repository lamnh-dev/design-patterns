package com.lamdev.designpattern;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {

	private static Map<String, AccessControl> acMap = new HashMap<String, AccessControl>();
	
	static {
		System.out.println("Fetching data from external resources and creating access control objects...");
		acMap.put("USER", new AccessControl("USER", "DO_WORK"));
		acMap.put("ADMIN",new AccessControl("ADMIN","ADD/REMOVEUSERS"));
		acMap.put("MANAGER",new AccessControl("MANAGER","GENERATE/READREPORTS"));
		acMap.put("VP", new AccessControl("VP","MODIFYREPORTS"));
	}
	
	public static AccessControl getAccessControl(String controlLevel) {
		AccessControl ac = null;
		ac = acMap.get(controlLevel);
		if (ac != null) {
			return ac.clone();
		}
		return null;
	}
}
