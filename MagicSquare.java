import java.util.Scanner;

public class MagicSquare{

	public int[][] magicSquare(int n){
	
		int m_square[][] = new int[n][n];
		int i, j;
		
		
		for (i = 0; i < n; i++){
		
			for (j = 0; j < n; j++){
			
				m_square[i][j] = 0;
			}
		}
		int k = 1;
		i = 0;
		j = (n - 1)/2;
		m_square[i][j] = k;
		
		while (k < (n*n)) {
		
			while (!(k % n == 0)){
				k ++;
				i --;
				j --;
				if (i  < 0){
					i = n -1;
				}
				if (i > n){
					i = 0;
				}
				
				if (j  < 0){
					j = n -1;
				}
				if (j > n){
					j = 0;
				}
				
				m_square[i][j] = k;
			
			}
			
			if (k != n*n){
		
				k ++ ;
				i ++;
				
				if (i < 0){
					i = n -1;
				}
				if (i > n){
					i = 0;
				}
				
				m_square[i][j] = k;
			}
		}
		
		return m_square;
	
	}
	
	public void run(){
	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the square size of the magic square");
		int user_input = sc.nextInt();
		
		
		while (true){
			if (user_input%2 == 0){
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Please enter an odd number greater than 1");
				user_input = sc2.nextInt();
			}
			else{break;}
		}
		int[][] matrix = magicSquare(user_input);
		
		for (int a = 0; a < matrix.length; a++){
			for (int b = 0; b < matrix.length; b++){
				System.out.print(matrix[a][b] + "\t");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String arg[]){
		MagicSquare ms = new MagicSquare();
		ms.run();
	
	}

}
