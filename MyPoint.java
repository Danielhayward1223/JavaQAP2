public static class MyPoint{
    private int x;
    private int y;

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint copy){
        this.x = copy.x;
        this.y = copy.y;
    }
}