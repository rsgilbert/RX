import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Launcher {
    public static void main(String[] args) {
        // Create an observable called mStrings with 3 emissions
        Observable<String> mStrings = Observable.just("One", "Two", "Three");

        // Create an observer to subscribe to mStrings so as to receive the items
        mStrings.subscribe(s -> System.out.println(s));

        System.out.println("**** Transformation using operators ****");

        // transform the emissions into the length of the emission
        mStrings.map(s -> s.length())
                .subscribe(s -> System.out.println(s));

        // Pushing an event
        Observable<Long> secondsInterval = Observable.interval(2, TimeUnit.SECONDS);

        secondsInterval.subscribe(s -> System.out.println(s));

        // hold main thread for sometime to allow the Observable to keep running
        sleep(10000);

    }

    // Pause the main thread so as it does not terminate while we are still waiting on the observable
    public static void sleep(long milliSeconds) {
        try {
            System.out.println("Going to sleep for " + milliSeconds + " ms");
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
