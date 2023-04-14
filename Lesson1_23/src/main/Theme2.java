/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

package main;

import sub.ToTheme2;

public class Theme2{

	public static void main(String[] args) {
		
		ToTheme2 profile = new ToTheme2();
		
		System.out.println("動物名：" + profile.getName());
		System.out.println("体長：" + profile.getLength() + "m");
		System.out.println("速度：" + profile.getSpeed() + "km/h");
		
	}


}