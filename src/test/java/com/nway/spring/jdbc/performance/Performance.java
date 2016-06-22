package com.nway.spring.jdbc.performance;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

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
	public Computer getComputerById(int id);
	
	/**
	 * �й�������
	 * 
	 * @return
	 */
	@Query("select c from Computer c")
	public List<Computer> listComputer();

	/**
	 * �޹���������
	 * 
	 * @param id ����ID
	 * @return
	 */
	public Monitor getMonitorById(int id);

	/**
	 * �޹�������
	 * 
	 * @param num
	 * @return
	 */
	@Query("select m from Monitor m")
	public List<Monitor> listMonitor();
}
