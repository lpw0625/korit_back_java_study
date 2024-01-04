package com.study.ch07.register;

public class ProductRepsitory {

    void saveProduct(Product product) {
        ProductDB productDB = new ProductDB();
        productDB.insertProduct(product); // 메인에서 db클래스까지 데이터가 전달


    }
}
