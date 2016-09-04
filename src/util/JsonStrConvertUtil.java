package util;
import java.io.*;  
import org.json.*;  

import pojo.Average;
  
public class JsonStrConvertUtil {  
	public static Average convertToAverage(String jsonstr, Average average, String code){
		try{
	        JSONObject aver_str = new JSONObject(jsonstr);  
	        if (average == null){
	        	average = new Average();
	        	average.setCode(code);
	        	average.setTotal_money((Double)aver_str.get("deal_price") * (Integer)aver_str.get("chengjiaoliang"));
	        	average.setTotal_volume((Integer)aver_str.get("chengjiaoliang"));
	        }
	        average.setBs_flag((String)aver_str.get("bs_flag"));
	        average.setDeal_volume((Integer)aver_str.get("chengjiaoliang"));
	        average.setTrade_time((String)aver_str.get("time"));
	        average.setTime_stamp((Long)aver_str.get("localhost"));
	        average.setDeal_price((Double)aver_str.get("deal_price"));
	        
		}catch(Exception e){
			e.printStackTrace();
		}
        return average;

	}

}  