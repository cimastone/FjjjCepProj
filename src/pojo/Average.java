package pojo;

public class Average {
	
	private String code;
	private double deal_price;  // �ɽ��۸�
	private int deal_volume;  //�ɽ���
	private double aver_price;  //����
	private double total_money;  // �ܳɽ����
	private double total_volume;  //�ܳɽ���
	private String bs_flag;  // �����ķ���
	private String trade_time;  //����ʱ��
	private long time_stamp;  //ʱ���
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getDeal_price() {
		return deal_price;
	}
	public void setDeal_price(double dealPrice) {
		deal_price = dealPrice;
	}
	public int getDeal_volume() {
		return deal_volume;
	}
	public void setDeal_volume(int dealVolume) {
		deal_volume = dealVolume;
	}
	public double getAver_price() {
		return aver_price;
	}
	public void setAver_price(double averPrice) {
		aver_price = averPrice;
	}
	public double getTotal_money() {
		return total_money;
	}
	public void setTotal_money(double totalMoney) {
		total_money = totalMoney;
	}
	public double getTotal_volume() {
		return total_volume;
	}
	public void setTotal_volume(double totalVolume) {
		total_volume = totalVolume;
	}
	public String getBs_flag() {
		return bs_flag;
	}
	public void setBs_flag(String bsFlag) {
		bs_flag = bsFlag;
	}
	public String getTrade_time() {
		return trade_time;
	}
	public void setTrade_time(String tradeTime) {
		trade_time = tradeTime;
	}
	public long getTime_stamp() {
		return time_stamp;
	}
	public void setTime_stamp(long timeStamp) {
		time_stamp = timeStamp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String msg = "code:" +code+ ",deal_price:" +deal_price+ ",deal_volume:" +deal_volume+ "aver_price:" +aver_price+ "total_money:" +total_money+ "total_volume:" +total_volume+
						",bs_flag:" +bs_flag+ ",trade_time:" +trade_time+ ",time_stamp:" +time_stamp;
		return msg;
	}
	

}
