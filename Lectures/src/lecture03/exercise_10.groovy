package lecture03
java.util.Scanner sc = new java.util.Scanner(System.in);
class Point {
    double x;
    double y;

    def Point(double x, double y)
    {
        this.x = x
        this.y = y
    }
}

int numPoints = 3
def points = []
for(def i = 0; i < numPoints; ++i){
    print "Please enter x/y coordinates for point: "
    def x = sc.next() as double
    def y = sc.next() as double
    points.add(new Point(x, y))
}

def shortestPair = []
for(def i = 0; i < points.size(); ++i){
    if(shortestPair.size() == 0)
        shortestPair.add(points[i])
        
    for(def j = 0; j < points.size(); ++j){
        if(shortestPair.size() == 1)
            shortestPair.add(points[j])
        else
            
        
        


    }
}
