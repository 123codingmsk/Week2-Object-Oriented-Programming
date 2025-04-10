import java.util.Scanner;

class BMI {
    
    public static double cmtometer(int num) {
        return num * 0.01;
    }

    public static double[][] findBMIofeach(double[][] weightheights) {
        double[][] temp = new double[10][3];
        
        for (int i = 0; i < 10; i++) {
            temp[i][0] = weightheights[i][0];  
            temp[i][1] = cmtometer((int)weightheights[i][1]); 
            temp[i][2] = temp[i][0] / (temp[i][1] * temp[i][1]); 
        }
        return temp;
    }

    public static String[][] dispayTable(double[][] arr) {
        String[][] temp = new String[10][4];

        for (int i = 0; i < 10; i++) {
            temp[i][0] = String.valueOf(arr[i][0]); 
            temp[i][1] = String.valueOf(arr[i][1]); 
            temp[i][2] = String.format("%.2f", arr[i][2]); 

            if (arr[i][2] <= 18.4) {
                temp[i][3] = "Underweight";
            } else if (arr[i][2] <= 24.9) {
                temp[i][3] = "Normal";
            } else if (arr[i][2] <= 38.9) {
                temp[i][3] = "Overweight";
            } else {
                temp[i][3] = "Obese";
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double[][] weightheights = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weightheights[i][0] = scn.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            weightheights[i][1] = scn.nextDouble();
        }

        double[][] arr1 = findBMIofeach(weightheights);
        String[][] arr2 = dispayTable(arr1);

        System.out.printf("\n%-10s %-10s %-10s %-15s\n", "Weight", "Height(m)", "BMI", "Category");
        System.out.println("------------------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", arr2[i][0], arr2[i][1], arr2[i][2], arr2[i][3]);
        }

        scn.close();
    }
}
