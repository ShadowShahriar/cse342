class Time {
	int hours, minutes, seconds;

	Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	
	Time(int h, int m, int s) {
		hours = h;
		minutes = m;
		seconds = s;
	}

	Time add_time(Time t1, Time t2) {
		Time t3 = new Time(
				t1.hours + t2.hours,
				t1.minutes + t2.minutes,
				t1.seconds + t2.seconds);
		return t3;
	}
	
	void display() {
		int mod_sec = seconds % 60;
		int mod_min = (minutes % 60) + ((seconds - mod_sec) / 60);
		int mod_hr = hours + ((minutes - mod_min) / 60) + ((seconds - mod_sec) / 60);
		System.out.println(mod_hr + ":" + mod_min + ":" + mod_sec);
	}
}

public class TimeClass {
	public static void main(String[] args) {
		Time tA = new Time(2, 55, 40);
		Time tB = new Time(5, 20, 30);
		Time tC = new Time().add_time(tA, tB);
		tC.display();
	}
}
