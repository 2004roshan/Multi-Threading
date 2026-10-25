import java.util.concurrent.CompletableFuture;

public class demo {
    public static void main(String[] args) {
        CompletableFuture<Integer> f1 =
                                    CompletableFuture.supplyAsync(()->10)
                                    .thenApply(result -> result*2);

        CompletableFuture<Void> f2 =
                                    CompletableFuture.supplyAsync(()->10)
                                    .thenAccept(result -> System.out.println(result));

        CompletableFuture<Void> f3 =
                                    CompletableFuture.supplyAsync(()->10)
                                    .thenRun(() -> System.out.println("Done"));

        CompletableFuture<Integer> f4 =
                                    CompletableFuture.supplyAsync(()->10);
        CompletableFuture<Integer> f5 =
                                    CompletableFuture.supplyAsync(()->20);

        CompletableFuture<Void> result = f4.thenCombine(f5, (a,b) ->a + b)
                                    .thenAccept(result2 -> System.out.println(result2));


//        try{
//            System.out.println(f1.get());
//            System.out.println(f2.get());
//        }catch(Exception e){}
    }
}
