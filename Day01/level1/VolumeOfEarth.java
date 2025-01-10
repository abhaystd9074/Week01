public class VolumeOfEarth {
    public static void main(String[] args) {
        // Radius of the Earth in kilometers
        double radius = 6378;
        //calculate the volume 
        double volumeInKm = ((4.0 / 3.0) * (22.0 / 7.0) * (radius * radius * radius));
        // Convert the volume into cubic miles
        double volumeInM = (volumeInKm * 1.6 * 1.6 * 1.6);
        
        //print volume in km3 andmiles3 
       System.out.printf("The volume of Earth in cubic kilometers is %.2f  and in cubic miles is %.2f ", volumeInKm, volumeInM);
    }
}

