package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                // Create an array to store accident data for each city and vehicle type
                int[][] accidentData = new int[3][2];
                String[] cityNames = {"Cape Town", "Johannesburg", "Port Elizabeth"};

                // Prompt the user to enter accident data for each city and vehicle type
                for (int i = 0; i < accidentData.length; i++) {
                    System.out.println("Enter accident data for " + cityNames[i] + ":");

                    System.out.print("Number of car accidents: ");
                    accidentData[i][0] = scanner.nextInt();

                    System.out.print("Number of motorbike accidents: ");
                    accidentData[i][1] = scanner.nextInt();
                }

                // Calculate the total number of road accidents for each city
                int[] totalAccidents = new int[3];
                for (int i = 0; i < accidentData.length; i++) {
                    totalAccidents[i] = accidentData[i][0] + accidentData[i][1];
                }

                // Find the city with the highest number of road accidents
                int maxAccidents = totalAccidents[0];
                int maxIndex = 0;
                for (int i = 1; i < totalAccidents.length; i++) {
                    if (totalAccidents[i] > maxAccidents) {
                        maxAccidents = totalAccidents[i];
                        maxIndex = i;
                    }
                }

                // Display and show the recorded road accidents for each city and vehicle type
                System.out.println("\nRecorded Road Accidents:");
                System.out.println("----------------------------------");
                System.out.println("City\tCar\tMotorbike");
                System.out.println("----------------------------------");

                for (int i = 0; i < accidentData.length; i++) {
                    System.out.print(cityNames[i] + "\t");
                    for (int j = 0; j < accidentData[i].length; j++) {
                        System.out.print(accidentData[i][j] + "\t");
                    }
                    System.out.println();
                }

                // Display the total number of road accidents for each city
                System.out.println("\nROAD ACCIDENT TOTALS FOR EACH CITY:");
                System.out.println("----------------------------------");
                System.out.println("City\tTotal Accidents");
                System.out.println("----------------------------------");

                for (int i = 0; i < totalAccidents.length; i++) {
                    System.out.println(cityNames[i] + "\t" + totalAccidents[i]);
                }

                // Display the city with the highest number of road accidents
                System.out.println("\nCITY WITH THE MOST VEHICLE ACCIDENTS:");
                System.out.println("----------------------------------");
                System.out.println(cityNames[maxIndex]);
                System.out.println("----------------------------------");
            }
        }
