package com.taotao.file;

import java.util.Comparator;

public class ComparentByLen implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int num = s1.length() - s2.length();
		return num == 0 ?s1.compareTo(s2):num;
	}

}
