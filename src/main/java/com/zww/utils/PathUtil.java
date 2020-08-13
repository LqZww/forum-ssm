package com.zww.utils;

public class PathUtil {
	
	private static String commonPath;	//公共路径
	private static String serverPath;	//服务器路径
	
	public static String getCommonPath() {
		
		serverPath=System.getProperty("catalina.home");
		commonPath = serverPath +PropertyUtil.getPropertiesPath().getProperty("webapps");
		return commonPath;
	}

	/**
	 * 帖子图片（题图）保存路径
	 * @return
	 */
	public static String getArticlePath() {
	
		return PropertyUtil.getPropertiesPath().getProperty("articlePath");
	}

	/**
	 * 帖子图片（配图）保存路径
	 * @return
	 */
	public static String getIllustrationPath() {

		return PropertyUtil.getPropertiesPath().getProperty("illustrationPath");
	}


	/**
	 * 用户头像保存路径
	 * @return
	 */
	public static String getUserPath() {
		
		return PropertyUtil.getPropertiesPath().getProperty("userPath");
	}

	/**
	 * 用户相册保存路径
	 * @return
	 */
	public static String getPhotoPath() {

		return PropertyUtil.getPropertiesPath().getProperty("photoPath");
	}

	/**
	 * 获取GeoLite2-City.mmdb文件全路径
	 * @return
	 */
	public static String getGeoLite2City() {
		
		return PropertyUtil.getPropertiesPath().getProperty("geoLite2City");
	}
}
