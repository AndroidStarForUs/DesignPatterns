/*
*****************************************************************************************
* @file CashFactory.java
*
* @brief 
*
* Code History:
*       2016-3-16  下午7:56:51  Teemo , initial version
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
 * @date 2016-3-16 下午7:56:51
 */
public class CashFactory {
    public static final int CASH_TYPE_NORMAL = 0;
    public static final int CASH_TYPE_REBATE = 1;
    public static final int CASH_TYPE_RETURN = 2;

    public static CashSuper createCashAccept(int cashType) {
        CashSuper cashSuper = null;
        switch (cashType) {
        case CASH_TYPE_NORMAL:
            cashSuper = new CashNormal();
            break;
        case CASH_TYPE_REBATE:
            cashSuper = new CashRebate();
            break;
        case CASH_TYPE_RETURN:
            cashSuper = new CashReturn();
            break;
        }
        return cashSuper;
    }

}
