package org.jayanta.dataStructure;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetDataStructure {
    public static void main(String [] args){

        Set<Ball>  balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("black"));

        balls.forEach(System.out::println);

    }

    public static class Ball{
        String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

}

/*
Sets doesn't allow duplicate entry
order is not maintain
it is like a bag we don't know what inside the bag we just grab any item inside tha bag
for set we need to override the equal and hashCode methods
 */