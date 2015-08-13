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
package com.nway.spring.jdbc;

import java.util.List;

/**
 *
 *
 * @author zdtjss@163.com
 *
 * @since 2014��3��2��
 * @param <T>
 */
public class Pagination<T> {

	/**
	 * ҳ������ *
	 */
	private List<T> pageData;
	/**
	 * ҳ��������� *
	 */
	private int pageSize;
	/**
	 * ���ϲ�ѯ�����ļ�¼���� *
	 */
	private int totalCount;
	/**
	 * ��ҳ�� *
	 */
	private int pageCount;
	/**
	 * ��ǰҳ *
	 */
	private int currentPage;

	/**
	 *
	 * @param pageData
	 *            ҳ������
	 * @param totalCount
	 *            ���ϲ�ѯ�����ļ�¼����
	 * @param page
	 *            ��ǰҳ��
	 * @param pageSize
	 *            ҳ���������
	 */
	public Pagination(List<T> pageData, int totalCount, int page, int pageSize) {

		this.pageData = pageData;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.currentPage = page;

		init();
	}

	private void init() {
		if (totalCount > 0) {
			pageCount = (totalCount / pageSize);
			if (totalCount % pageSize > 0) {
				pageCount++;
			}
		}
	}

	public List<T> getPageData() {
		return pageData;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		builder.append("Pagination [totalCount=");
		builder.append(totalCount);
		builder.append(", pageCount=");
		builder.append(pageCount);
		builder.append(", currentPage=");
		builder.append(currentPage);
		builder.append(", pageSize=");
		builder.append(pageSize);
		builder.append(", pageData=");
		builder.append(pageData);
		builder.append("]");

		return builder.toString();
	}


}
