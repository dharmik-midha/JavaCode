package ObjectInputOutputStream;

import java.io.*;
import java.util.*;

class Point implements Serializable {
	int p1, p2;

	public Point(int x, int y) {
		p1 = x;
		p2 = y;
		// System.out.println("points are "+p1+" and "+p2);
	}
}

public class ObjectOutputStreamExample {
	public static void main(String arg[]) {
		try {
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream("C:\\Users\\dharm\\Desktop\\Example\\ObjectStream.txt"));

			Point p = new Point(2, 5);
			// System.out.println("points are"+p);
			os.writeObject(p);
			os.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
