package marvelmemory;
import java.util.*;


public class TileControl {
    //GLOBALS 
    
    //these hold the positions (ID) of each of the shapes and their pair.
    //this ID is handed out from initShuffleTiles() randomCollection array.
    
    int A1, AA1;
    int A2, AA2;
    int A3, AA3;
    int A4, AA4;
    int A5, AA5;
    int A6, AA6;
    int A7, AA7;
    int A8, AA8;
    int A9, AA9;
    int A10, AA10;
    int A11, AA11;
    int A12, AA12;
    int A13, AA13;
    int A14, AA14;
    int A15, AA15;
    int A16, AA16;
    int A17, AA17;
    int A18, AA18;
    int A19, AA19;
    int A20, AA20;
    int A21, AA21;
    int A22, AA22;
    int A23, AA23;
    int A24, AA24;
    int A25, AA25;
    int A26, AA26;
    int A27, AA27;
    int A28, AA28;
    int A29, AA29;
    int A30, AA30;
    int A31, AA31;
    int A32, AA32;
   
    
    
    //========================================================================================
    //          4X4 GAME BOARD TILE CONTROL
    //========================================================================================
    
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    public void initShuffle4x4Tiles(){
        int n = 0;
      
        //first add all the numbers from 0 to 15 into an array list, then shuffle it
        
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 15; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        //assign each shape their locations
        A1 = randomCollection.get(n);
        n++;	
        A2 = randomCollection.get(n);
        n++;	
        A3 = randomCollection.get(n);
        n++;	
        A4 = randomCollection.get(n);
        n++;	
        A5 = randomCollection.get(n);
        n++;	
        A6 = randomCollection.get(n);
        n++;	
        A7 = randomCollection.get(n);
        n++;	
        A8 = randomCollection.get(n);
        n++;	
        AA1 = randomCollection.get(n);
        n++;	
        AA2 = randomCollection.get(n);
        n++;	
        AA3 = randomCollection.get(n);
        n++;	
        AA4 = randomCollection.get(n);
        n++;	
        AA5 = randomCollection.get(n);
        n++;	
        AA6 = randomCollection.get(n);
        n++;	
        AA7 = randomCollection.get(n);
        n++;	
        AA8 = randomCollection.get(n);
        n++;	
    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int get4x4TileType(int ID){
        int type = 100;
        
        System.out.print("Type_Code: ");
        if (ID == A1 || ID == AA1){			
            type = 0;
            System.out.print(type + " - A1");
        }								
        else if (ID == A2 || ID == AA2){			
            type = 1;
            System.out.print(type + " - A2");
        }								
        else if (ID == A3 || ID == AA3){			
            type = 2;
            System.out.print(type + " - A3");
        }								
        else if (ID == A4 || ID == AA4){			
            type = 3;
            System.out.print(type + " - A4");
        }								
        else if (ID == A5 || ID == AA5){			
            type = 4;
            System.out.print(type + " - A5");
        }								
        else if (ID == A6 || ID == AA6){			
            type = 5;
            System.out.print(type + " - A6");
        }								
        else if (ID == A7 || ID == AA7){			
            type = 6;
            System.out.print(type + " - A7");
        }								
        else if (ID == A8 || ID == AA8){			
            type = 7;
            System.out.print(type + " - A8");
        }	
        System.out.println();
        
        return type;
    }
    //========================================================================================
    //          6X6 GAME BOARD TILE CONTROL
    //========================================================================================
   
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    public void initShuffle6x6Tiles(){
        int n = 0;

        //first add all the numbers from 0 to 35 into an array list, then shuffle it.
        //then assign the value in slot 0 to a shape, etc etc. each shape gets a random value. 
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 35; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        A1 = randomCollection.get(n);
        n++;	
        A2 = randomCollection.get(n);
        n++;	
        A3 = randomCollection.get(n);
        n++;	
        A4 = randomCollection.get(n);
        n++;	
        A5 = randomCollection.get(n);
        n++;	
        A6 = randomCollection.get(n);
        n++;	
        A7 = randomCollection.get(n);
        n++;	
        A8 = randomCollection.get(n);
        n++;	
        A9 = randomCollection.get(n);
        n++;	
        A10 = randomCollection.get(n);
        n++;	
        A11 = randomCollection.get(n);
        n++;	
        A12 = randomCollection.get(n);
        n++;	
        A13 = randomCollection.get(n);
        n++;	
        A14 = randomCollection.get(n);
        n++;	
        A15 = randomCollection.get(n);
        n++;	
        A16 = randomCollection.get(n);
        n++;	
        A17 = randomCollection.get(n);
        n++;	
        A18 = randomCollection.get(n);
        n++;	
        AA1 = randomCollection.get(n);
        n++;	
        AA2 = randomCollection.get(n);
        n++;	
        AA3 = randomCollection.get(n);
        n++;	
        AA4 = randomCollection.get(n);
        n++;	
        AA5 = randomCollection.get(n);
        n++;	
        AA6 = randomCollection.get(n);
        n++;	
        AA7 = randomCollection.get(n);
        n++;	
        AA8 = randomCollection.get(n);
        n++;	
        AA9 = randomCollection.get(n);
        n++;	
        AA10 = randomCollection.get(n);
        n++;	
        AA11 = randomCollection.get(n);
        n++;	
        AA12 = randomCollection.get(n);
        n++;	
        AA13 = randomCollection.get(n);
        n++;	
        AA14 = randomCollection.get(n);
        n++;	
        AA15 = randomCollection.get(n);
        n++;	
        AA16 = randomCollection.get(n);
        n++;	
        AA17 = randomCollection.get(n);
        n++;	
        AA18 = randomCollection.get(n);
        n++;	
        
    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int get6x6TileType(int ID){
        int type = 100;
        
        System.out.print("Type_Code: ");
        if (ID == A1 || ID == AA1){			
            type = 0;
            System.out.print(type + " - A1");
        }								
        else if (ID == A2 || ID == AA2){			
            type = 1;
            System.out.print(type + " - A2");
        }								
        else if (ID == A3 || ID == AA3){			
            type = 2;
            System.out.print(type + " - A3");
        }								
        else if (ID == A4 || ID == AA4){			
            type = 3;
            System.out.print(type + " - A4");
        }								
        else if (ID == A5 || ID == AA5){			
            type = 4;
            System.out.print(type + " - A5");
        }								
        else if (ID == A6 || ID == AA6){			
            type = 5;
            System.out.print(type + " - A6");
        }								
        else if (ID == A7 || ID == AA7){			
            type = 6;
            System.out.print(type + " - A7");
        }								
        else if (ID == A8 || ID == AA8){			
            type = 7;
            System.out.print(type + " - A8");
        }								
        else if (ID == A9 || ID == AA9){			
            type = 8;
            System.out.print(type + " - A9");
        }								
        else if (ID == A10 || ID == AA10){			
            type = 9;
            System.out.print(type + " - A10");
        }								
        else if (ID == A11 || ID == AA11){			
            type = 10;
            System.out.print(type + " - A11");
        }								
        else if (ID == A12 || ID == AA12){			
            type = 11;
            System.out.print(type + " - A12");
        }								
        else if (ID == A13 || ID == AA13){			
            type = 12;
            System.out.print(type + " - A13");
        }								
        else if (ID == A14 || ID == AA14){			
            type = 13;
            System.out.print(type + " - A14");
        }								
        else if (ID == A15 || ID == AA15){			
            type = 14;
            System.out.print(type + " - A15");
        }								
        else if (ID == A16 || ID == AA16){			
            type = 15;
            System.out.print(type + " - A16");
        }								
        else if (ID == A17 || ID == AA17){			
            type = 16;
            System.out.print(type + " - A17");
        }								
        else if (ID == A18 || ID == AA18){			
            type = 17;
            System.out.print(type + " - A18");
        }								
        System.out.println();
        
        return type;
    }
    
    //========================================================================================
    //          8X8 GAME BOARD TILE CONTROL
    //========================================================================================
   
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    public void initShuffle8x8Tiles(){
        int n = 0;

        //first add all the numbers from 0 to 63 into an array list, then shuffle it.
        //then assign the value in slot 0 to a shape, etc etc. each shape gets a random value. 
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 63; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        A1 = randomCollection.get(n);
        n++;	
        A2 = randomCollection.get(n);
        n++;	
        A3 = randomCollection.get(n);
        n++;	
        A4 = randomCollection.get(n);
        n++;	
        A5 = randomCollection.get(n);
        n++;	
        A6 = randomCollection.get(n);
        n++;	
        A7 = randomCollection.get(n);
        n++;	
        A8 = randomCollection.get(n);
        n++;	
        A9 = randomCollection.get(n);
        n++;	
        A10 = randomCollection.get(n);
        n++;	
        A11 = randomCollection.get(n);
        n++;	
        A12 = randomCollection.get(n);
        n++;	
        A13 = randomCollection.get(n);
        n++;	
        A14 = randomCollection.get(n);
        n++;	
        A15 = randomCollection.get(n);
        n++;	
        A16 = randomCollection.get(n);
        n++;	
        A17 = randomCollection.get(n);
        n++;	
        A18 = randomCollection.get(n);
        n++;	
        A19 = randomCollection.get(n);
        n++;	
        A20 = randomCollection.get(n);
        n++;	
        A21 = randomCollection.get(n);
        n++;	
        A22 = randomCollection.get(n);
        n++;	
        A23 = randomCollection.get(n);
        n++;	
        A24 = randomCollection.get(n);
        n++;	
        A25 = randomCollection.get(n);
        n++;	
        A26 = randomCollection.get(n);
        n++;	
        A27 = randomCollection.get(n);
        n++;	
        A28 = randomCollection.get(n);
        n++;	
        A29 = randomCollection.get(n);
        n++;	
        A30 = randomCollection.get(n);
        n++;	
        A31 = randomCollection.get(n);
        n++;	
        A32 = randomCollection.get(n);
        n++;
        AA1 = randomCollection.get(n);
        n++;	
        AA2 = randomCollection.get(n);
        n++;	
        AA3 = randomCollection.get(n);
        n++;	
        AA4 = randomCollection.get(n);
        n++;	
        AA5 = randomCollection.get(n);
        n++;	
        AA6 = randomCollection.get(n);
        n++;	
        AA7 = randomCollection.get(n);
        n++;	
        AA8 = randomCollection.get(n);
        n++;	
        AA9 = randomCollection.get(n);
        n++;	
        AA10 = randomCollection.get(n);
        n++;	
        AA11 = randomCollection.get(n);
        n++;	
        AA12 = randomCollection.get(n);
        n++;	
        AA13 = randomCollection.get(n);
        n++;	
        AA14 = randomCollection.get(n);
        n++;	
        AA15 = randomCollection.get(n);
        n++;	
        AA16 = randomCollection.get(n);
        n++;	
        AA17 = randomCollection.get(n);
        n++;	
        AA18 = randomCollection.get(n);
        n++;	
        AA19 = randomCollection.get(n);
        n++;	
        AA20 = randomCollection.get(n);
        n++;	
        AA21 = randomCollection.get(n);
        n++;	
        AA22 = randomCollection.get(n);
        n++;	
        AA23 = randomCollection.get(n);
        n++;	
        AA24 = randomCollection.get(n);
        n++;	
        AA25 = randomCollection.get(n);
        n++;	
        AA26 = randomCollection.get(n);
        n++;	
        AA27 = randomCollection.get(n);
        n++;	
        AA28 = randomCollection.get(n);
        n++;	
        AA29 = randomCollection.get(n);
        n++;	
        AA30 = randomCollection.get(n);
        n++;	
        AA31 = randomCollection.get(n);
        n++;	
        AA32 = randomCollection.get(n);
        n++;	

    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int get8x8TileType(int ID){
        int type = 100;
        
        System.out.print("Type_Code: ");
        if (ID == A1 || ID == AA1){			
            type = 0;
            System.out.print(type + " - A1");
        }								
        else if (ID == A2 || ID == AA2){			
            type = 1;
            System.out.print(type + " - A2");
        }								
        else if (ID == A3 || ID == AA3){			
            type = 2;
            System.out.print(type + " - A3");
        }								
        else if (ID == A4 || ID == AA4){			
            type = 3;
            System.out.print(type + " - A4");
        }								
        else if (ID == A5 || ID == AA5){			
            type = 4;
            System.out.print(type + " - A5");
        }								
        else if (ID == A6 || ID == AA6){			
            type = 5;
            System.out.print(type + " - A6");
        }								
        else if (ID == A7 || ID == AA7){			
            type = 6;
            System.out.print(type + " - A7");
        }								
        else if (ID == A8 || ID == AA8){			
            type = 7;
            System.out.print(type + " - A8");
        }								
        else if (ID == A9 || ID == AA9){			
            type = 8;
            System.out.print(type + " - A9");
        }								
        else if (ID == A10 || ID == AA10){			
            type = 9;
            System.out.print(type + " - A10");
        }								
        else if (ID == A11 || ID == AA11){			
            type = 10;
            System.out.print(type + " - A11");
        }								
        else if (ID == A12 || ID == AA12){			
            type = 11;
            System.out.print(type + " - A12");
        }								
        else if (ID == A13 || ID == AA13){			
            type = 12;
            System.out.print(type + " - A13");
        }								
        else if (ID == A14 || ID == AA14){			
            type = 13;
            System.out.print(type + " - A14");
        }								
        else if (ID == A15 || ID == AA15){			
            type = 14;
            System.out.print(type + " - A15");
        }								
        else if (ID == A16 || ID == AA16){			
            type = 15;
            System.out.print(type + " - A16");
        }								
        else if (ID == A17 || ID == AA17){			
            type = 16;
            System.out.print(type + " - A17");
        }								
        else if (ID == A18 || ID == AA18){			
            type = 17;
            System.out.print(type + " - A18");
        }								
        else if (ID == A19 || ID == AA19){			
            type = 18;
            System.out.print(type + " - A19");
        }								
        else if (ID == A20 || ID == AA20){			
            type = 19;
            System.out.print(type + " - A20");
        }								
        else if (ID == A21 || ID == AA21){			
            type = 20;
            System.out.print(type + " - A21");
        }								
        else if (ID == A22 || ID == AA22){			
            type = 21;
            System.out.print(type + " - A22");
        }								
        else if (ID == A23 || ID == AA23){			
            type = 22;
            System.out.print(type + " - A23");
        }								
        else if (ID == A24 || ID == AA24){			
            type = 23;
            System.out.print(type + " - A24");
        }								
        else if (ID == A25 || ID == AA25){			
            type = 24;
            System.out.print(type + " - A25");
        }								
        else if (ID == A26 || ID == AA26){			
            type = 25;
            System.out.print(type + " - A26");
        }								
        else if (ID == A27 || ID == AA27){			
            type = 26;
            System.out.print(type + " - A27");
        }								
        else if (ID == A28 || ID == AA28){			
            type = 27;
            System.out.print(type + " - A28");
        }								
        else if (ID == A29 || ID == AA29){			
            type = 28;
            System.out.print(type + " - A29");
        }								
        else if (ID == A30 || ID == AA30){			
            type = 29;
            System.out.print(type + " - A30");
        }								
        else if (ID == A31 || ID == AA31){			
            type = 30;
            System.out.print(type + " - A31");
        }								
        else if (ID == A32 || ID == AA32){			
            type = 31;
            System.out.print(type + " - A32");
        }								

        System.out.println();
        
        return type;
    }
}
