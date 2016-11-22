package com.srini.redis.client;

import redis.clients.jedis.Jedis;

public class RedisClient {

	private static RedisClient redisClient;
	private Jedis jedis;

	private RedisClient() {

	}

	public static RedisClient getInstance(String address) {
		if (redisClient != null) {
			return redisClient;
		} else {
			redisClient = new RedisClient();
			redisClient.jedis = new Jedis(address);
			return redisClient;
		}
	}

	public Jedis getJedis() {
		return jedis;
	}

	public void setJedis(Jedis jedis) {
		this.jedis = jedis;
	}
	
	

}
