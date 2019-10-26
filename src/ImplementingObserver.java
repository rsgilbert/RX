
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class ImplementingObserver {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Book", "Pen", "Rubber");

        Observer<Integer> myObserver = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("OnNext Called, " + integer);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("OnError called " + throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete called");

            }
        };
        source.map(String::length)
                .subscribe(myObserver);

        // Using lambdas to create Observers in the subscribe() method

        Consumer<String> onNext = s -> System.out.println("OnNextCalled: " + s);
        Action onComplete = () -> System.out.println("onComplete completed successfully");
        Consumer<Throwable> onError = Throwable::printStackTrace;

        source.subscribe(onNext, onError, onComplete);

    }
}