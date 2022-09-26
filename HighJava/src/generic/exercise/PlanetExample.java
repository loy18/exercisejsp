package generic.exercise;

public class PlanetExample {
	public static void main(String[] args) {
		System.out.println("행성들의 면적");
		for(Planet p : Planet.values()) {
			System.out.printf("%s의 면적 : %,.1f㎢\n",p.name(),Planet.getArea(p));
		}
		
	}
}

enum Planet{
	수성(2439), 
	금성(6052), 
	지구(6371), 
	화성(3390), 
	목성(69911), 
	토성(58232), 
	천왕성(25362), 
	해왕성(24622);
	
	private int radius;
	
	Planet(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public static double getArea(Planet planet) {
		return 4*Math.PI * planet.radius * planet.radius;
	}
}