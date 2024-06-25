package com.test.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
  @ExceptionHandler(SystemException.class)
  public Result handleSystemException(SystemException ex) {
    System.out.println("发生异常le");
    return new Result<>(ex.getCode(), ex.getMessage());
  }

  @ExceptionHandler(Exception.class)
  public Result handleException(Exception ex) {
    System.out.println("发生异常le");
    return new Result<>(Codes.GET_ERROR, "失败");
  }
}
