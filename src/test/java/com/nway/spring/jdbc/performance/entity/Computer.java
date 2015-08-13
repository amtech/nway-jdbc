package com.nway.spring.jdbc.performance.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "t_computer")
public class Computer {

	private int id;
	/** Ʒ�� **/
	private String brand;
	/** �ͺ� **/
	private String model;
	/** �۸� **/
	private float price;
	/** ������ţ�nway��spring jdbcʹ�� **/
	private int mainframeId;
	/** ���� **/
	private Mainframe mainframe;
	/** ��ʾ����ţ�nway��spring jdbcʹ�� **/
	private int monitorId;
	/** ��ʾ�� **/
	private Monitor monitor;
	/** ����ţ�nway��spring jdbcʹ�� **/
	private int mouseId;
	/** ��� **/
	private Mouse mouse;
	/** ���̱�ţ�nway��spring jdbcʹ�� **/
	private int keyboardId;
	/** ���� **/
	private Keyboard keyboard;
	/** �������� **/
	private Date productionDate;
	/** �豸ͼƬ **/
	private byte[] photo;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "mainframe_id")
	public Mainframe getMainframe() {
		return mainframe;
	}

	public void setMainframe(Mainframe mainframe) {
		this.mainframe = mainframe;
	}

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "monitor_id")
	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "mouse_id")
	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "keyboard_id")
	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "production_date")
	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	@Lob
	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Transient
	public int getMainframeId() {
		return mainframeId;
	}

	public void setMainframeId(int mainframeId) {
		this.mainframeId = mainframeId;
	}

	@Transient
	public int getMonitorId() {
		return monitorId;
	}

	public void setMonitorId(int monitorId) {
		this.monitorId = monitorId;
	}

	@Transient
	public int getMouseId() {
		return mouseId;
	}

	public void setMouseId(int mouseId) {
		this.mouseId = mouseId;
	}

	@Transient
	public int getKeyboardId() {
		return keyboardId;
	}

	public void setKeyboardId(int keyboardId) {
		this.keyboardId = keyboardId;
	}

	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Computer [id=");
		builder.append(id);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", model=");
		builder.append(model);
		builder.append(", price=");
		builder.append(price);
		builder.append(", mainframeId=");
		builder.append(mainframeId);
		builder.append(", mainframe=");
		builder.append(mainframe);
		builder.append(", monitorId=");
		builder.append(monitorId);
		builder.append(", monitor=");
		builder.append(monitor);
		builder.append(", mouseId=");
		builder.append(mouseId);
		builder.append(", mouse=");
		builder.append(mouse);
		builder.append(", keyboardId=");
		builder.append(keyboardId);
		builder.append(", keyboard=");
		builder.append(keyboard);
		builder.append(", productionDate=");
		builder.append(productionDate);
		builder.append(", photo=");
		builder.append(Arrays.toString(photo));
		builder.append("]");
		
		return builder.toString();
	}

}
