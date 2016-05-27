package com.toptal.blog.service;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.googlecode.ehcache.annotations.Cacheable;

@Service
public class MessageService{
	private ConcurrentHashMap<Integer, String> messages
	= new ConcurrentHashMap<Integer, String>();
	
	// 这两个方法未使用缓存
//	public String getMessage(Integer id) {
//		System.out.println("Getting data from SOR......");
//		return messages.get(id);
//	}
//	public void setMessage (Integer id, String message){
//		messages.put(id, message);
//	}
	
	// 这两个方法使用缓存
//	@Cacheable(cacheName = "messageCache", selfPopulating = true)
//	public String getMessage(Integer id) {
//		System.out.println("Getting data from SOR......");
//		return messages.get(id);
//	}
//
//	public void setMessage (Integer id, String message){
//		messages.put(id, message);
//	}

	
	// 这两个方法使用缓存 并且当数据有变化时立即刷新缓存数据
//@Cacheable(cacheName = "messageCache",selfPopulating = true,//use self populating cache
//		 keyGenerator = @KeyGenerator (//method name is not included in cache key to work with @TriggersRemove
//	                name = "HashCodeCacheKeyGenerator",
//	                properties = @Property( name="includeMethod", value="false" )))	
//public String getMessage(Integer id) {
//	System.out.println("Getting data from SOR......");
//	return messages.get(id);
//}
//
//@TriggersRemove(cacheName = "messageCache",
//		 keyGenerator = @KeyGenerator (
//	                name = "HashCodeCacheKeyGenerator",
//	                properties = @Property( name="includeMethod", value="false" )))
//public void setMessage (@PartialCacheKey Integer id, String message){
//	messages.put(id, message);
//}
}
