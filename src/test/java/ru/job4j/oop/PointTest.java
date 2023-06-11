package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when10to20then1() {
        double expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to20then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to21then1() {
        double expected = 1;
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when114to212then2dot23() {
        double expected = 2.23;
        Point a = new Point(1, 1, 4);
        Point b = new Point(2, 1, 2);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when114to212then3dot16() {
        double expected = 3.16;
        Point a = new Point(1, 1, 6);
        Point b = new Point(2, 1, 9);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}
