//package lecture03
//class Point {
//    double x;
//    double y;
//
//    def Point(double x, double y)
//    {
//        this.x = x
//        this.y = y
//    }
//}
//
//class Rectangle {
//    Point upLeft;
//    Point downRight;
//
//    def Rectangle(Point point1, Point point2)
//    {
//        if(point1.x > point2.x && point1.y > point2.y)
//        {
//            this.upLeft = point1
//            this.downRight = point2
//        }
//        else if(point1.x < point2.x && point1.y < point2.y)
//        {
//            this.upLeft = point2
//            this.downRight = point1
//        }
//        else
//        {
//            println "Invalid points."
//        }
//    }
//    
//    double area()
//    {
//        double length = this.upLeft.x - this.downRight.x
//        double height = this.upLeft.y - this.downRight.y
//        return length * height
//    }
//}
//
//java.util.Scanner sc = new java.util.Scanner(System.in);
//print "Please enter the first x/y points: "
//def x1 = sc.next() as double
//def y1 = sc.next() as double
//
//print "Please enter the second x/y points: "
//def x2 = sc.next() as double
//def y2 = sc.next() as double
//
//Rectangle rect = new Rectangle(new Point(x1,y1), new Point(x2,y2))
//println rect.area()
