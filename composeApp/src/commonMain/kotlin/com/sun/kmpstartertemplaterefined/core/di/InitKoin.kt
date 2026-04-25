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

package com.sun.kmpstartertemplaterefined.core.di

import com.sun.kmpstartertemplaterefined.core.KmpAppInitializer
import com.sun.kmpstartertemplaterefined.core.datastore.di.dataStoreModule
import com.sun.kmpstartertemplaterefined.core.events.di.eventsModule
import com.sun.kmpstartertemplaterefined.core.navigation.navigationModule
import com.sun.kmpstartertemplaterefined.feature_analytics_data.di.analyticsDataModule
import com.sun.kmpstartertemplaterefined.feature_core_data.di.coreDataModule
import com.sun.kmpstartertemplaterefined.feature_core_domain.di.coreDomainModule
import com.sun.kmpstartertemplaterefined.feature_core_presentation.di.corePresentationModule
import com.sun.kmpstartertemplaterefined.feature_database.di.databaseModule
import com.sun.kmpstartertemplaterefined.feature_notifications_core.notificationsCoreModule
import com.sun.kmpstartertemplaterefined.feature_notifications_local.notificationsLocalModule
import com.sun.kmpstartertemplaterefined.feature_notifications_push.notificationsPushModule
import com.sun.kmpstartertemplaterefined.feature_purchases_data.di.purchasesDataModule
import com.sun.kmpstartertemplaterefined.feature_purchases_domain.di.purchasesDomainModule
import com.sun.kmpstartertemplaterefined.feature_purchases_presentation.di.purchasesPresentationModule
import com.sun.kmpstartertemplaterefined.feature_remote_config_data.di.remoteConfigDataModule
import com.sun.kmpstartertemplaterefined.feature_remote_config_domain.di.remoteConfigDomainModule
import com.sun.kmpstartertemplaterefined.feature_resources.di.resourceModule
import com.sun.kmpstartertemplaterefined.feature_your_feature_data.di.featureYourDataModule
import com.sun.kmpstartertemplaterefined.feature_your_feature_domain.di.featureYourDomainModule
import com.sun.kmpstartertemplaterefined.feature_your_feature_presentation.di.featureYourPresentationModule
import com.sun.kmpstartertemplaterefined.utils.di.utilsModule
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

private val starterModules = module {
    includes(
        /*Starter Core Modules*/
        coreDataModule,
        coreDomainModule,
        corePresentationModule,
        utilsModule,
        eventsModule,
        dataStoreModule,
        /*Feature: Database*/
        databaseModule,
        /*Feature: Purchases*/
        purchasesDataModule,
        purchasesDomainModule,
        purchasesPresentationModule,
        /*Feature: Analytics*/
        analyticsDataModule,
        /*Feature: Navigation*/
        navigationModule,
        /*Feature: RemoteConfig*/
        remoteConfigDataModule,
        remoteConfigDomainModule,
        resourceModule,
        /*Feature: Notifications*/
        notificationsCoreModule,
        notificationsLocalModule,
        notificationsPushModule,
    )
}

private val kmpAppInitializerModule = module {
    singleOf(::KmpAppInitializer)
}

internal fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(
            starterModules,
            kmpAppInitializerModule,
            /* Add Modules Here */
            featureYourDataModule,
            featureYourDomainModule,
            featureYourPresentationModule
        )
    }
}



















