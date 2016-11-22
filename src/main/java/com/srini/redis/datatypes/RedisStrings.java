package com.srini.redis.datatypes;

import com.srini.redis.client.RedisClient;

public class RedisStrings {
	public static void main(String[] args) {
		RedisClient redis=RedisClient.getInstance("localhost");
		System.out.println(redis.getJedis().hgetAll("hashmap"));
	}
	
}
