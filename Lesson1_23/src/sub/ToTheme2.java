/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

package sub;

public class ToTheme2 {
	private String name = "ライオン";
	private float length = 2.1F;
	private short speed = 80;
	
	
	// nameGetter
	public String getName() {
		return name;
	}

	// nameSetter
	public void setName(String name) {
		this.name = name;
	}

	// lengthGetter
	public float getLength() {
		return length;
	}
	
	// lengthSetter
	public void setLength(float length) {

		this.length = length;
	}
	
	public short getSpeed() {
		return speed;
	}
	
	public void setSpeed(short speed) {
		this.speed = speed;
	}

}
