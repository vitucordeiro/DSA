package com.example.arrays;

public class BiArray {
    private int posX, posY;
    private int lengthX, lengthY;
    
    private int[][] array;

    public BiArray(int lengthX, int lengthY){
        this.lengthX = lengthX;
        this.lengthY = lengthY;
        this.array = new int[lengthX][lengthY];
        this.posX = lengthX / 2;
        this.posY= lengthY / 2;
    }

    public void displayArray(){
        this.array[posX][posY] = 1;
        for(int[]column : this.array){
            for(int row : column){
                System.out.print(row + " ");
            }
            System.err.println();
        }
        this.array[posX][posY] = 0;
    }
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getLengthX() {
        return lengthX;
    }

    public void setLengthX(int lengthX) {
        this.lengthX = lengthX;
    }

    public int getLengthY() {
        return lengthY;
    }

    public void setLengthY(int lengthY) {
        this.lengthY = lengthY;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

}
