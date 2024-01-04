package com.oracle;

import in.ashokit.security.PwdUtils;

public class Test {
	public static void main(String[] args) {

		PwdUtils password = new PwdUtils();

		String encodedpwd1 = password.encodePwd("Mayur@10010");

		System.out.println(encodedpwd1);
	}
}
