package chapter9.homework;

 class AnotherClient implements CallBack{
  // Implement CallBack's interface

  @Override
  public void callBack(int p) {
   System.out.println("Another version of callback");
   System.out.println("p squared is " + (p*p));
  }
 }
