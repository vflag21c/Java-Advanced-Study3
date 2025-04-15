package lambda.ex2;

public class ComposeExampleEx1 {

    static MyTransformer compose(MyTransformer f1, MyTransformer f2) {
        return s -> {
            String transform = f1.transform(s);
            return f2.transform(transform);
        };
    }

    public static void main(String[] args) {
        MyTransformer upper = s -> s.toUpperCase();
        MyTransformer addDeco = s -> "**" + s + "**";
        MyTransformer composeFunc = compose(upper, addDeco);

        String result = composeFunc.transform("hello");
        System.out.println("result = " + result);
    }
}
