class MedianFinder {

    // Min-heap for the larger half of the numbers
    private PriorityQueue<Integer> minHeapForLargeNum;
    // Max-heap for the smaller half of the numbers
    private PriorityQueue<Integer> maxHeapForSmallNum;

    public MedianFinder() {
        // Initializing the heaps
        minHeapForLargeNum = new PriorityQueue<>();
        maxHeapForSmallNum = new PriorityQueue<>((a, b) -> b - a);
    }
    
    public void addNum(int num) {
        if (maxHeapForSmallNum.isEmpty() || maxHeapForSmallNum.peek() >= num) {
            maxHeapForSmallNum.offer(num);
        } else {
            minHeapForLargeNum.offer(num);
        }
        
        // Balance the heaps
        if (maxHeapForSmallNum.size() > minHeapForLargeNum.size() + 1) {
            minHeapForLargeNum.offer(maxHeapForSmallNum.poll());
        } else if (maxHeapForSmallNum.size() < minHeapForLargeNum.size()) {
            maxHeapForSmallNum.offer(minHeapForLargeNum.poll());
        }
    }
    
    public double findMedian() {
        if (maxHeapForSmallNum.size() == minHeapForLargeNum.size()) {
            return (maxHeapForSmallNum.peek() / 2.0) + (minHeapForLargeNum.peek() / 2.0);
        } else {
            return maxHeapForSmallNum.peek();
        }
    }
}
