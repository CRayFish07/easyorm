package cn.chuanz.easyorm.util;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.lang.StringUtils;

/**
 * ���÷���
 * @author chuan.zhang
 *
 */
public class FuncStatic {

	/**
	 * ���������־
	 * @param e
	 * @return
	 */
	public static String errorTrace(Exception e){
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);  
		return e.toString();
 	}
	
	/**
	 * ƥ���ַ����е�ռλ�� ��:{0},{1}
	 * @param content
	 * @param arguments
	 * @return
	 */
	public static String format(String content, Object... arguments) {
		if (content == null)
			return "";
		String to = null;
		for (int i = 0; i < arguments.length; i++) {
			if (arguments[i] == null)
				to = "";
			else
				to = arguments[i].toString();

			content = StringUtils.replace(content, "{" + i + "}", to);
		}

		return content;
	}
	
	public static boolean checkIsEmpty(Object var) {
		if (var == null)
			return true;
		if (var.toString().equals(""))
			return true;
		return false;
	}
	
}
