package tar2;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		ArrayList<Geolocations> geos = new ArrayList<Geolocations>();

		for (int i = 0; i < 10; i++) {
			geos.add(new Geolocations(randomDouble(), randomDouble()));

		}
		System.out.println(geos.size());
//System.out.println(geos);//how to call each element separately

//for (Geolocations geolocations : geos) {//?
//	if(geolocations.getLongtitude()>10){
//		geos.remove(geolocations);
//	}

for (int i = 0; i < geos.size(); i++) {
	if(geos.get(i).getLatitude()>10){
		geos.remove(i);
		i--;
	}
	
}	
System.out.println(geos.size());
System.out.println(geos);
}

	


	
	
	
	public static double randomDouble() {
		return (Math.random() * 25 + 1);

	}

}
