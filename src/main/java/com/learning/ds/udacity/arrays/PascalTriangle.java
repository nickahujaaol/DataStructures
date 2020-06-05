package com.learning.ds.udacity.arrays;

import java.util.Arrays;

public class PascalTriangle {
	public static void main(String[] args) {
		createTriangle(10);
	}

	private static void createTriangle(int rows) {
		int[][] matrix = new int[rows][];
		matrix[0] = new int[1];
		matrix[0][0] = 1;

		for(int i = 1; i < rows; i++) {
			matrix[i] = new int[i+1];
			for(int j = 0; j < matrix[i].length; j++) {
				int topLeft = j -1 < 0 ? 0 : matrix[i-1][j-1];
				int topRight = j == matrix[i-1].length ? 0 : matrix[i-1][j];
				matrix[i][j] = topLeft + topRight;
			}

			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
