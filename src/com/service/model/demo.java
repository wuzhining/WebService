package com.service.model;

import java.lang.reflect.Field;
import java.util.Map;

public class demo {
		public Object getServiceObject(String usrName,String usrPwd){
			jsonObject jo=new jsonObject();
			jo.setUsrName(usrName);
			jo.setPwdWord(usrPwd);
			return  jo;
		}
		public String getService(String str){
			return "Best Wish "+str+"!";
		}
		public String getServiceAgian(String str){
			return "Best Wish "+str+"!";
		}
		
		@SuppressWarnings("null")
		public Map<String,String> getJson(String name,String value){
			Map<String, String> map = null;
			map.put(name, value);
			return  map;
		}
		public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
			demo dm=new demo();
			jsonObject ob= (jsonObject) dm.getServiceObject("大宝", "二宝");
			System.out.println(ob.getClass().getName());
			String name=null;
			Object value=null;
			try {
				Field[] fields=ob.getClass().getDeclaredFields();
				for (int i = 0; i < fields.length; i++) {
					Field example=fields[i];
					example.setAccessible(true);
					name=example.getName();
					value=example.get(ob);
					System.out.println(name+":"+value);
					System.out.println(dm.getServiceAgian(value.toString()));
				}
				System.out.println(dm.getServiceAgian("尼古拉斯赵四"));
				
				Map<String, String> map = dm.getJson("Str", "二宝");
				System.out.println(map.toString());
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
}
