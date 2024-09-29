// package Projects;

public class Pan {
    private String panNumber;
    private String aadharNumber; //because we have linked aadhaar card with pan-card
    private String bankDetails;
    private String investments;

    public Pan(String panNumber, String aadharNumber, String bankDetails, String investments) {
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
        this.bankDetails = bankDetails;
        this.investments = investments;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public String getInvestments() {
        return investments;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public void setInvestments(String investments) {
        this.investments = investments;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "panNumber='" + panNumber + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investments='" + investments + '\'' +
                '}';
    }
}
