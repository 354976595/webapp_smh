package apep.com.webapp.po;

/**
 * Created by MACHENIKE on 2018/4/9.
 */
public class InnerClass2 {
    private String errorCode;
    private String errorMessage;

    @Override
    public String toString() {
        return "InnerClass2{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }

    public InnerClass2(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
