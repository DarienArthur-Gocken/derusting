public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] strings = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    strings[0] = "Hey";
    strings[1] = "Test";
    strings[2] = "Third";
    strings[3] = "Fourth";

    // Get the value of the array at index 2
    System.out.println(strings[2]);

    // Get the length of the array
    System.out.println(strings.length);

    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0; i < strings.length; i++) {
      System.out.println(strings[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for(String str : strings) {
      System.out.println(str);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
