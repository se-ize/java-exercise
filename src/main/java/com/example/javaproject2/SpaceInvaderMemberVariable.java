package com.example.javaproject2;

public class SpaceInvaderMemberVariable {
    int location; //멤버변수, 초기화 안해도 됨
    public final int MAX_LEVEL = 3;
    public void moveLeft() {
        location = location -1;

    }
    public void moveLeftAndPrint() {
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }
    public void moveRight() {
        location = location + 1;
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
