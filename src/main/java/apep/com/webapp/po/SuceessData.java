package apep.com.webapp.po;

/**
 * Created by MACHENIKE on 2018/4/9.
 */
public class SuceessData {
    private Boolean success;
    private InnerClass2 innerClass2;
    private String OrderNo;
    private String cerNo;
    private String loanAmt;

    public SuceessData(Boolean success, InnerClass2 innerClass2, String orderNo, String cerNo, String loanAmt) {
        this.success = success;
        this.innerClass2 = innerClass2;
        OrderNo = orderNo;
        this.cerNo = cerNo;
        this.loanAmt = loanAmt;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public InnerClass2 getInnerClass2() {
        return innerClass2;
    }

    public void setInnerClass2(InnerClass2 innerClass2) {
        this.innerClass2 = innerClass2;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String orderNo) {
        OrderNo = orderNo;
    }

    public String getCerNo() {
        return cerNo;
    }

    public void setCerNo(String cerNo) {
        this.cerNo = cerNo;
    }

    public String getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(String loanAmt) {
        this.loanAmt = loanAmt;
    }
}
