public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
        System.out.println("now i moved up "+ x +" "+ y );

    }

    @Override
    public void moveDown() {
        y-=xSpeed;
        System.out.println("now i moved down "+ x +" "+ y );


    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
        System.out.println("now i moved left "+ x +" "+ y );

    }

    @Override
    public void moveRight() {
        x+=xSpeed;
        System.out.println("now i moved right "+ x +" "+ y );

    }
}
