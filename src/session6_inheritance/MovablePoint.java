package session6_inheritance;

public class MovablePoint extends Point2D {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float[] getSpeed(){
        return new float[]{getxSpeed(), getySpeed()};
    }
    public String toString(){
        return "("+getX()+","+getY()+"),speed=("+getxSpeed()+","+getySpeed()+")";
    }
    public MovablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint m = new MovablePoint(5,5,1,1);
        System.out.println(m.toString());
        m.move();
        System.out.println(m.toString());
    }
}
