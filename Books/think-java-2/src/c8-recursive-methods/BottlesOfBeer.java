public class BottlesOfBeer {
    public static void main(String[] args) {
        recurseBottles(100);
    }
    // decrease the number of bottles until zero
    public static void recurseBottles(int bottles) {
        //base case
        if (bottles == 0) {
            noBottlesOnWall();
        }
        else {
            bottlesOnWall(bottles);
            recurseBottles(bottles-1);
        }
    }

    // print the verse
    public static void bottlesOnWall(int bottles) {
        System.out.println(bottles + " bottles of beer on the wall,\n" +
                bottles + " bottles of beer,\n" +
                "ya’ take one down, ya’ pass it around,\n" +
                (bottles-1) + " bottles of beer on the wall.");
    }

    // print the verse when reach zero
    public static void noBottlesOnWall() {
        System.out.println("No bottles of beer on the wall,\n" +
                "no bottles of beer,\n" +
                "ya’ can’t take one down, ya’ can’t pass it around,\n" +
                "’cause there are no more bottles of beer on the wall!");
    }

}
