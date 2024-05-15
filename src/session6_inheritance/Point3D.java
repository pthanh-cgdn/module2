package session6_inheritance;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    public String toString() {
        return "(x: " + getX() + ", y: " + getY() + ", z: " + getZ() + ")";
    }

    public static void main(String[] args) {
        Point3D point3d = new Point3D();
        point3d.setZ(5);
        System.out.println(point3d.toString());
    }
}
