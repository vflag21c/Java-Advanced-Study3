package lambda.lambda6;

public class OuterMain {

    private String message = "외부 클래스";

    public void execute() {
        Runnable runnable = new Runnable() {

            private String message = "익명 클래스";
            
            @Override
            public void run() {
                //익명 클래스 this 는 자기 자신의 인스턴스를 가리킴
                System.out.println("this = " + this);
                System.out.println("this.getClass() = " + this.getClass());
                System.out.println("this.message = " + this.message);
            }
        };

        Runnable lambda = () -> {
            //람다에서의 this는 람다가 선언된 클래스의 인스턴스를 가리킴
            System.out.println("this = " + this);
            System.out.println("this.getClass() = " + this.getClass());
            System.out.println("this.message = " + this.message);
        };

        runnable.run();
        System.out.println("-----------");
        lambda.run();
    }


    public static void main(String[] args) {
        OuterMain outer = new OuterMain();
        System.out.println("outer = " + outer);
        outer.execute();
    }
}
