import io.reactivex.Observable;

public class Launcher {
    public static void main(String[] args) {
        // Create an observable called mStrings with 3 emissions
        Observable<String> mStrings = Observable.just("One", "Two", "Three");

        // Create an observer to subscribe to mStrings so as to receive the items
        mStrings.subscribe(s -> System.out.println(s));

    }
}
