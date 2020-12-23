package demo;

import java.sql.Timestamp;

public class TimestampDemo {

	public static void main(String[] args) {
		
		Timestamp tim = Timestamp.valueOf("2007-12-08-21.30.37.010843");
		
		System.out.println(tim.toLocalDateTime());
	}

}
