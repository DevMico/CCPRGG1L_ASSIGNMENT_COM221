public class exercise {
  public static void main(String[] args) throws Exception {

      int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
  

      // PATTERN 1
      int columnsum = 0;
      int rowsum = 0;
      int pattern3 = 0;
      int pattern4 = 0;
      int pattern5 = 0;
      int pattern6 = 0;
      for (int row = 0; row < mdArray.length; row++){

        int rowsum2 = mdArray[row][0];
        rowsum = rowsum2 + rowsum;
        
        for (int column = 0; column < 4; column++){
            
            if (row == 0 || column == 0){
                pattern3 = mdArray[row][column] + pattern3;
            }
            if (row == 0){
            int columnsum2 = mdArray[row][column];
            columnsum = columnsum2 + columnsum;
            }
            if (row == 0 && column == 0 || row == 0 && column == 3 || row == 3 && column == 0 || row == 3 && column == 3){
                pattern4 = mdArray[row][column] + pattern4;
            }
            if (row == 1 && column == 1 || row == 1 && column == 2 || row == 2 && column == 1 || row == 2 && column == 2){
                pattern5 = mdArray[row][column] + pattern5;
            }
            if (row == 1 && column == 1 || row == 1 && column == 2 || row == 2 && column == 1 || row == 2 && column == 2 || row == 0 && column == 0 || row == 0 && column == 3 || row == 3 && column == 0 || row == 3 && column == 3){
                pattern6 = mdArray[row][column] + pattern6;
            }
        }
        
        
         
    }

        
      System.out.println("1. SUM OF PATTERN 1 is: " + columnsum);
      
      // PATTERN 2
      System.out.println("");
      System.out.println("2. SUM OF PATTERN 2 is: " + rowsum);
      
      // PATTERN 3
      System.out.println("");
      System.out.println("3. SUM OF PATTERN 3 is: " + pattern3);
      
      // PATTERN 4
      System.out.println("");
      System.out.println("4. SUM OF PATTERN 4 is: " + pattern4);
      
      // PATTERN 5
      System.out.println("");
      System.out.println("5. SUM OF PATTERN 5 is: " + pattern5);
    
      // PATTERN 6
      System.out.println("");
      System.out.println("6. SUM OF PATTERN 6 is: " + pattern6);
  }
}
