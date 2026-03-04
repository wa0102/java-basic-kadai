package kadai_015;

public class Car_Chapter15 {

	private int gear = 1;
	private int speed = 10;
	
	public void changeGear(int afterGear){
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;		
	}
	
	public void run() {
		if(this.gear == 2) {
			speed = 20;
			System.out.println("速度は時速" + speed + "kmです");
		}else if(this.gear == 3) {
			speed = 30;
			System.out.println("速度は時速" + speed + "kmです");
		}else if(this.gear == 4) {
			speed = 40;
			System.out.println("速度は時速" + speed + "kmです");
		}else if(this.gear == 5) {
			speed = 50;
			System.out.println("速度は時速" + speed + "kmです");
		}else {
			speed = 10;
			System.out.println("速度は時速" + speed + "kmです");
		}
	}

}
