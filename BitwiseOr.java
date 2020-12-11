class BitwiseOr{
   public static void main(String args[]){
       int a=12,b=25,result;
	   result=a|b;
	   System.out.println("the result is:"+result);
	   
	   // BitwiseAnd
	   System.out.println("the result is:"+ (a&b));
	   
	   //xor
	   System.out.println("the result is:"+ (a^b));
	   
	   //signed LeftShift
	   System.out.println("the result is:"+ (a<<1));
	   
	   //Right Shift
	   System.out.println("the result is:"+ (a>>1));
   }
}