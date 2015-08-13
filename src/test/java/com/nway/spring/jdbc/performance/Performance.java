package com.nway.spring.jdbc.performance;

import java.util.List;

import com.nway.spring.jdbc.performance.entity.Computer;
import com.nway.spring.jdbc.performance.entity.Monitor;

public interface Performance {

	/**
	 * �й�����������
	 * 
	 * @param id
	 *            ����ID
	 * @return 
	 */
	public Computer getComputer(int id);

	/**
	 * �й�������
	 * 
	 * @return
	 */
	public List<Computer> listComputer();

	/**
	 * �޹���������
	 * 
	 * @param id ����ID
	 * @return
	 */
	public Monitor getMonitor(int id);

	/**
	 * �޹�������
	 * 
	 * @param num
	 * @return
	 */
	public List<Monitor> listMonitor(int num);
}
