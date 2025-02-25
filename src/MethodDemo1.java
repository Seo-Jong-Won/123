public class MethodDemo1 {
    public static void main(String[] args) {
        int result = add(2,3);
        System.out.println("result =" + result);
    } // end of main method

    static void method1() {
        System.out.println("반환값이 없는 method가 호출되었습니다.");
        // rethrn;
    }
    static  int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
} // end of class
