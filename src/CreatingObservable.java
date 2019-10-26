import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class CreatingObservable {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(
                observableEmitter -> {
                    try {
                        observableEmitter.onNext("Hello RX");
                        observableEmitter.onNext("How are you doing");
                        observableEmitter.onNext("Are you OK?");
//                        throw new NullPointerException();
                        observableEmitter.onComplete();
                    } catch (Exception e) {
                        System.out.println("Getting an error");
                        observableEmitter.onError(e);
                    }
                }
        );
        source.subscribe(s -> System.out.println("Msg: " + s), e -> {
            System.out.println("An error occurred");
            e.printStackTrace();
        });

        System.out.println("*** MAP ***");

        source.map(String::length)
                .subscribe(i -> System.out.println("LENGTH: " + i));

        System.out.println("*** MAP FOLLOWED BY FILTER***");

        source.map(String::length)
                .filter(i -> i % 2 == 0)
                .subscribe(i ->  System.out.println("EVEN LENGTH: " + i));

        // Observable.just() : Invokes onNext() call for each item passed in to it
        //                  It takes in a maximum of 10 items
        Observable<Integer> integerSource = Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerSource.subscribe(i -> System.out.println(i));

        // Observable.fromIterable(): Emits items from an iterable type
        List<String> names = Arrays.asList("Peter", "Tom", "Rodney", "Mary", "Sera");
        Observable<String> namesSource = Observable.fromIterable(names);
        namesSource.subscribe(s -> System.out.println("Name: " + s));
    }
}
