public class Absentmuli {
    public static void main(String[] args) {
        String[][] students={{"01","madhu"},{"02","kobi"},{"03","ajee"},{"04","shahana"}};
        System.out.println("all students");
        for (int i = 0; i < students.length; i++) {
            System.out.println("rolleno: "+students[i][0] + "\t" +"name: "+students[i][1]);
        }
        String absentrollno="02";
        System.out.println("after remove the absent");
        for (int i=0; i<students.length; i++){
            if(!students[i][0].equals(absentrollno)){
                System.out.println("rollno: "+students[i][0] + "\t" +"name: " +students[i][1]);

            }
        }

    }
    
}
