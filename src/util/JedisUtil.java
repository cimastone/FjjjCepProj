package util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.bea.wlevs.adapter.example.helloworld.HelloWorldAdapter;
import com.bea.wlevs.ede.api.StreamSender;

import pojo.Average;

import jedis.JedisPoolManager;

import redis.clients.jedis.Jedis;

public class JedisUtil {
	
	public static void getMessage(StreamSender eventSender){
		Jedis jedis = null;
		try {
			String key = "150150_fenshi";
			jedis = JedisPoolManager.getMgr().getResource();
			List<String> deal_list = new ArrayList<String>();

			while (true) {
				List result = jedis.blpop(0, key);
				String code = "AVE_" + (String)result.get(0);
				Average average = HelloWorldAdapter.average_map.get(code);
				
				average = JsonStrConvertUtil.convertToAverage((String)result.get(0), average, code);
				System.out.println(average);
				eventSender.sendInsertEvent(average);
					
			}
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}
	}
	
	public static void main(String[] args) {
//		StreamSender eventSender = new StreamSender();
//		getMessage();

	}
}
