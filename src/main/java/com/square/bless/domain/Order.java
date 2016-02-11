package com.square.bless.domain;

public class Order {
    int row;
    int col;
    int[] products;

    int completionTime;

    public Order(int row, int col, int[] products) {
        this.row = row;
        this.col = col;
        this.products = products;
    }

    public static Order[] loadAll(java.util.Scanner scan) {

        int nbOrder = scan.nextInt();
        Order[] res = new Order[nbOrder];
        for(int i=0;i<nbOrder;i++) {
            int row =scan.nextInt();
            int col =scan.nextInt();
            int nbProduct = scan.nextInt();
            int[] products = new int[nbProduct];
            for (int j=0;j<nbProduct;j++) {
                products[j] = scan.nextInt();
            }
            res[i] = new Order(row, col, products);
        }
        return res;
    }

    public int getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(int completionTime) {
        this.completionTime = completionTime;
    }
}
