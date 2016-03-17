/*
*****************************************************************************************
* @file CashNormal.java
*
* @brief 
*
* Code History:
*       2016-3-16  下午7:42:50  Teemo , initial version
*
* Code Review:
*
********************************************************************************************
*/

package com.teemo.design.factory;
/**
 * @brief 正常收费
 * 
 * @author Teemo
 *
 * @date 2016-3-16 下午7:42:50
 */
public class CashNormal extends CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }

}
