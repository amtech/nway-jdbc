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
package com.nway.spring.jdbc.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nway.spring.classwork.DynamicObjectException;

/**
 *
 * @author zdtjss@163.com
 * @param <T> ListԪ������
 *
 * @since 2014-03-28
 */
public final class BeanListHandler<T> implements ResultSetExtractor<List<T>> {

    private final Class<T> type;
    
    private String querying;

    /**
     * ���Ǳ�������ڲ�ͬ ClassLoader��ʹ�ã����ﲻӦ���Ǿ�̬�� *
     */
    private final BeanProcessor beanProcessor = BeanProcessorFactory.getBeanProcessor();

    /**
     *
     *
     * @param type
     */
    public BeanListHandler(Class<T> type, String querying) {
        this.type = type;
        this.querying = querying;
    }

	@Override
	public List<T> extractData(ResultSet rs) throws DataAccessException {

		try {
			return beanProcessor.toBeanList(rs, type, querying);
		} catch (SQLException e) {
			throw new DynamicObjectException("��ȡ�б�ʧ�� [ " + this.type + " ]", e);
		}
	}

}
