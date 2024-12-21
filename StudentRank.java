public class StudentRank {
    private String[] students;
    private int[] ranks;

    public StudentRank(String[] students, int[] ranks) {
        this.students = students;
        this.ranks = ranks;
    }

    public String highestRank() {
        int minRank = Integer.MAX_VALUE;
        String highestRankedStudent = null;

        for (int i = 0; i < ranks.length; i++) {
            if (ranks[i] < minRank) {
                minRank = ranks[i];
                highestRankedStudent = students[i];
            }
        }

        return highestRankedStudent;
    }

    public String lowestRank() {
        int maxRank = Integer.MIN_VALUE;
        String lowestRankedStudent = null;

        for (int i = 0; i < ranks.length; i++) {
            if (ranks[i] > maxRank) {
                maxRank = ranks[i];
                lowestRankedStudent = students[i];
            }
        }

        return lowestRankedStudent;
    }

    public static void main(String[] args) {
        String[] students = {"Alex", "Chris", "Sam"};
        int[] ranks = {3, 1, 2};
        
        StudentRank sr = new StudentRank(students, ranks);
        
        System.out.println(sr.highestRank()); 
        System.out.println(sr.lowestRank()); 
        
    }
}