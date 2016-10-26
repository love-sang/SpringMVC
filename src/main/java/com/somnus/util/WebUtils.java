package com.somnus.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * @class:WebUtil
 * @descript:工具类获取request， response
 * @date:2016年10月21日 下午1:01:52
 * @author san
 * @version:V1.0
 */
public class WebUtils {

	public static HttpServletRequest getRequest(){
		return ServletRequestAttributes.class.cast(RequestContextHolder.getRequestAttributes()).getRequest();
	}
	
   public static HttpServletResponse getResponse() {
    	return ServletWebRequest.class.cast(RequestContextHolder.getRequestAttributes()).getResponse();
    }
	
   @SuppressWarnings("unchecked")
	public static Map<String, String> getParamMap(){
		   Map<String, String[]> paramMap = getRequest().getParameterMap();
		   Map<String, String> params = new HashMap<String, String>(paramMap.size());
		   if(paramMap!=null && !paramMap.isEmpty()){
			   for(Map.Entry<String, String[]> item:paramMap.entrySet()){
				   String name=item.getKey();
				   String value="";
				   String [] values=item.getValue();
				   for(int i=0;i<values.length;i++){
					   value+=values[i]+",";
				   }
				   value=value.substring(0,value.length()-1);
				   params.put(name, value);
			   }
		   }
		   return params;
	   }
	
}
