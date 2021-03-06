package com.chengjs.cjsssmsweb.common.util.codec;

import com.chengjs.cjsssmsweb.common.util.StringUtil;
import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * MD5Util: 基于shiro的MD5加密
 * author: <a href="mailto:chengjs_minipa@outlook.com">chengjs</a>, version:1.0.0, 2017/8/25
 */
public class MD5Util {

  public static final String DEFAULT_SALT = "minipa_chengjs";

  /**
   * 指定加密盐
   * @param str
   * @param salt
   * @return
   */
  public static String md5(String str, String salt){
    if (StringUtil.isNullOrEmpty(salt)) {
      salt = DEFAULT_SALT;
    }
    return new Md5Hash(str,salt).toString() ;
  }

  /**
   * 采用默认加密盐
   * @param str
   * @return
   */
  public static String md5(String str){
    return new Md5Hash(str,DEFAULT_SALT).toString() ;
  }

  public static void main(String[] args) {
    String md5 = md5("123456", DEFAULT_SALT) ;
    System.out.println(md5); // 119d3a4d2dfbca3d23bd1c52a1d6a6e6
  }

}
