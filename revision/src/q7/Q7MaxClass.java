package q7;

public class Q7MaxClass {

	public static void main(String[] args) {
		try {
			CC c = new CC();
			System.out.println(c.max(13,29));
		} catch (RuntimeException rte) {
			System.out.println(rte);
		}  finally {
			System.out.println("In finally of main");
		}
	}

}

class AA {
	int max( int x, int y) {
		try {
			if (x>y) 
				x++;
			else
				throw new Exception("Oh dear!");
		} catch( Exception ex) {
			System.out.println("In exception " + ex.getMessage());
			System.out.println("x= " + x + " y =" + y);
			return y;
		} 
		finally {
			System.out.println("A::max finally block");
			throw new IllegalArgumentException("A::max Finally x= " + x);
		}
	}
}

class CC extends AA {
	public int max (int x, int y) {
		return super.max(x+10,y+10);
	}
}
