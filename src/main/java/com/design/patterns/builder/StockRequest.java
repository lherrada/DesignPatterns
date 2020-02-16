package com.design.patterns.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class StockRequest {

    String symbol;
    boolean askPrice;
    boolean bidPrice;
    String stockMarket;
    boolean volume;

    public static StockRequestBuilder builder() {
        return new StockRequestBuilder();
    }

    public static class StockRequestBuilder {
        private String symbol;
        private boolean askPrice;
        private boolean bidPrice;
        private String stockMarket;
        private boolean volume;

        public StockRequestBuilder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public StockRequestBuilder askPrice(boolean askPrice) {
            this.askPrice = askPrice;
            return this;
        }

        public StockRequestBuilder bidPrice(boolean bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }

        public StockRequestBuilder stockMarket(String stockMarket) {
            this.stockMarket = stockMarket;
            return this;
        }

        public StockRequestBuilder volume(boolean volume) {
            this.volume = volume;
            return this;
        }

        public StockRequest build() {
            return new StockRequest(this.symbol,
                    this.askPrice,
                    this.bidPrice,
                    this.stockMarket,
                    this.volume);
        }
    }
}