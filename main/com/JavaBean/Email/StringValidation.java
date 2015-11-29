package com.JavaBean.Email;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidation {
	
	public boolean checkDate(String date) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try{
            d = df.parse(date);
        }catch(Exception e){
        	return false;
        }
		
		String s1 = df.format(d);
		return date.equals(s1);
	}
	
	public boolean checkPhone(String phoneNum) {
		char[] number = phoneNum.toCharArray();
		if (number.length == 11 && phoneNum.startsWith("1")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        return false;
	}
}
