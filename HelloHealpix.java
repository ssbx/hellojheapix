import healpix.essentials.HealpixBase;
import healpix.essentials.Scheme;


public class HelloHealpix {
	
    public static void main(String[] args) {
	long nside = 2048;
	Scheme scheme = Scheme.NESTED;
	HealpixBase hp = null;
	try {
		hp = new HealpixBase(nside, scheme);
	} catch (Exception e) {
        	System.out.println("can not instanciate healpix");
		System.exit(1);
	}
	
	for (long pixtest=0; pixtest<40; pixtest++) {
		System.out.println("For " + pixtest);
		try {
			long neighbors[] = hp.neighbours(pixtest);
			for (int i=0; i < neighbors.length; i++) {
				System.out.println("Have found neighbor " + neighbors[i]);
			}
		} catch (Exception e) {
        		System.out.println("can not get neighbours healpix");
			System.exit(1);
		}
	}


        System.out.println("Hello, World");
    }
    
}
