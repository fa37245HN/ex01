import java.io.*;

class FallInt {
    public static void main(String args[]) {
	int x, y, x_speed, y_speed;
	int g;

	String buf;

	g = -10;

	x = 0;
	y = 100000;
	x_speed = 800;
	y_speed = 0;

	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    System.err.print("x_speed = ");
	    buf = br.readLine();
	    x_speed = Integer.parseInt(buf);

	} catch(Exception e) {
	    System.out.print("Error:" + e);
	}

	while(y >= 0) {
	    y_speed += g;
	    x += x_speed;
	    y += y_speed;
	}
	System.out.print("estimated distance = " + x + "\n");

	return;
    }
}
