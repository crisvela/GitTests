public class shapes {
    
    public static void drawRectangle (int width){
        int length = width * 2;
    
        for (int x = 1; x <= width; x++) {
               
    
            for(int y = 1; y <= length; y++ /* x++ = x+1 */ ) {
                System.out.print("b");    
            }
            
            System.out.println("");
            
            
        }
  
    }
    
    public static void main(String args[]) {
        System.out.println("Rectangle:");
        shapes.drawRectangle(5);
        
    }
}