package HW_2;

import java.awt.*;
import java.awt.geom.Point2D;

public class FindClosest {

    private PointPair closestPointPair;
    private final QuickSort quicksort = new QuickSort();

    /**
     * Constructor
     *
     * @param points --> point array
     */
    public FindClosest(Point2D.Double[] points) {
        //Sort points by X coordinate
        quicksort.sort(points, 0, points.length - 1, "compareX");
        this.closestPointPair = calculateClosestPointPair(points, 0, points.length - 1);
        //*********************************do nothing***************************************//
    }

    /**
     * Get closest Point Pair
     *
     * @return closestPointPair
     */
    public PointPair getClosestPointPair() {
        return this.closestPointPair;
    }

    /**
     * Main method for calculate and return closest point pair
     *
     * @param p          --> point array
     * @param startIndex --> First index of p[]
     * @param lastIndex  --> last index of p[]
     * @return
     */
    private PointPair calculateClosestPointPair(Point2D.Double[] p, int startIndex, int lastIndex) {
        //Write codes here
        return new PointPair(p[startIndex], p[lastIndex]); //This line will deleted
    }

    /**
     * calculate and return closest point pair from 3 points
     *
     * @param p1 --> point 1
     * @param p2 --> point 2
     * @param p3 --> point 3
     * @return
     */
    private PointPair getClosestPointPair(Point2D.Double p1, Point2D.Double p2, Point2D.Double p3) {
        //Write codes here

        PointPair pointPair1_2 = new PointPair(p1, p2);
        PointPair pointPair2_3 = new PointPair(p2, p3);
        PointPair pointPair1_3 = new PointPair(p1, p3);

        PointPair pointPairCompared = getClosestPointPair(pointPair1_2, pointPair2_3);

        return getClosestPointPair(pointPairCompared, pointPair1_3);

    }

    private PointPair getClosestPointPair(PointPair p1, PointPair p2) {
        //Write codes here

        if (p1.getDistance() < p2.getDistance()) {
            return p1;
        } else {
            return p2;
        }
    }

    /**
     * A utility function to find the distance between the closest points of
     * strip of given size. All points in strip[] are sorted according to
     * y coordinate. They all have an upper bound on minimum distance as d.
     * Note that this method seems to be a O(n^2) method, but it's a O(n)
     * method as the inner loop runs at most 6 times
     *
     * @param strip        --> point array
     * @param size         --> strip array element count
     * @param shortestLine --> shortest line calculated so far
     * @return --> new shortest line
     */
    private PointPair stripClosest(Point2D.Double strip[], int size, PointPair shortestLine) {
        //Write codes here

        PointPair closestPair = shortestLine;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                PointPair closestFromStrip = new PointPair(strip[i], strip[j]);
                if ((strip[j].getY() - strip[i].getY()) < shortestLine.getDistance() && closestFromStrip.getDistance() <= closestPair.getDistance()) {
                    closestPair = closestFromStrip;
                }
            }
        }

        return closestPair;
    }

}