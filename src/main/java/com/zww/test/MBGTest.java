//package com.zww.test;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.aliyun.oss.OSS;
//import com.aliyun.oss.OSSClientBuilder;
//import org.junit.Test;
//import org.mybatis.generator.api.MyBatisGenerator;
//import org.mybatis.generator.config.Configuration;
//import org.mybatis.generator.config.xml.ConfigurationParser;
//import org.mybatis.generator.internal.DefaultShellCallback;
//
//public class MBGTest {
//
////	public static void main(String[] args) throws Exception{
////
////		List<String> warnings = new ArrayList<String>();
////		boolean overwrite = true;
////		File configFile = new File("mbg.xml");
////		ConfigurationParser cp = new ConfigurationParser(warnings);
////		Configuration config = cp.parseConfiguration(configFile);
////		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
////		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
////		myBatisGenerator.generate(null);
////	}
//	@Test
//	public void test1() throws FileNotFoundException {
//		// Endpoint以杭州为例，其它Region请按实际情况填写。
//		String endpoint = "xxxx";
//		// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//		String accessKeyId = "xxxx";
//		String accessKeySecret = "xxxx";
//
//		// 创建OSSClient实例。
//		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//		// 上传文件流。
//		InputStream inputStream = new FileInputStream("C:\\Users\\ZWW\\Pictures\\本机照片\\1.png");
//		ossClient.putObject("forum-zww", "abc.png", inputStream);
//
//		// 关闭OSSClient。
//		ossClient.shutdown();
//	}
//
//
//
//}
