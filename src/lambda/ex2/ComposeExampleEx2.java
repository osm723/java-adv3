package lambda.ex2;

public class ComposeExampleEx2 {


    public static MyTransformer compose(MyTransformer toUpper, MyTransformer addStar) {
        return s -> addStar.transform(toUpper.transform(s));
    }


    public static void main(String[] args) {
        MyTransformer toUpper = s -> s.toUpperCase();
        MyTransformer addStar = s -> "**" + s + "**";

        MyTransformer compose = compose(toUpper, addStar);

        System.out.println("compose.transform(\"hello\") = " + compose.transform("hello"));
    }
}
