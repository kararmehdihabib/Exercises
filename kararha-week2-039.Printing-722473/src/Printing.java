public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        for(int i=0;i<amount;i++){
        System.out.print("*");
       
        }System.out.println();
        // call this command amount times        
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int i=0;
        
            for(int j=0;j<sideSize;j++){
            //System.out.println("***");
                printStars(sideSize);
        }
        
    }

    public static void printRectangle(int width, int height) {
        // 39.3s
        for(int y=0;y<height;y++){
            
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        // 39.4
          //for (int i=0; i<=size; i++)
 // {
  for (int j=1; j<=size; j++)
  {
  printStars(j);
  }
  
  }

     
           
    
    
    public static void width(int width){
        for(int t=0;t<width;t++){
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
