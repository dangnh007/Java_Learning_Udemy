package Old_Course;

public class ObjectOriented {
    // Khai bao doi tuong gom Ten, Tuoi, Luong
    // In ra Tong so Tuoi, Luong cao hon
    //Khai bao bien
    int age;
    String name;
    float salary;

    //Ham khai bao cac parameter cua doi tuong
    public ObjectOriented(String name, int age, float salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    //Viet Ham tinh tong tuoi
    //Ham ko co static phai goi qua doi tuong
    public int sumage(int a, int b) {
        int sum = a + b;
        return sum;
    }
    //Viet ham tinh ai cao luong hon
    //khi khai bao ham nay la static, goi thang truc tiep no ko can qua doi tuong
    //khong co void thi phai return value
    public static float maxsalary(float a, float b) {
        if (a >= b) {
            return (a);
        } else {
            return b;
        }
    }
    //Viet ham tinh tong luong
    public static void sumsalary(float a, float b) { // Start of sum
        float result = a + b;
        System.out.println("Sum is " + result);
    }


    public static void main(String[] args) {
        ObjectOriented Dang = new ObjectOriented("Dang", 20, 170000);
        ObjectOriented Phuong = new ObjectOriented("Phuong", 19, 180000);
        //phai goi ham qua doi tuong
        int sumage = Phuong.sumage(Dang.age, Phuong.age);
        System.out.println(sumage);
        //goi thang maxsalary ko can qua doi luong
        float highersalary = maxsalary(Dang.salary, Phuong.salary);
        System.out.println(highersalary);
        ObjectOriented.sumsalary(Dang.salary, Phuong.salary);

    }


}


