package com.qrcode;

public class Main {
    private static final String qrImage = "QRToFacebook.png";

    public static void main(String[] args) {
        QR.generateQRCodeImage("www.facebook.com/inesghalumyan/", 300, 300, qrImage);
    }


}
