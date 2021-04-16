package com.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QR {
    public static void generateQRCodeImage(String text, int width, int height, String filePath) {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        Path path = FileSystems.getDefault().getPath(filePath);

        try {
            MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
