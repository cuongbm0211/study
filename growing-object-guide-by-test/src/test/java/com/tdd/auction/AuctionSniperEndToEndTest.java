package com.tdd.auction;

import org.junit.Test;

/**
 * Created by CuongBM on 11/27/2016.
 */
public class AuctionSniperEndToEndTest {

    private static final FakeAuctionServer auction = new FakeAuctionServer("item-54321");
    private static final ApplicationRunner application = new ApplicationRunner();

    @Test
    public void sniperJoinsAuctionUtilAuctionCloses() {
        auction.startSellingItem();
        application.startBiddingIn(auction);
        auction.hasReceiveJoinRequestFromSniper();
        auction.announceClosed();
        application.showSniperHasLostAuction();
    }
}
