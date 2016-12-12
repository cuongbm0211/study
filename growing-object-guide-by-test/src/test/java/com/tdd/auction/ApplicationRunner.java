package com.tdd.auction;

/**
 * Created by CuongBM on 11/27/2016.
 */
public class ApplicationRunner {
    public static final String SNIPER_ID = "sniper";
    public static final String SNIPER_PASSWORD = "sniper";
    private static final String XMPP_HOSTNAME = "localhost";
    private static final String STATUS_JOINING = "joining";
    private static final String STATUS_LOST = "lost";
    private AuctionSniperDriver driver;

    public void startBiddingIn(final FakeAuctionServer auction) {
        Thread thread = new Thread("Test application"){ // 1
            @Override
            public void run() {
                try {
                    Main.main(XMPP_HOSTNAME, SNIPER_ID, SNIPER_PASSWORD, auction.getItemId()); // 2
                } catch (Exception e) {
                    e.printStackTrace(); // 3
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
        driver = new AuctionSniperDriver(1000); // 4
        driver.showSniperStatus(STATUS_JOINING); // 5
    }

    public void showSniperHasLostAuction() {
        driver.showSniperStatus(STATUS_LOST); // 6
    }

    public void stop() {
        if (driver != null) {
            driver.dispose(); // 7
        }
    }
}
