//prime no 1-100
class Example1{
  public static void main(String args[]){
  int i,num,count;
    System.out.println("prime numbers from 1 to 100 are:");
    for(num = 1;num <= 100; num++)
      {
        count =0;
        for( i = 2;i <= num/2; i++){
          if(num % i == 0)
          {
           count++;
          
        }
      }
       if(count == 0 && num !=1){
         System.out.print(num + " ");
       }
      }
  }
}
       