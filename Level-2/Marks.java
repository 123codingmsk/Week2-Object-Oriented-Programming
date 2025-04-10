import java.util.*;

class Marks {
    
    public static int gen2digitNums(){
		int randnum  = (int)(Math.random()*90) + 10;
		return randnum;
	}
	
	public static int[][] gensubjscores(int no_of_students){
		int[][] subjscores = new int[no_of_students][3];
		for(int i=0; i<no_of_students; i++){
			for(int j=0; j<3; j++){
				subjscores[i][j] = gen2digitNums();
			}
		}
		return subjscores;
	}
	
	public static double[][] totavgperc(int[][] scoresubjs){
		int no_of_students = scoresubjs.length;
		double[][] results2d = new double[no_of_students][3];
		for(int i=0; i<no_of_students; i++){
			int total = 0;
			for(int j=0; j<3; j++){
				total = total + scoresubjs[i][j];
			}
			double average = Math.round((double)total / 3 * 100.0) / 100.0;
			double perc = Math.round((total / 300.0) * 100 * 100.0) / 100.0;
			
			results2d[i][0] = total;
            results2d[i][1] = average;
            results2d[i][2] = perc;
		}
		return results2d;
	}

	 public static String[] assignGrades(double[][] results){
        int no_of_students = results.length;
        String[] grades = new String[no_of_students];

        for(int i = 0; i < no_of_students; i++){
            double perc = results[i][2];

            if(perc >= 80) grades[i] = "A";
            else if(perc >= 70) grades[i] = "B";
            else if(perc >= 60) grades[i] = "C";
            else if(perc >= 50) grades[i] = "D";
            else if(perc >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }
	
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

		System.out.println("No of Students: ");
		int no_of_students = scn.nextInt();
		
		int[][] scores = gensubjscores(no_of_students);
		
		double[][] totalavgperc = totavgperc(scores);
		String[] grades = assignGrades(totalavgperc);
		
		for(int i = 0; i < scores.length; i++){
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n", 
                              (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                              totalavgperc[i][0], totalavgperc[i][1], totalavgperc[i][2], grades[i]);
        }

        scn.close();
    }
}
