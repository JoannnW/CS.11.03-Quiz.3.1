public class Main {

    // Question 1 - calculateGrade
public static char calculateGrade(int grade){
        if (grade>=90){
            return 'A';
        } else if (grade<=89&&grade>=80) {
            return 'B';
        } else if (grade<=79&&grade>=70) {
            return 'C';
        }else if (grade<=69&&grade>=50) {
            return 'D';
        } else if (grade<=59&&grade>=60) {
            return 'E';
        }
        else {
            return 'F';
        }

}
    // Question 2 - fizzBuzz
public static String fizzBuzz(int num){
    if ((num%3==0)&&(num%5==0)){
        return "fizzbuzz";
    } else if (num%3==0&&!(num%5==0)) {
        return "fizz";
    } else if (!(num%3==0)&&(num%5==0)){
        return "buzz";
    }
    return "unlucky";
}
    // Question 3 - frontBack
public static String frontBack(String word){
    if(word.length()>=2){
        String front = word.substring(0,2);
        return front + word + front;
    }
    else {
        return word;
    }
}
    // Question 4 - twoAsOne
public static boolean twoAsOne(int a, int b, int c){
    int ab=a+b;
    int bc=b+c;
    int ca=c+a;
    if (ab==c){
        return true;
    } else if (bc==a) {
        return true;
    } else if (ca==b) {
        return true;
    }
    else {
        return false;
    }
}
    // Question 5 - endUp
public static String endUp(String word){
    if(word.length()>=3){
       String lastThree=word.substring(word.length()-3);
       String body=word.substring(0,word.length()-3);
       return body+lastThree.toUpperCase();
    }
    return word.toUpperCase();
}
}
