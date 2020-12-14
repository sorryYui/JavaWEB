package ServletDemoTest;
public class CalTest
{
    public CalTest()
    {
        firstNum = 0.0;
        secondNum = 0.0;
        operator = '+';
        res = 0.0;
    }
    public void setOperator(char operator)
    {
        this.operator = operator;
    }
    public char getOperator()
    {
        return operator;
    }
    public void setFirstNum(double firstNum)
    {
        this.firstNum = firstNum;
    }
    public double getFirstNum()
    {
        return firstNum;
    }
    public void setSecondNum(double secondNum)
    {
        this.secondNum = secondNum;
    }
    public double getSecondNum()
    {
        return secondNum;
    }
    public void setRes(double res)
    {
        this.res = res;
    }
    public double getRes()
    {
        return res;
    }
    public void cal() throws RuntimeException
    {
        switch (operator)
        {
            case '+' :
                res = firstNum + secondNum;break;
            case '-' :
                res = firstNum - secondNum;break;
            case '*' :
                res = firstNum * secondNum;break;
            case '/' :
                if (secondNum == 0)
                    throw new RuntimeException("second is zero!");
                else
                    res = firstNum / secondNum;
                break;
        }
    }
    private char operator;
    private double firstNum;
    private double secondNum;
    private double res;
}
