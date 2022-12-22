package com.niho.tester;

public class AlgorithomTest {

	public static void main(String[] args) {
		
		SparseMatrix();
	}

	public static void SparseMatrix() {
		// 創建原始的二維陣列 11*11
		// 0: 沒有旗子, 1:黑子, 2:藍子
		int chessArr1[][] = new int[11][11];
		chessArr1[1][2] = 1;
		chessArr1[2][3] = 2;
		// 輸出原始二維陣列
		for (int[] row : chessArr1) {
			for (int data : row) {
				System.out.printf("%d ", data);
			}
			System.out.println();
		}

		System.out.println("----------------------");
		// 1.先遍歷二維陣列,獲取非0數據個數
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (chessArr1[i][j] != 0)
					sum++;
			}
		}
		System.out.println(sum);
		System.out.println("----------------------");
		
		// 2.創建對應的稀疏矩陣
		int sparseArr[][] = new int[sum + 1][3]; // 列:sum為非0值的個數+1列存放原始二維陣列資訊 行:列,行,非0值

		// 給稀疏矩陣賦值
		sparseArr[0][0] = 11;
		sparseArr[0][1] = 11;
		sparseArr[0][2] = sum;

		// 遍歷二維陣列,將非0值存放到稀疏矩陣中
		int count = 0; // 用於紀錄是第幾個非0數據
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (chessArr1[i][j] != 0) {
					count++;
					sparseArr[count][0] = i;
					sparseArr[count][1] = j;
					sparseArr[count][2] = chessArr1[i][j];
				}
			}
		}

		// 輸出稀疏矩陣
		for (int[] row : sparseArr) {
			for (int data : row) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
	}

}
