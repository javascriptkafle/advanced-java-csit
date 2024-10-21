class _1_2_1_arrays{
    public static void main(String args[]){
        // array = used to store multiple values in a single variable

        /**
         * decraration and initialization of an array example
         */
        String[] cars = {"toyota","mustang","tata"};
        cars[0] = "Ford"; // modifying the first element of an array
        System.out.println(cars[0]); // Ford
        System.out.println(cars[1]); // mustang
        System.out.println(cars[2]); // tata

        System.out.println(cars[3]); // ArrayIndexOutOfBounds exception

        /**
         * int[] nums = {1,2,"ram"}; // type mismatch
         * all the array elements should be of same type which in this case is int
         */

        /**
         * To store values later by declaring an array of some size
         */
        String[] colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Pink";
        colors[2] = "Black";

        /**
         * Iterating through arrays using for loop 
         */
        for(int i=0;i<colors.length;i++){
            System.out.println(colors[i]);
        }

    }
}