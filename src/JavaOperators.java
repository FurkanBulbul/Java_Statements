package Java_Application;

public class JavaOperators {

    public static void main(String[] args) {
        assignmentOperator();
        arithmeticOperator();
        relOperator();
        logical();

    }
    public static void assignmentOperator(){
        int nbrOne;
        nbrOne = 5;

        System.out.println(nbrOne);

    }

    
    public static void arithmeticOperator(){
        int a =2;
        int b =4;
        int result=0;

        result=a+b;
        System.out.println(result);
    }

    public static void relOperator(){
        int number1=10;
        int number2=5;

        if (number1>number2){
            System.out.println("number1 is greater than number2");

        }else {
            System.out.println("number2 is greater than number1");
        }

    }

    public static void logical(){
        int a=2;
        int b=4;
        int c=10;
        boolean resultOne;
        boolean resultTwo;

        resultOne = (a>b) || (c>b);
        System.out.println(resultOne);
    }
}
