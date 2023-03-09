package chapter08.override;

// VIPCustomer 클래스는 Customer 클래스를 상속 받음
public class VIPCustomer extends Customer {
    private int agentID;    // VIP 고객 상담원 ID
    double saleRatio;       // VIP 할인율

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        // 할인된 가격을 계산하여 반환
        return price - (int)(price * saleRatio);
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    public String showVIPInfo() {
        return super.showCustomerInfo() + " VIP전용 담당 상담원 아이디는 " + agentID + "입니다.";
    }

    public int getAgentID() {
        return agentID;
    }
}
