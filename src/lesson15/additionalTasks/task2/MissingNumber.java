package lesson15.additionalTasks.task2;

import java.util.Random;

public class MissingNumber {
  public static void startFindMissingNumberProgram() {
    findMissingNumber(getPreparedArrayOfNumbers());
  }

  public static void findMissingNumber(int[] arrayOfNumbers) {
    int missingNumber;
    int sumOfNumbers = 0;
    int exceptedSumOfNumbers = 0;
    int counter = 1;

    for (int number : arrayOfNumbers) {
      sumOfNumbers += number;
      exceptedSumOfNumbers += counter;
      counter++;
    }

    printArrayOfNumbers(arrayOfNumbers);
    missingNumber = exceptedSumOfNumbers - sumOfNumbers;
    System.out.println("Пропущенное число: " + missingNumber);
  }

  public static int[] getPreparedArrayOfNumbers() {
    int lastNumber = new Random().nextInt(2, 20);
    int missedNumber = new Random().nextInt(1, lastNumber);
    int[] arrayOfNumbers = new int[lastNumber];

    for (int i = 0; i < arrayOfNumbers.length; i++) {
      int tempNumber = i + 1;
      if (tempNumber == missedNumber) {
        arrayOfNumbers[i] = 0;
        continue;
      }
      arrayOfNumbers[i] = tempNumber;
    }
    return arrayOfNumbers;
  }

  public static void printArrayOfNumbers(int[] array) {
    System.out.println("Массив чисел:");
    for (int number : array) {
      System.out.print(number + " ");
    }
    System.out.println();
  }
}
