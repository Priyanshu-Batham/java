import java.io.*;

//parent class
class Npgc{
    String name;
    String rollNo;
    String address;
    String mobileNo;

    Npgc(String name, String rollNo, String address, String mobileNo){
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
        this.mobileNo = mobileNo;
    }
}
// -------------------------------------------->>>>>>>>
//Child class 1
class Bca extends Npgc {
    String subjects[];
    int marks[];
    float cgpa;

    Bca(String name, String rollNo, String address, String mobileNo, String subjects[], int marks[], float cgpa){
        super(name, rollNo, address, mobileNo);
        this.subjects = subjects;
        this.marks = marks;
        this.cgpa = cgpa;
    }
}
//Child class 2
class Bba extends Npgc {
    String subjects[];
    int marks[];
    float cgpa;

    Bba(String name, String rollNo, String address, String mobileNo, String subjects[], int marks[], float cgpa){
        super(name, rollNo, address, mobileNo);
        this.subjects = subjects;
        this.marks = marks;
        this.cgpa = cgpa;
    }
}
//Child class 3
class Bcomm extends Npgc {
    String subjects[];
    int marks[];
    float cgpa;

    Bcomm(String name, String rollNo, String address, String mobileNo, String subjects[], int marks[], float cgpa){
        super(name, rollNo, address, mobileNo);
        this.subjects = subjects;
        this.marks = marks;
        this.cgpa = cgpa;
    }
}
// ------------------------------------------------------------->>>>>>
//main class to use above classes
class Information {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many Students data to be input: ");
        int n = Integer.parseInt(br.readLine());
        Bca bcaStudents[] = new Bca[n];
        Bba bbaStudents[] = new Bba[n];
        Bcomm bcommStudents[] = new Bcomm[n];
        int bcaCount = 0, bbaCount = 0, bcommCount = 0;


        while(n-- > 0){
            System.out.print("course: ");
            String course = br.readLine();
            System.out.print("Name: ");
            String name = br.readLine();
            System.out.print("Roll No: ");
            String rollNo = br.readLine();
            System.out.print("Address: ");
            String address = br.readLine();
            System.out.print("Mobile NO: ");
            String mobileNo = br.readLine();
            System.out.print("5 Subjects: ");
            String subjects[] = new String[5];
            for(int i = 0; i<5; i++) subjects[i] = br.readLine();
            System.out.print("5 Subjects marks: ");
            int marks[] = new int[5];
            for(int i = 0; i<5; i++) marks[i] = Integer.parseInt(br.readLine());
            System.out.print("Cgpa: ");
            float cgpa = Float.parseFloat(br.readLine());

            if(course.equalsIgnoreCase("Bca")){
                bcaStudents[bcaCount++] = new Bca(name, rollNo, address, mobileNo, subjects, marks, cgpa);
            }
            else if(course.equalsIgnoreCase("Bba")){
                bbaStudents[bbaCount++] = new Bba(name, rollNo, address, mobileNo, subjects, marks, cgpa);
            }
            else if(course.equalsIgnoreCase("Bcomm")){
                bcommStudents[bcommCount++] = new Bcomm(name, rollNo, address, mobileNo, subjects, marks, cgpa);
            }
            else{
                System.out.println("Invalid Course Name");
            }
        }
        //fetching some sample data for testing
        System.out.println(bcaStudents[0].name);
        System.out.println(bcaStudents[0].cgpa);
    }
}