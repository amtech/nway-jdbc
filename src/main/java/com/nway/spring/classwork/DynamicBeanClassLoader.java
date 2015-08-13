/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nway.spring.classwork;

import java.io.File;
import java.io.IOException;

import org.springframework.util.FileCopyUtils;

/**
 * ��̬�������
 * 
 * @author zdtjss@163.com
 * 
 * @since 2014-1-13
 */
public class DynamicBeanClassLoader extends ClassLoader {

	private String fileName;

	/**
	 * 
	 * @param classLoader �ϼ� ClassLoader
	 */
	public DynamicBeanClassLoader(ClassLoader classLoader) {

		super(classLoader);
	}

	/**
	 * 
	 * 
	 * @param classLoader �ϼ� ClassLoader
	 * @param fileName    class�ļ��� ( ����ָ��·����Ϣ )
	 */
	public DynamicBeanClassLoader(ClassLoader classLoader, String fileName) {

		super(classLoader);
		this.fileName = fileName;
	}

	/**
	 * ��һ�� byte ����ת��Ϊ Class ���ʵ��
	 * <p>
	 * 
	 * @param name
	 * @param classContent
	 * @return Class ʵ��,��������˱���·����������ʧ�ܣ��򷵻�null
	 */
	public Class<?> defineClass(String name, byte[] classContent) throws IOException {

		if (fileName != null) {
			write(classContent, fileName + ".class");
		}
		
		return super.defineClass(name, classContent, 0, classContent.length);
	}

	private void write(byte[] b, String filePath) throws IOException {

		File file = new File(filePath);
		File parentFile = file.getParentFile();

		if (!parentFile.exists()) {

			boolean isScuess = parentFile.mkdirs();

			if (!isScuess) {
				throw new IOException("�޷������ļ� " + parentFile.getAbsolutePath());
			}

		}

		FileCopyUtils.copy(b, file);
	}
}
