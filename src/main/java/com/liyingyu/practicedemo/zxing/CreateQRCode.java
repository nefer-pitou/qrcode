package com.liyingyu.practicedemo.zxing;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;



/**
 * 生成二维码
 *
 * @author Yingyu Li
 * @create 2018-04-04 12:08
 **/

public class CreateQRCode {
    public static void main(String[] args) throws WriterException, IOException {
        int width = 300;
        int height = 300;
        //图片的保存格式
        String format = "png";
        //二维码内容
        String content = "www.hupu.com";

        //定义二维码的参数
        HashMap hints = new HashMap();
        //二维码所存储的信息的使用的字符集
       hints.put(EncodeHintType.CHARACTER_SET,"utf-8");
       //纠错等级
       hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
       //白色边框的大小
       hints.put(EncodeHintType.MARGIN,2);

       //生成二维码
        /**
         * content  二维码内容
         * BarcodeFormat.QR_CODE  二维码的格式
         * width  二维码的宽度
         * height 二维码的高度
         * hints 二维码的参数信息Map
         */
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
        Path file = new File("assets/myQrcode.png").toPath();
        //在指定的路径生成图片
        MatrixToImageWriter.writeToPath(bitMatrix,format,file);

    }
}
