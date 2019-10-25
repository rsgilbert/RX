import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

public class HelloRx {
    public static void hello(String... args) {
        Flowable.fromArray(args).subscribe(s -> System.out.println(s));
    }

    public static void hi(String... args) {
        Flowable.fromArray(args).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println("Hi " + s);
            }
        });
    }

    public static void main(String[] args) {
        hello("Jackie", "Tomcat", "Oniell");
        hi("Me", "Myself", "I");
    }
}