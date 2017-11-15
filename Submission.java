	// Add your code here
    Difference(int[] elements) {
        this.elements = elements;
        
    }
    
    public void computeDifference() {
        
        int currentMax = Integer.MIN_VALUE;
        for(int i = 0; i < elements.length - 1; i++) {
            for(int j = i + 1; j < elements.length; j++) {
                int difference = Math.abs(elements[i] - elements[j]);
                if (difference > currentMax) {
                    currentMax = difference;
                }
            
            }
        }
        
        this.maximumDifference = currentMax;
    }