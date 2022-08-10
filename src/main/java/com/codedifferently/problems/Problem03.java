package com.codedifferently.problems;

public class Problem03 {
    /**
     * You will be given an integer called number and an array called possibleFamilyMembers
     * your jobs is to find the number's family members. A family member is any value that's with in
     * 1 of any other number in the family.
     *
     * So for example if the number = 4, and the possibleFamilyMembers is [1,4,3,5]
     * The actualFamilyMembers would be [3,4,5]
     * 3 is 1 away from 4
     * 4 is equal to 4
     * 4 is 1 away from 5
     * while
     * 1 is not included because the closest relation to 1 is 3 and that's 2 away.
     * @param number
     * @param possibleFamilyMembers
     * @return
     */
    public Integer[] numberFamily(Integer number, Integer[] possibleFamilyMembers){
        // Convert possibleFamilyMemebers into a array list
        // Declare a new list of integers named output
        // If number is contained in list
        //      add to output
        // Go down
        // Declare a decremntIndex = 1
        // create a infinite while loop
        // Check if number - decremntIndex is contained in list
        //      if is in list add number - decremntIndex to position 0
        //      Else break
        // decrementIndex ++
        // Going Up
        // Declare a incIndex = 1
        // create a infinite while loop
        // Check if number + incIndex is contained in list
        //      if is in list add number + incIndex
        //      Else break
        // incIndex ++
        // Convert back to an array
        return null;
    }
}
