package com.ttrh.repairs.utils;

import java.util.UUID;

public class IdUtil {
	public static String Uuid() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}
}
