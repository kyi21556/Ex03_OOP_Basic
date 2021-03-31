package kr.or.bit;

public class Car {

    private int window;
    private int speed;
    
    public int getWindow() {
        return window;
    }
    public void setWindow(int window) {
        this.window = window;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
        }else {
            this.speed = speed;
        }
        
    }
public void speedUp() {
        this.speed+=10;
    }
    public void speedDown() {
        if(this.speed > 0) {
            this.speed-=10;
        }else {
            this.speed = 0;
        }
        
    }

}
