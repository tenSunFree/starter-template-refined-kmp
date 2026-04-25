/*
 *
 *  *
 *  *  * Copyright (c) 2026
 *  *  *
 *  *  * Author: Athar Gul
 *  *  * GitHub: https://github.com/DevAtrii/Kmp-Starter-Template
 *  *  * YouTube: https://www.youtube.com/@devatrii/videos
 *  *  *
 *  *  * All rights reserved.
 *  *
 *  *
 *
 */

package com.sun.kmpstartertemplaterefined.feature_purchases_domain.di

import com.sun.kmpstartertemplaterefined.feature_purchases_domain.logics.GetCurrentPurchaseStatusLogic
import com.sun.kmpstartertemplaterefined.feature_purchases_domain.logics.GetDiscountProductLogic
import com.sun.kmpstartertemplaterefined.feature_purchases_domain.logics.GetPaywallMetadataLogic
import com.sun.kmpstartertemplaterefined.feature_purchases_domain.logics.GetProductsLogic
import com.sun.kmpstartertemplaterefined.feature_purchases_domain.logics.PurchasesLogics
import com.sun.kmpstartertemplaterefined.feature_purchases_domain.logics.RestorePurchasesLogic
import com.sun.kmpstartertemplaterefined.feature_purchases_domain.logics.SignInToPurchaseLogic
import com.sun.kmpstartertemplaterefined.feature_purchases_domain.logics.StartPurchaseLogic
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val purchasesDomainModule = module {
    singleOf(::GetDiscountProductLogic)
    singleOf(::GetPaywallMetadataLogic)
    singleOf(::GetProductsLogic)
    singleOf(::RestorePurchasesLogic)
    singleOf(::SignInToPurchaseLogic)
    singleOf(::StartPurchaseLogic)
    singleOf(::GetCurrentPurchaseStatusLogic)

    singleOf(::PurchasesLogics)
}