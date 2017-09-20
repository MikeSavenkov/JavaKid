package ClassesAndObjects.BaseConstuctionsJava;

/**
 * Created by fazer on 12.04.2016.
 */
public class ReportCard {
    public static char convertGrades(int testResult){

        char grade;

        if(testResult >= 90){
            grade = 'A';
        }else if (testResult >= 80 && testResult < 90){
            grade = 'B';
        }else if (testResult >= 70 && testResult < 80){
            grade = 'C';
        }else {
            grade = 'D';
        }
        return grade;
    }

    public static void main(String[] args) {

        //ReportCard rc = new ReportCard();

        char yourGrade = convertGrades(88);
        System.out.println("Ваша первая оценка " + yourGrade);

        yourGrade = convertGrades(79);
        System.out.println("Ваша вторая оценка " + yourGrade);

    }



}
