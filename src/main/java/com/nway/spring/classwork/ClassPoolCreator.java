package com.nway.spring.classwork;

import org.springframework.util.ClassUtils;

import javassist.ClassPool;
import javassist.LoaderClassPath;

/**
 * 
 * 
 * @author zdtjss@163.com
 *
 * @since 2015-08-11
 */
public class ClassPoolCreator {

	public static ClassPool getClassPool() {

		ClassPool classPool = ClassPool.getDefault();

		classPool.appendClassPath(new LoaderClassPath(ClassUtils.getDefaultClassLoader()));

		return classPool;
	}
}
