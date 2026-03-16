public class ChessBoard {
    public static void main(String[] args) {
        // Создаём двумерный массив String размером 8x8
        String[][] chessBoard = new String[8][8];

        // Заполняем массив значениями B (чёрный) и W (белый) с помощью вложенных циклов
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // Если сумма индексов строки и столбца чётная — белая клетка (W),
                // если нечётная — чёрная клетка (B)
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
            }
        }
        System.out.println("Шахматная доска:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println(); // Переход на новую строку после каждой строки доски
        }
    }
}
