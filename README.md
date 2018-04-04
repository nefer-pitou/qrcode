# 二维码图片生成和解析
- 一种通过zxing来生成和解析二维码
- 一种是通过jquery-qrcode脚本来生成二维码

## 通过zxing方式生成二维码并进行解析
- 在pom.xml文件中添加相关依赖：<br>
    <dependency>
	<groupId>com.google.zxing</groupId>
	<artifactId>core</artifactId>
	<version>3.3.2</version>
    </dependency>

    <dependency>
	<groupId>com.google.zxing</groupId>
	<artifactId>javase</artifactId>
	<version>3.3.2</version>
    </dependency>

    <dependency>
	<groupId>com.google.zxing</groupId>
	<artifactId>zxing-parent</artifactId>
	<version>3.3.2</version>
    </dependency>

## 通过jquery-qrcode生成二维码

- 从 [jquery-qrcode项目GitHub](https://github.com/jeromeetienne/jquery-qrcode)下载源码，解压后将其中的jquery.qrcode.min.js文件复制到自己的项目中，由于该js文件要依赖与jquery的js文件，所以也要将jquery-2.0.0.min.js文件复制到自己的项目中

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>生成二维码图片</title>
    <script type="text/javascript" src="../js/jquery-2.0.0.min.js"></script><!--这个要先引入-->
    <script type="text/javascript" src="../js/jquery.qrcode.min.js"></script>
</head>
<body>
    <div id="qrcode"></div><!-- 该div要位于下面的<script>之前-->
    <script type="text/javascript">
        jQuery('#qrcode').qrcode("www.baidu.com");
    </script>
</body>
</html>


