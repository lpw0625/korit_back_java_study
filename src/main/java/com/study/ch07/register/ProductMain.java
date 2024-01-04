package com.study.ch07.register;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        ProductService productService = new ProductService();

        Scanner scanner = new Scanner(System.in); //셋팅


        String productName = null;
        String productCode = null;
        long productPrice = 0; // 21억 이하이면 long을 쓰자.


        System.out.println("상품 등록 프로그램");


        System.out.print("상품명: ");
        productName = scanner.nextLine();
        if(productService.isEmptyString(productName)){
            //return 이 boolean 자료형이면 empty로 쓰면 된다.
            System.out.println("상품명을 다시 입력하세요.");
            return;
        }


        System.out.println("상품코드번호(POO24000): ");
        productCode = scanner.nextLine();
        if(productService.isEmptyString(productCode))  {
            System.out.println("상품코드번호을 다시 입력하세요.");
            return;
        }

        System.out.println("가격>>> ");
        productPrice = scanner.nextLong(); // service에 넘겨야함

        Product product = new Product(productName,productCode,productPrice); // Product 생성.


        productService.registerProductService(product); // Product 정보를 넘겨 받음.




}
}