package com.liyingyu.practicedemo.zxing;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 读取二维码图片信息到程序中
 *
 * @author Yingyu Li
 * @create 2018-04-04 14:25
 **/

public class ReadQRCode {
    public static void main(String[] args) throws IOException, NotFoundException {
        MultiFormatReader formatReader = new MultiFormatReader();
        File file = new File("assets/b41270f3740e39f0e5e7cd488d256ad9_ocLcO2lheA==.jpg");
        BufferedImage image = ImageIO.read(file);
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));
        Result result = formatReader.decode(binaryBitmap);
        image.flush();
        System.out.println("解析结果："+result.toString());
        System.out.println("二维码格式类型："+result.getBarcodeFormat());
        System.out.println("二维码文本内容："+result.getText());
    }
}
