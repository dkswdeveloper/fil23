package diff;

public class PointMain {
	public static void main(String[] args) {
		Point p1 =new Point(2,3);
		Point p2 =new Point(2,10);
		Point p3 =new Point(22,3);
		p1.show();
		p2.show();
		p3.show();
		Point pt = p1.fartherFromOrigin(p2);
		pt.show();
		System.out.println(Point.orgx + ","  + Point.orgy);
		p1.x= 12; p1.y = 12;
		p1.orgx = 20; p1.orgy = 20;
		
		p2.x = 22; p2.y = 22;
		p2.orgx = 30; p2.orgy = 30;
//		12,12,30,30
//		22,22,30,30
		
		System.out.println(p1.x + "," + p1.y + "," +p1.orgx + "," + p1.orgy);
		System.out.println(p2.x + "," + p2.y + "," +p2.orgx + "," + p2.orgy);
		
		
	}

}
