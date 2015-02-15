package com.toolsBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Change {
	public static String getSerial(Date date){
		String strDate="";
		if(date!=null){
			SimpleDateFormat format=new SimpleDateFormat("MMddyyyyHHmmss");
			strDate=format.format(date);		
		}
		return strDate;
	}
}
