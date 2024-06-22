package practice;

class P1 {
    public static void main(String[] args) {
        int width=10;
        int height=20;
       /* Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing: "+width*height);
            }
        };*/
        Runnable r = () -> System.out.println("Drawing: "+width*height);
        r.run();
    }
}
