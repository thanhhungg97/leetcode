package org.example;

public class GFTTest3 {
    enum Direction {
        LEFT,
        RIGHT,
        UP,
        DOWN
    }

    class VisitedObject {
        boolean visited;
        Direction direction;

        public VisitedObject(boolean visited, Direction direction) {
            this.visited = visited;
            this.direction = direction;
        }
    }

    int solution(String[] string) {
        if (string.length == 0) {
            return 0;
        }
        int lengthY = string.length;
        int lengthX = string[0].length();
        int[][] array = new int[lengthY][lengthX];
        VisitedObject[][] visited = new VisitedObject[lengthY][lengthX];

        for (int i = 0; i < string.length; i++) {
            for (int j = 0; j < lengthX; j++) {
                if (string[i].charAt(j) == '.') {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        int xIndex = 0;
        int yIndex = 0;
        Direction direction = Direction.RIGHT;
        while (true) {

            if (direction == Direction.RIGHT && (xIndex == lengthX || array[yIndex][xIndex] == 1)) {
                xIndex -= 1;
                direction = Direction.DOWN;
            } else if (direction == Direction.DOWN && (yIndex == lengthY || array[yIndex][xIndex] == 1)) {
                yIndex -= 1;
                direction = Direction.LEFT;
            } else if (direction == Direction.LEFT && (xIndex == -1 || array[yIndex][xIndex] == 1)) {
                xIndex += 1;
                direction = Direction.UP;
            } else if (direction == Direction.UP && yIndex == -1 || array[yIndex][xIndex] == 1) {
                yIndex += 1;
                direction = Direction.RIGHT;
            }
            if (visited[yIndex][xIndex] == null) {
                visited[yIndex][xIndex] = new VisitedObject(true, direction);
            } else {
                if (visited[yIndex][xIndex].direction == direction) {
                    break;
                }
            }

            switch (direction) {
                case RIGHT -> {
                    xIndex += 1;
                    break;
                }
                case DOWN -> yIndex += 1;
                case LEFT -> xIndex -= 1;
                case UP -> yIndex -= 1;
            }


        }
        int count = 0;

        for (int i = 0; i < string.length; i++) {
            for (int j = 0; j < lengthX; j++) {
                if (visited[i][j] != null) {
                    count += 1;
                }
            }
        }
        return count;
    }

}
