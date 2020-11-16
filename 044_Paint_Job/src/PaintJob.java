public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        if(extraBuckets < 0) {
            return -1;
        }

        int bucketCount = (int) Math.ceil(width * height / areaPerBucket - extraBuckets);

        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        return PaintJob.getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if(area <= 0) {
            return -1;
        }

        double widthAndHeight = Math.sqrt(area);
        return PaintJob.getBucketCount(widthAndHeight, widthAndHeight, areaPerBucket);
    }
}
