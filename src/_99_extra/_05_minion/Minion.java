package _99_extra._05_minion;

public class Minion {
	private String name; 
		private int eyes; 
		private String color; 
		private String master;
	
		
	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
		
	}
		public String getName() {
			return name;
		}
		public void setName(String name1) {
			name = name1;
		}
		public int getEyes() {
			return eyes;
		}
		public void setEyes(int eyes1) {
			eyes = eyes1;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color1) {
			color = color1;
		}
		public String getMaster() {
			return master;
		}
		public void setMaster(String master1) {
			master = master1;
		}
}

