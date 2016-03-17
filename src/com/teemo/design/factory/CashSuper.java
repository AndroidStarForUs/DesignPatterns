/*
*****************************************************************************************
* @file CashSuper.java
*
* @brief 
*
* Code History:
*       2016-3-16  下午7:39:06  Teemo , initial version
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
 * @date 2016-3-16 下午7:39:06
 */
public abstract class CashSuper {
    /**
     * @brief 现金收取基类的抽象方法，收取现金.
     *
     * @param money 原价
     * @return 当前价格
     * double
     */
    public abstract double acceptCash(double money);
}
