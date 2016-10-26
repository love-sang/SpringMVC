package com.somnus.domain;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
/**
 * @class:FormatModel
 * @descript:springmvc注解
 * @date:2016年10月21日 下午6:52:10
 * @author san
 * @version:V1.0
 */
public class FormatModel{
	
	@NumberFormat(style=Style.CURRENCY)
	private double money;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date date;
	
	public double getMoney(){
		return money;
	}
	public Date getDate(){
		return date;
	}
	
	public void setMoney(double money){
		this.money=money;
	}
	public void setDate(Date date){
		this.date=date;
	}
		
}
