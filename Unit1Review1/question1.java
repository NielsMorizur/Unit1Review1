class question1 {
    public static void main (String[] args) {
        int x = 1000;
        int xt = 0;
        while (x > 0) {
            System.out.print(x + " ");
            xt = xt + x;
            x = x - 5;
        }
        System.out.println("");
        System.out.println("Total: " + xt);
    }
}