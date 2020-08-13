package com.zww.utils;

public class PageUtil {

	/*------------------------------- 用户系统 -----------------------------------------*/
	/**
	 * 用户系统-帖子初始条数（第一页）
	 * @return
	 */
	public static int getArticlePageSize() {
	
		return Integer.parseInt(PropertyUtil.getPropertiesPage().getProperty("articlePageSize"));
	}

	/**
	 * 用户系统-帖子追加条数（出第一页外）
	 * @return
	 */
//	public static final String getArticleDefaultPageSize() {
//
//		return PropertyUtil.getPropertiesPage().getProperty("articleDefaultPageSize");
//	}
	/*------------------------------- 用户系统-end -----------------------------------------*/


	/*------------------------------- 管理系统 -----------------------------------------*/
	/**
	 * 管理系统-帖子初始条数（第一页）
	 * @return
	 */
	public static int getAdminArticlePageSize() {
		
		return Integer.parseInt(PropertyUtil.getPropertiesPage().getProperty("adminArticlePageSize"));
	}

	/**
	 * 管理系统-帖子追加条数（出第一页外）
	 * @return
	 */
//	public static int getAdminArticleDefaultPageSize() {
//
//		return Integer.parseInt(PropertyUtil.getPropertiesPage().getProperty("adminArticleDefaultPageSize"));
//	}

	/**
	 * 管理系统-用户初始条数（第一页）
	 * @return
	 */
	public static int getAdminUserPageSize() {
		
		return Integer.parseInt(PropertyUtil.getPropertiesPage().getProperty("adminUserPageSize"));
	}

	/**
	 * 管理系统-用户追加条数（出第一页外）
	 * @return
	 */
//	public static int getAdminUserDefaultPageSize() {
//
//		return Integer.parseInt(PropertyUtil.getPropertiesPage().getProperty("adminUserDefaultPageSize"));
//	}

	/**
	 * 管理系统-访问记录初始条数（第一页）
	 * @return
	 */
	public static int getAdminVisitPageSize() {

		return Integer.parseInt(PropertyUtil.getPropertiesPage().getProperty("adminVisitPageSize"));
	}

	/**
	 * 管理系统-访问记录追加条数（出第一页外）
	 * @return
	 */
//	public static int getAdminVisitDefaultPageSize() {
//
//		return Integer.parseInt(PropertyUtil.getPropertiesPage().getProperty("adminVisitDefaultPageSize"));
//	}
	/*------------------------------- 管理系统-end -----------------------------------------*/
}
