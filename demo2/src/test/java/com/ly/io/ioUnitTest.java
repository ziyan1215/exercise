package com.ly.io;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

/**
* @author 作者
* @version 创建时间：2019年1月8日 上午11:48:06
* 类说明
*/
public class ioUnitTest {

	@Test
	public void test() throws IOException {
		ioUnit iounit =new ioUnit();
		iounit.PrintHex("a.txt");
	}

}
