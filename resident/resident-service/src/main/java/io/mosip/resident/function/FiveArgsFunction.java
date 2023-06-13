package io.mosip.resident.function;

/**
 * 
 * @author Loganathan Sekar
 *
 * @param <T> Type Argument 1
 * @param <U> Type Argument 2
 * @param <V> Type Argument 3
 * @param <W> Type Argument 4
 * @param <W> Type Argument 5
 * @param <R> Return type
 */
@FunctionalInterface
public interface FiveArgsFunction<T, U, V, W, X, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param u the second function argument
     * @param v the third function argument
     * @param w the fourth function argument
     * @param w the fifth function argument
     * @return the function result
     */
    R apply(T t, U u, V v, W w, X x);

}
