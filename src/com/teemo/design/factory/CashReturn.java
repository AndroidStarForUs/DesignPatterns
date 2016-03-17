/*
*****************************************************************************************
* @file CashReturn.java
*
* @brief 
*
* Code History:
*       2016-3-16  下午7:50:04  Teemo , initial version
*
* Code Review:
*
********************************************************************************************
*/

package com.teemo.design.factory;
/**
 * @brief 
 * 
 * @author Teemo
 *
 * @date 2016-3-16 下午7:50:04
 */
public class CashReturn extends CashSuper {
    private double mMoneyCodition = 0.0d;
    private double mMoneyReturn = 0.0d;

    public CashReturn() {
    }

    /**
     * @brief 返利收费
     * @param moneyCodition 返利条件
     * @param moneyReturn 返利值
     */
    public CashReturn(double moneyCodition, double moneyReturn) {
        this.mMoneyCodition = moneyCodition;
        this.mMoneyReturn = moneyReturn;
    }

    public void setReturn(double moneyCodition, double moneyReturn) {
        this.mMoneyCodition = moneyCodition;
        this.mMoneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= mMoneyCodition) {
            result = money - Math.floor(money - mMoneyCodition) * mMoneyReturn;
        }
        return result;
    }

}
