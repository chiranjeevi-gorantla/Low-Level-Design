import adapter.GPayToApplePayAdapter;
import applePay.ApplePay;
import googlePay.GooglePay;
import googlePay.GooglePayImpl;

public class Main {
    public static void main(String[] args) {

        // GooglePay object
        GooglePay googlePay = new GooglePayImpl();
        googlePay.setCustomerName("2423212122323");
        googlePay.setCustomerName("John Wick");
        googlePay.setCardExpMonth("09");
        googlePay.setCardExpYear("15");
        googlePay.setCardCVVNo((short)135);
        googlePay.setAmount(2999.00);

        //Before
        // callGooglePayAPI(googlePay);

        //After
        ApplePay applePay = new GPayToApplePayAdapter(googlePay);
        callApplePayAPI(applePay);
    }

    private static void callApplePayAPI(ApplePay applePay){
        System.out.println(applePay.getCardOwnerName());
        System.out.println(applePay.getCustCardNo());
        System.out.println(applePay.getCardExpMonthDate());
        System.out.println(applePay.getCVVNo());
        System.out.println(applePay.getTotalAmount());
    }
}