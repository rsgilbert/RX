import io.reactivex.Observable;

/**
 * Cold Observables replay all emissions to every Observer subscribed to them
 */
public class ColdObservables {
    public static void main(String[] args) {
        Observable<String> sizes = Observable.just("Small", "Medium", "Large", "Extra Large");

        // first observer
        sizes.subscribe(s -> System.out.println("Observer 1 received : " + s));

        System.out.println("*** Second Observable ***");

        // second observer
        sizes.subscribe(t -> System.out.println("Observer 2 received : " + t));
    }
}
