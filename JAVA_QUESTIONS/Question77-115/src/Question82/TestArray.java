package Question82;

public class TestArray {

    public static void main(String[] args) {

        // non-static inner class method Access
        Arrayoperations opp = new Arrayoperations(new int[] {1,2,3,4,5,6});
        Arrayoperations.Statistics stat = opp.new Statistics();
        System.out.println("Mean of array is: "+stat.mean());
        System.out.println("Median of array is: "+stat.median());


        // static inner class method Access
        Arrayoperations.Anshu sac = new Arrayoperations.Anshu();
        System.out.println("Mean of array is: "+sac.mean());
        System.out.println("Median of array is: "+sac.median());
    }
}
