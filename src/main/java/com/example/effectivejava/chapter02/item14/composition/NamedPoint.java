package com.example.effectivejava.chapter02.item14.composition;

public class NamedPoint implements Comparable<NamedPoint> {

    private final Point point;
    private final String name;

    public NamedPoint(Point point, String name) {
        this.point = point;
        this.name = name;
    }

    public Point getPoint() {
        return this.point;
    }

    @Override
    public int compareTo(NamedPoint namedPoint) {
        int result = this.point.compareTo(namedPoint.point);
        if (result == 0) {
            result = this.name.compareTo(namedPoint.name);
        }
        return result;
    }
}

/**
 * 상속을 하는 순간 equals 규약이 깨지게 된다.
 * equals 규약을 지키면서 확장을 하기 위해서는 컴포지션을 사용하자.
 */