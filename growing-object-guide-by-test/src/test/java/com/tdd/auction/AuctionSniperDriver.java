package com.tdd.auction;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JLabelDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;
import org.hamcrest.CoreMatchers;

/**
 * Created by CuongBM on 12/11/2016.
 */
public class AuctionSniperDriver extends JFrameDriver{

    public AuctionSniperDriver(int timeoutMillis) {
        super(new GesturePerformer(),
                JFrameDriver.topLevelFrame(
                        named(Main.MAIN_WINDOW_NAME),
                        showingOnScreen()),
                new AWTEventQueueProber(timeoutMillis, 100));
    }

    public void showSniperStatus(String statusText) {
        new JLabelDriver(this, named(Main.SNIPER_STATUS_NAME)).hasText(CoreMatchers.equalTo(statusText));
    }

    public static void main(String[] args) {
        AuctionSniperDriver auctionSniperDriver = new AuctionSniperDriver(2000);
        auctionSniperDriver.showSniperStatus("Hello");
    }
}
