package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
//  @Pointcut("execution(void org.example.dao.BookDao.update())")
  // *:表示任意，..表示任意多个,+匹配子类
  @Pointcut("execution(* org.example.dao.BookDao.*())")
  private void pt() {

  }

  @Before("pt()")
  public void method(JoinPoint jp) {
    Object[] args = jp.getArgs(); // 获取参数
    System.out.println(System.currentTimeMillis());
  }

  @After("pt()")
  public void method3(JoinPoint jp) {
    Object[] args = jp.getArgs(); // 获取参数
    System.out.println(System.currentTimeMillis());
  }

  @Around("pt()") // 环绕,如果有返回值需要接收并返回
  // @AfterReturning("pt()") // 返回值后通知
  // @AfterThrowing("pt()") // 异常后通知
  public Object method2(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("before");
    pjp.proceed();
    System.out.println("after");
    Signature signature = pjp.getSignature();
    signature.getName(); // 方法名
    signature.getDeclaringType(); // 类型
    signature.getDeclaringTypeName(); // 类型字符串
    pjp.getArgs(); // 获取参数
    return true;
  }

  @AfterReturning(value = "pt()", returning = "ret")
  public Object method4(Object ret) {
    return ret;
  }

  @AfterThrowing(value = "pt()", throwing = "t")
  public void method5(Throwable t) {

  }
}
