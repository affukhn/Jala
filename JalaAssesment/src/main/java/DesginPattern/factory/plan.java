package DesginPattern.factory;

public abstract  class plan
{
    protected double rate;

    abstract void getRate();

    public void calculate(int units)
    {
        System.out.println(rate*units);

    }
}
