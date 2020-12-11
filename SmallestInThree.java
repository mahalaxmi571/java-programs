class SmallestInThree {
     public static void main(String args[]){
        //three numbers
        int a = 20;
        int b = 10;
        int c = 30;
        int result;
         //find the smallest among three numbers 10,20,30
        if(a<b) {
            if(c<a) {
                result = c;
            } else {
                result = a;
            }
        } else {
            if(b<c) {
                result = b;
            } else {
                result= c;
            }
        }
        
        System.out.println("the smallest value among three numbers is:"+result);
    }
}
 