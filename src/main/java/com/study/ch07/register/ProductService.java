package com.study.ch07.register;

public class ProductService {

 boolean isEmptyString(String str) {

     // w

      if(str == null) {
          return true;

      }
      return !str.isBlank(); // isBlank() 자바 11부터 추가됨 자동으로 공백(스페이스)를 지워서 공백이 있는지를 파악함.
                            // 비어있냐고 물어봄 비어 있어야 true

      }

      void registerProductService(Product product) {
     ProductRepsitory productRepsitory = new ProductRepsitory();
          System.out.println("서비스 까지 데이터 전달함");

          productRepsitory.saveProduct(product); // 아직 주소는 살아있음

          //자동 소멸

          // 중간에 소멸을 시켜줘야한다. 여유 공간이 있어야

      }


    }

