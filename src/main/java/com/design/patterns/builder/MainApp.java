package com.design.patterns.builder;

public class MainApp {

    public static void main(String... args) {
        StockRequest stockRequest = StockRequest.builder().symbol("C")
                .askPrice(true)
                .bidPrice(false)
                .stockMarket("NASDAQ")
                .volume(true)
                .build();

        System.out.println(stockRequest);
    }

}
