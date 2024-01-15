package com.study.exam5;

 class Order {
     private int orderId = 100;
     private String productName = "Samsung GalaxyBooks2 Pro";
     private String consumerName = "홍길동";
     private int price = 1450000;
     private int stock = 2;

    public Order setOrderId (int orderId) {
        this.orderId = orderId;
        return this;
    }

    public Order setProductName(String productName) {

        this.productName = productName;
        return this;
    }

    public Order setConsumerName (String consumerName) {
        this.consumerName = consumerName;
        return this;
    }

    public Order setPrice(int price)  {
        this.price = price;
        return this;
    }

    public Order setStock(int stock) {

        return this;
    }

     @Override
     public String toString() {
         return "Order{" +
                 "orderId=" + orderId +
                 ", productName='" + productName + '\'' +
                 ", consumerName='" + consumerName + '\'' +
                 ", price=" + price +
                 ", stock=" + stock +
                 '}';
     }

     public void showOrderInfo() {
         System.out.println( "주문번호 :" + orderId);
         System.out.println("상품명 : " + productName);
         System.out.println("구마자 : " + consumerName);
         System.out.println("가격 : " + price + " 원.");
         System.out.println("수량 : " + stock );


     }

 }



