package HW_2;

import java.awt.geom.Point2D;

public class QuickSort {


    /**
     * Default Contructor
     */
    public QuickSort() {
        //Empty constructor --- do nothing
    }

    /**
     * The main function that implements QuickSort
     *
     * @param arr        --> Array to be sorted
     * @param startIndex --> First index of arr[]
     * @param lastIndex  --> Last index of arr[]
     * @param orderBy    --> compareX or compareY
     *                   compareX: sort minimum to maximum arr[] by X point
     *                   compareY: sort minimum to maximum arr[] by Y point
     */
    public void sort(Point2D.Double[] arr, int startIndex, int lastIndex, String orderBy) {
        //Write codes here
    }

    /**
     * A utility function to swap two elements
     *
     * @param arr --> Array to be sorted
     * @param i   --> first index
     * @param j   --> second index
     */
    private void swap(Point2D.Double[] arr, int i, int j) {
        //Write codes here

        Point2D.Double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    /**
     * Get Median of 3 order by Point.X
     *
     * @param arr   --> Array to be sorted
     * @param left  --> First index of arr[]
     * @param right --> Last index of arr[]
     * @return
     */
    private Point2D.Double getMedianX(Point2D.Double[] arr, int left, int right) {
        //Write codes here

        int center = (right + left) / 2;
        Point2D.Double pivot;

        if (arr[left].x < arr[center].x && arr[left].x > arr[right].x || arr[left].x > arr[center].x && arr[left].x < arr[right].x)
            pivot = arr[left];
        else if (arr[right].x < arr[center].x && arr[right].x > arr[left].x || arr[right].x > arr[center].x && arr[right].x < arr[left].x)
            pivot=arr[right];
        else
            pivot=arr[center];

        return pivot;
    }

    /**
     * Get Median of 3 order by Point.Y
     *
     * @param arr   --> Array to be sorted
     * @param left  --> First index of arr[]
     * @param right --> Last index of arr[]
     * @return
     */
    private Point2D.Double getMedianY(Point2D.Double[] arr, int left, int right) {
        //Write codes here
        int center = (right + left) / 2;
        Point2D.Double pivot;

        if (arr[left].y < arr[center].y && arr[left].y > arr[right].y || arr[left].y > arr[center].y && arr[left].y < arr[right].y)
            pivot = arr[left];
        else if (arr[right].y < arr[center].y && arr[right].y > arr[left].y || arr[right].y > arr[center].y && arr[right].y < arr[left].y)
            pivot=arr[right];
        else
            pivot=arr[center];

        return pivot;
    }

    /**
     * This function takes median of three as pivot, places
     * the pivot element at the end of the sorted
     * array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right of pivot
     * Sort order by Point.X
     *
     * @param arr        --> Array to be sorted
     * @param startIndex --> First index of arr[]
     * @param lastIndex  --> Last index of arr[]
     * @return pivot index
     */
    private int partitionX(Point2D.Double[] arr, int startIndex, int lastIndex) {
        //Write codes here

        Point2D.Double pivot= getMedianX(arr,startIndex,lastIndex);





        return -1; //This line will deleted
    }

    /**
     * This function takes median of three as pivot, places
     * the pivot element at the end of the sorted
     * array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right of pivot
     * Sort order by Point.Y
     *
     * @param arr        --> Array to be sorted
     * @param startIndex --> First index of arr[]
     * @param lastIndex  --> Last index of arr[]
     * @return pivot index
     */
    private int partitionY(Point2D.Double[] arr, int startIndex, int lastIndex) {
        //Write codes here
        return -1; //This line will deleted
    }

}
