//package com.apple.shop;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
//
//@ControllerAdvice
//public class MyExceptionHandler {
//    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
//    public ResponseEntity<String> handler(){
//        return ResponseEntity.status(400).body("내 잘못 아님ㅜㅜ");
//    }
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> ahandler(){
//        return ResponseEntity.status(400).body("내 잘못 아님ㅜㅜ");
//    }
//}
