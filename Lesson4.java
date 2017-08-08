import java.util.Random;
import java.util.Scanner;

/**
 * Java. Level 1. Lesson 4.  homework
 *
 * @author Sergey Chernykh
 * @version dated Aug 07, 2017
 */
public class TicTacToe {

    final char DOT_EMPTY = '.';
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    int size;
    int block;
    char[][] map;
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        new TicTacToe();
    }

    TicTacToe(){
        customizeGame();
        initMap();
        //printMap();
        while (true) {
            humanTurn();                                // метод хода человека
            printMap();
            if (checkWin(DOT_X)) {                      // метод проверки победил ли человек
                System.out.println("Humen WIN!!");
                break;
            }
            if (isMapFull()) {                          // проверка если полностью заполнен но некто не победил
                System.out.println("Sorry DRAW");
                break;
            }
            aiTurn();                                   // метод хода ИИ
            printMap();
            if (checkWin(DOT_O)) {                      // метод проверки победил ли человек
                System.out.println("AI WIN!!");
                break;
            }
            if (isMapFull()) {                          // проверка если полностью заполнен но некто не победил
                System.out.println("Sorry DRAW");
                break;
            }

            }

    }

    void  initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++)
                map[i][j] = DOT_EMPTY;
        }
    }

    void printMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
    }

    void  aiTurn() {
        int x,y;
        do {
            x = random.nextInt(size);
            y = random.nextInt(size );

        } while (!isCellValid(x,y));
        map[y][x] = DOT_O;
    }

    void humanTurn() {
        int x,y;
        do {
            System.out.println("Введите кординаты X Y (1.." + size +  ")");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;

        } while (!isCellValid(x,y));
        map[y][x] = DOT_X;

    }

    boolean isCellValid(int x, int y) {
        if ((x < 0  || x >= size) || (y < 0 ||y >= size)) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

   /* boolean checkWin(char symb) {
        // check horizontals
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        // check verticals
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        // check diagonales
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }
*/
   
    void customizeGame() {
        do {
            System.out.print("Размер поля [3-10]: ");
            size = sc.nextInt();
        } while(size<3 || size>10);

        do {
            System.out.print("Сколько фишек для победы [3-"+size+"]: ");
            block = sc.nextInt();
        } while (block<3 || block>size);

    }

    
    boolean checkWin(char symb) {
        for (int col=0; col<size-block+1; col++) {
            for (int row=0; row<size-block+1; row++) {
                if (checkDiagonal(symb, col, row) || checkLanes(symb, col, row)) return true;
            }
        }
        return false;
    }


    boolean checkDiagonal(char symb, int offsetX, int offsetY) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i=0; i<block; i++) {
            toright &= (map[i+offsetX][i+offsetY] == symb);
            toleft &= (map[block-i-1+offsetX][i+offsetY] == symb);
        }

        if (toright || toleft) return true;

        return false;
    }


    boolean checkLanes(char symb, int offsetX, int offsetY) {
        boolean cols, rows;
        for (int col=offsetX; col<block+offsetX; col++) {
            cols = true;
            rows = true;
            for (int row=offsetY; row<block+offsetY; row++) {
                cols &= (map[col][row] == symb);
                rows &= (map[row][col] == symb);
            }

            if (cols || rows) return true;
        }

        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }
}
