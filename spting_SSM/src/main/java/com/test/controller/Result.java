package com.test.controller;

public class Result<T> {
  private int code;
  private String msg;
  private T data;

  public Result(int code, T data, String msg) {
    this.code = code;
    this.msg = msg;
    this.data = data;
  }

  public Result(int code, T data) {
    this.code = code;
    this.data = data;
  }

  public Result() {
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Object getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
