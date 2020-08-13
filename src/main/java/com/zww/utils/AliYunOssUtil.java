//package com.zww.utils;
//
//import com.aliyun.oss.OSS;
//import com.aliyun.oss.OSSClientBuilder;
//
//import java.io.*;
//
//public class AliYunOssUtil {
//
//    // Endpoint以杭州为例，其它Region请按实际情况填写。
//    private static String endpoint = "xxxx";
//    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
//    private static String accessKeyId = "xxxx";
//    private static String accessKeySecret = "xxxx";
//
//    //文件上传 byte数组
//    public static void upload(byte[] bytes,String file){
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId,accessKeySecret);
//        // 上传Byte数组。
//        try {
//            ossClient.putObject("forum-zww", file, new ByteArrayInputStream(bytes));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        // 关闭OSSClient。
//        ossClient.shutdown();
//    }
//
//    //文件上传 文件路径
//    public static void upload(String filePath,String fileName) {
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//        // 上传文件流。
//        InputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream(filePath);
//            ossClient.putObject( "forum-zww",fileName, inputStream);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        // 关闭OSSClient。
//        ossClient.shutdown();
//    }
//
//    //文件删除
//    public static void delete(String fileName){
//        String bucketName = "forum-zww";
//        String objectName = fileName;
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//        // 删除文件。如需删除文件夹，请将ObjectName设置为对应的文件夹名称。如果文件夹非空，则需要将文件夹下的所有object删除后才能删除该文件夹。
//        ossClient.deleteObject(bucketName, objectName);
//        // 关闭OSSClient。
//        ossClient.shutdown();
//    }
//
//}
