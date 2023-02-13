class Example3 {
  public static void main(String args[]) {
 
   String str="bitLabs";
    int a=100;
    int b=50;
 
    System.out.println(str+a+b);  //   bitLabs+100=> bitLabs100+50  ===> bitLabs10050
    System.out.println(a+b+str);  //   100+50 --> 150+bitLabs  --> 150bitLabs 
    System.out.println(b+str+a);  //   50+bitLabs-->  50bitLabs+100  -->50bitLabs100
    
 
  }
}