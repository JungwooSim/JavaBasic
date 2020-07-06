package me.study.generics_enumeration_annotation;

enum Direction {
    EAST, SOUTH, WEST, NORTH
}

public class EnumEx1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1); // EAST
        System.out.println("d2 = " + d2); // WEST
        System.out.println("d3 = " + d3); // EAST

        System.out.println("d1==d2 : " + (d1==d2)); // false
        System.out.println("d1==d3 : " + (d1==d3)); // true
        System.out.println("d1.equals(d3) ? "+ d1.equals(d3)); // true
//        System.out.println("d2 > d3 ? " + (d1 > d3)); // error
        System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3)); // 0
        System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2)); // -2

        switch (d1) {
            case EAST: // Direction.EAST라고 쓸 수 없음.
                System.out.println("The direction is EAST.");
                break;
            case SOUTH: // Direction.EAST라고 쓸 수 없음.
                System.out.println("The direction is SOUT.");
                break;
            case WEST: // Direction.EAST라고 쓸 수 없음.
                System.out.println("The direction is WEST.");
                break;
            case NORTH: // Direction.EAST라고 쓸 수 없음.
                System.out.println("The direction is NORTH.");
                break;
            default:
                System.out.println("Invalid direction.");
                break;
        }
        Direction[] dArr = Direction.values();

        for (Direction d : dArr) // for(Direction d : Direction.value())
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
    }
}
