/*
*****************************************************************************************
* @file CashRebate.java
*
* @brief 
*
* Code History:
*       2016-3-16  下午7:46:07  Teemo , initial version
*
* Code Review:
*
********************************************************************************************
*/

package com.teemo.design.factory;
/**
 * @brief 打折收费
 * 
 * @author Teemo
 *
 * @date 2016-3-16 下午7:46:07
 */
public class CashRebate extends CashSuper {

    private double mMoneyRebate;

    public CashRebate() {
    }

    /**
     * @brief 打折收费
     * @param moneyRebate 折扣率
     */
    public CashRebate(double moneyRebate) {
        this.mMoneyRebate = moneyRebate;
    }

    public void setRebate(double moneyRebate) {
        this.mMoneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * mMoneyRebate;
    }

}
