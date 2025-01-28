class luckyInteger {
    public int findLucky(int[] arr) {
        int[] numbers = new int[501];

        for (int j : arr) { 
			numbers[j]++; 
		}

        for (int i = 500; i > 0; i--) { 
			if (i == numbers[i]) {
                return i;
            } 
		}
        
        return -1;
    }
}