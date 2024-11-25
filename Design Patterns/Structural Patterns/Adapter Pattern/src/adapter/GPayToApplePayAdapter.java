package adapter;

import applePay.ApplePay;
import googlePay.GooglePay;

public class GPayToApplePayAdapter implements ApplePay {

    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    private final GooglePay googlePay;


    public GPayToApplePayAdapter(GooglePay googlePay) {
        this.googlePay = googlePay;
        setPropertiess();
    }

    @Override
    public String getCustCardNo() {
        return custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    @Override
    public Integer getCVVNo() {
        return cVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void setPropertiess() {
        setCustCardNo(this.googlePay.getCreditCardNo());
        setCardOwnerName(this.googlePay.getCustomerName());
        setCardExpMonthDate(this.googlePay.getCardExpMonth() + "/" + this.googlePay.getCardExpYear());
        setCVVNo(this.googlePay.getCardCVVNo().intValue());
        setTotalAmount(this.googlePay.getAmount());
    }


}
