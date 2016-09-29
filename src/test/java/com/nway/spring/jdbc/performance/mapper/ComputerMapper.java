package com.nway.spring.jdbc.performance.mapper;

import java.util.List;

import com.nway.spring.jdbc.performance.entity.Computer;
import com.nway.spring.jdbc.performance.entity.Monitor;

public interface ComputerMapper extends GenericMapper
{
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
    public List<Monitor> listMonitor();
}
