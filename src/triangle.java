public class triangle {

//
//    private double x;
//    private double y;
//    private double z;
//
//    public MyPoint(double x, double y, double z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public double getZ() {
//        return z;
//    }
//
//    public void setX(double x) {
//        this.x = x;
//    }
//
//    public void setY(double y) {
//        this.y = y;
//    }
//
//    public void setZ(double z) {
//        this.z = z;
//    }
//
//    public double calculateDistance(double xPoint, double yPoint) {
//        return Math.sqrt(Math.pow((xPoint - x), 2) + Math.pow((yPoint - y), 2));
//    }
//
//    public double calculateDistance(double yPoint, double zPoint) {
//        return Math.sqrt(Math.pow((yPoint - x), 2) + Math.pow((zPoint - y), 2));
//    }
//
//    public double calculateDistance(double zPoint, double xPoint) {
//        return Math.sqrt(Math.pow((zPoint - x), 2) + Math.pow((xPoint - y), 2));
//
//    }
//
//    public double calculateCircuit() {
//        return x.getDistanceTo(y) + y.getDistanceTo(z) + z.getDistanceTo(x);
//    }
//}


    public class Triangle {
        private MyPoint x;
        private MyPoint y;
        private MyPoint z;

        public Triangle(MyPoint x, MyPoint y, MyPoint z) throws Exception {
            if (x.equals(y) || y.equals(z) || z.equals(x)) {
                throw new Exception("Punkty nie mogą być takie same!"); // wwyjątki, ogarnij to.
            }
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public MyPoint getA() {
            return x;
        }

        public MyPoint getB() {
            return y;
        }

        public void setB(MyPoint b) {
            this.y = y;
        }

        public MyPoint getC() {
            return z;
        }

        public void setC(MyPoint c) {
            this.z = z;
        }

        public void setA(MyPoint a) {
            this.x = x;
        }

//        public double calculatePerimeter() {
//            return x.calculateDistance((y) + y.calculateDistance(z) + z.calculateDistance(x);
        }
    }
}
//    public double calculateCircuit(){
//        return a.getDistanceTo(b) + b.getDistanceTo(c) + c.getDistanceTo(a)