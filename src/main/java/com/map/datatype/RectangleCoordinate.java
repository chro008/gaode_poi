package com.map.datatype;

/**
 * @author lixiaoming
 * @date 2019/1/25 10:36
 * 矩形块的经纬度标识， 左上角的经纬度 和右下角的经纬度
 */
public class RectangleCoordinate {

    /**
     * 矩形左上角经度
     */
    private double x0;

    /**
     * 矩形左上角纬度
     */
    private double y0;

    /**
     * 矩形右下角经度
     */
    private double x1;

    /**
     * 矩形右下角纬度
     */
    private double y1;


    public RectangleCoordinate(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    /**
     * @return 获取矩形中心线的纬度
     */
    public double getAverageY() {
        return (y0 + y1) / 2;
    }

    /**
     * @return 获取矩形中心线的经度
     */
    public double getAverageX() {
        return (x0 + x1) / 2;
    }

    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getY0() {
        return y0;
    }

    public void setY0(double y0) {
        this.y0 = y0;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public String getPolygonString() {
        return x0 + "," + y0 + "|" + x1 + "," + y1;
    }

    @Override
    public String toString() {
        return "[" + x0 + "," + y0 + "|" + x1 + "," + y1 + "]";
    }

}
