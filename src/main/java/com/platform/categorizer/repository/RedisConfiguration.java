package com.platform.categorizer.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisConfiguration {
	
//	@Bean
//	JedisConnectionFactory jedisConnectionFactory() {
//		 RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("server", 6379);
//		    return new JedisConnectionFactory(config);
//	}
//	 
//	@Bean
//	public RedisTemplate<String, Object> redisTemplate() {
//	    RedisTemplate<String, Object> template = new RedisTemplate<>();
//	    template.setConnectionFactory(jedisConnectionFactory());
//	    return template;
//	}

}
