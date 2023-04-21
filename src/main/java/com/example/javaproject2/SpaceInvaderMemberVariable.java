package com.example.javaproject2;

public class SpaceInvaderMemberVariable {
    int location; //멤버변수, 초기화 안해도 됨
    public final int MAX_LEVEL = 3;
    private void moveLeft() {
        location = location -1;
        System.out.printf("moveLeft: %d\n", location);
    }
    private void moveRight() {
        location = location + 1;
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable simv = new SpaceInvaderMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
    }
}
