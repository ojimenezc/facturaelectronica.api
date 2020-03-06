/*
 * Copyright (c) 2020.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.tasks;

import com.softcorp.cr.facturaelectronica.api.entities.DocumentsEntity;
import com.softcorp.cr.facturaelectronica.api.helpers.DocumentsHelper;
import com.softcorp.cr.facturaelectronica.api.repositories.DocumentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class StatusScheduledTask {

    @Autowired
    DocumentsRepository documentsRepository;

    @Autowired
    DocumentsHelper documentsHelper;

    @Scheduled(fixedDelay = 2400000)
    public void getStatus() {

        ArrayList<DocumentsEntity> pendindDocuments = documentsRepository.getAllPendingDocuments();

        pendindDocuments.stream().forEach(doc -> {
            try {
                documentsHelper.processStatus(doc.getKey());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
