package com.tdd.auction;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;

/**
 * Created by CuongBM on 11/27/2016.
 */
public class FakeAuctionServer {
    public static final String ITEM_ID_AS_LOGIN = "auction-%s";
    public static final String AUCTION_RESOURCE = "Auction";
    public static final String XMPP_HOSTNAME = "localhost";
    public static final String AUCTION_PASSWORD = "auction";

    private String itemId;
    private final XMPPConnection connection;

    public FakeAuctionServer(String itemId) {
        this.itemId = String.format(ITEM_ID_AS_LOGIN, itemId);
        this.connection = new XMPPTCPConnection(ITEM_ID_AS_LOGIN, AUCTION_PASSWORD, XMPP_HOSTNAME);
    }

    public static void main(String[] args) {
        System.out.println(String.format(ITEM_ID_AS_LOGIN, "itemId"));
    }

    public void startSellingItem() {
    }

    public void hasReceiveJoinRequestFromSniper() {
    }

    public void announceClosed() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
