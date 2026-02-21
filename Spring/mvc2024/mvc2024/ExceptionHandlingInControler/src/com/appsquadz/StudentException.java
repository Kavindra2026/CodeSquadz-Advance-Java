package com.appsquadz;

public class StudentException extends RuntimeException{
   private String exceptionMsg;
   
   public StudentException(String exceptionMsg) {
      this.exceptionMsg = exceptionMsg;
   }
   public String getExceptionMsg(){
      return this.exceptionMsg;
   }
   public void setExceptionMsg(String exceptionMsg) {
      this.exceptionMsg = exceptionMsg;
   }
}