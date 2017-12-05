public class Hw4Task4 {
    public static void main(String[] args) {

      int a =  getMax(5,6);
        System.out.println(a);

     Float b = getMax(7.7f,5.7f);
        System.out.println(b);
    }

    public static Float getMax(float a , float b) {

    float res = 0;

    if (a > b)
        res = a;
    else if (a < b)
        res = b;

    return res;
}


    public static Integer getMax(int a, int b) {

        int res = 0;

        if (a > b)
            res = a;
        else if (a < b)
            res = b;


        return res;
    }

}

