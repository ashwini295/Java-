package Novex_05112024_Oops.Novex_18112024_Oops_Exception_2;

public class Bank
{
    public Bank(String currency, Integer amount) {
        Currency = currency;
        Amount = amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public Integer getAmount() {
        return Amount;
    }

    private String Currency;
    private  Integer Amount;


    public Integer add(Bank bankName) throws Exception {
        if(!bankName.Currency.equalsIgnoreCase("INR"))
        {
            throw new Exception("Curremcy Mismatch Exception");
        }
        return bankName.Amount +  this.Amount;
    }
}
